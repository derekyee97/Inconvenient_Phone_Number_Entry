package option_Implementations;

import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Select_Window_Option 
{
	public static void createSelectWindowOption(VBox window)
	{
		GridPane mainWindow=new GridPane(); 
		mainWindow.setAlignment(Pos.CENTER);
		mainWindow.setHgap(10);mainWindow.setVgap(10);
		Label instructionL=new Label("Please select the option corresponding to the designated column to enter your phone number."); 
		Label areaCode=new Label("Area Code"); 
		Label middle=new Label("Middle");
		Label nextThree=new Label("Next three digits"); 
		Label last=new Label("Last Digit");
		mainWindow.add(areaCode, 0, 0);
		mainWindow.add(middle, 1, 0);
		mainWindow.add(nextThree, 2, 0);
		mainWindow.add(last, 3, 0);
		ChoiceBox beginBox=new ChoiceBox(); 
		ChoiceBox middleBox=new ChoiceBox(); 
		ChoiceBox nextThreeBox=new ChoiceBox(); 
		ChoiceBox lastBox=new ChoiceBox(); 
		mainWindow.add(beginBox, 0, 1);mainWindow.add(middleBox, 1, 1);mainWindow.add(nextThreeBox, 2, 1);mainWindow.add(lastBox, 3, 1);
		for(int i=0;i<=999;i++) //fills options for choice boxes 
		{
			beginBox.getItems().addAll(String.format("%03d",i));
			middleBox.getItems().addAll(String.format("%03d", i));
			nextThreeBox.getItems().addAll(String.format("%03d",i));
			if(i<=9)
			{
				lastBox.getItems().addAll(Integer.toString(i));
			}
		}
		beginBox.setValue("000");middleBox.setValue("000");nextThreeBox.setValue("000");lastBox.setValue("0");
		window.getChildren().addAll(instructionL,mainWindow); 
	}
}
