import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import option_Implementations.Guess_Option;

public class main_menu extends Application 
{
	public static void main(String[] args)
	{
		launch(args);
	}

	Label welcomeL=new Label("Welcome to the inconvenient phone number entry application!"); 
	Label instructionL=new Label("Please select a choice: ");
	BorderPane root=new BorderPane();
	VBox menu=new VBox(10);
	GridPane options=new GridPane(); 
	Button guessB=new Button("Guess");
	public void start(Stage myStage) 
	{
		Scene myScene=new Scene(root,500,500);
		options.setAlignment(Pos.CENTER);
		options.add(guessB, 0,0);
		menu.getChildren().addAll(welcomeL,instructionL,options);
		menu.setAlignment(Pos.CENTER);
		root.setCenter(menu);
		
		
		myStage.setScene(myScene);
		myStage.show();
		
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
	}
	
}
