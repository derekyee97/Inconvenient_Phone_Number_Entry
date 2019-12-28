import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main_menu extends Application 
{
	public static void main(String[] args)
	{
		launch(args);
	}

	Label welcomeL=new Label("Welcome to the inconvenient phone number entry application!"); 
	BorderPane root=new BorderPane();
	VBox menu=new VBox(10);
	GridPane options=new GridPane(); 
	public void start(Stage myStage) 
	{
		Scene myScene=new Scene(root,500,500);
		menu.getChildren().addAll(welcomeL,options);
		menu.setAlignment(Pos.CENTER);
		root.setCenter(menu);
		
		
		myStage.setScene(myScene);
		myStage.show();
		
	}
	
}
