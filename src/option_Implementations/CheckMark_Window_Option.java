package option_Implementations;

import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CheckMark_Window_Option 
{
	public static void createCheckMarkWindow(VBox window)
	{
		StringBuilder phoneNumber=new StringBuilder(); 
		GridPane firstD=new GridPane();genBoxes(firstD);GridPane secondD=new GridPane();genBoxes(secondD);
		GridPane thirdD=new GridPane();genBoxes(thirdD);GridPane fourthD=new GridPane();genBoxes(fourthD);
		GridPane fifthD=new GridPane();genBoxes(fifthD);GridPane sixthD=new GridPane();genBoxes(sixthD);
		GridPane seventhD=new GridPane();genBoxes(seventhD);GridPane eighthD=new GridPane();genBoxes(eighthD);
		GridPane ninthD=new GridPane();genBoxes(ninthD);
		HBox holder=new HBox(10,firstD,secondD,thirdD,fourthD,fifthD,sixthD,seventhD,eighthD,ninthD); 
		
		window.getChildren().addAll(holder); 
				
	}
	private static void genBoxes(GridPane digitHolder)
	{
		int row=0;
		for(int counter=0;counter<=28;counter++)
		{
			CheckBox box=new CheckBox(); 
			digitHolder.add(box, counter%4, row);
			if(counter==0)
			{
				continue;
			}
			else if(counter%4==0)
			{
				row++;
			}
		}
	}
}
