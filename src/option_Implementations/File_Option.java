package option_Implementations;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class File_Option
{
	
	public static void createFileOptionMenu(VBox menu, Stage myStage)
	{
		Button areaB=new Button(".txt"); 
		Button middleB=new Button(".txt"); 
		Button endB=new Button(".txt"); 
		Label instr=new Label("Please input the file for each desired part of your phone number."); 
		Label areaL=new Label("Area Code: "); 
		Label middleL=new Label("Next three digits: "); 
		Label endL=new Label("Last four digits: "); 
		File areaF=null,middleF=null,endF=null; 
		FileChooser fileChooser=new FileChooser();
		fileChooser.getExtensionFilters().add(new ExtensionFilter(".txt Files","*.txt"));
		GridPane holder=new GridPane(); 
		holder.setAlignment(Pos.CENTER);
		holder.setHgap(20);holder.setVgap(10);
		holder.add(areaL, 0, 0);holder.add(areaB, 1, 0);
		holder.add(middleL, 0, 1);holder.add(middleB, 1, 1);
		holder.add(endL, 0, 2);holder.add(endB, 1, 2);
		menu.getChildren().addAll(instr,holder); 
		areaB.setOnAction(event->{
			
			selectFile(fileChooser,areaF,myStage); 
			
		});
		middleB.setOnAction(event->{
			selectFile(fileChooser,middleF,myStage); 
		});
		endB.setOnAction(event->{
			selectFile(fileChooser,endF,myStage);
		});
	}
	private static void selectFile(FileChooser fileChooser, File var,Stage myStage)
	{
		var=fileChooser.showOpenDialog(myStage); 
		
	}
}
