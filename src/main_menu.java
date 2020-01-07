import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import option_Implementations.Guess_Option;
import option_Implementations.Increment_Option;
import option_Implementations.Select_Window_Option;
import option_Implementations.Slider_Option;
/*************************************************
 * @author Derek Yee
 * This is the main class that is used to run the program. 
 * Utilizes JavaFX for GUI 
 ************************************************/
public class main_menu extends Application 
{
	public static void main(String[] args)
	{
		launch(args);
	}
	//global variables 
	Label welcomeL=new Label("Welcome to the inconvenient phone number entry application!"); 
	Label instructionL=new Label("Please select a choice: ");
	BorderPane root=new BorderPane();
	VBox menu=new VBox(10);
	GridPane options=new GridPane(); 
	Button guessB=new Button("Guess");
	Button selectionPanelB=new Button("Selection List"); 
	Button incrementB=new Button("Increment"); 
	Button sliderB=new Button("Slider"); 
	Button returnB=new Button("Submit");
	public void start(Stage myStage) 
	{
		Scene myScene=new Scene(root,700,700);
		options.setAlignment(Pos.CENTER);
		options.setHgap(10);options.setVgap(10);
		options.add(guessB, 0,0);options.add(selectionPanelB, 1, 0);options.add(incrementB, 2, 0);
		options.add(sliderB, 0, 1);
		menu.getChildren().addAll(welcomeL,instructionL,options);
		menu.setAlignment(Pos.CENTER);
		root.setCenter(menu);
		
		
		myStage.setScene(myScene);
		myStage.show();
		
		//button functionalities
		guessB.setOnAction(event->{
			VBox guessWindow=new VBox(); 
			guessWindow.setAlignment(Pos.CENTER);
			Guess_Option.createGuessPage(guessWindow);
			root.setCenter(guessWindow);
			HBox buttonHolder=new HBox(10); 
			Button yesB=new Button("Yes");Button noB=new Button("No"); 
			buttonHolder.getChildren().addAll(yesB,noB);
			buttonHolder.setAlignment(Pos.CENTER);
			guessWindow.getChildren().add(buttonHolder);
			yesB.setOnAction(event2->{
				root.setCenter(menu);
			});
			noB.setOnAction(event3->{
				((Label) guessWindow.getChildren().get(1)).setText(Guess_Option.genNumber());
			});
		});
		selectionPanelB.setOnAction(event->{
			VBox selectWindow=new VBox(10); 
			selectWindow.setAlignment(Pos.CENTER);
			Select_Window_Option.createSelectWindowOption(selectWindow); 
			selectWindow.getChildren().addAll(returnB); 
			root.setCenter(selectWindow);
			
			
		});
		incrementB.setOnAction(event->{
			VBox incrementWindow=new VBox(10);
			incrementWindow.setAlignment(Pos.CENTER);
			Increment_Option.createIncrementWindowOption(incrementWindow); 
			incrementWindow.getChildren().addAll(returnB);
			root.setCenter(incrementWindow);
			
		});
		sliderB.setOnAction(event->{
			VBox sliderWindow=new VBox(10); 
			sliderWindow.setAlignment(Pos.CENTER);
			Slider_Option.createSliderWindowOption(sliderWindow); 
			sliderWindow.getChildren().addAll(returnB); 
			root.setCenter(sliderWindow);
			
		});
		//used to return from whatever option to the main menu
		returnB.setOnAction(event->{
			root.setCenter(menu);
		});
	}
	
}
