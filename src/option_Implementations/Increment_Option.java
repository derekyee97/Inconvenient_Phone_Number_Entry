package option_Implementations;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Increment_Option 
{
	private static int phoneNumber=0;
	public static void createIncrementWindowOption(VBox window)
	{
		Label instructL=new Label("Please press the + button till your phone number is reached. "); 
		Button incB=new Button("+"); 
		Label phoneL=new Label("Phone Number"); 
		Label phoneNumberL=new Label("(000) - 000 - 0000"); 
		HBox phoneBox=new HBox(10,phoneL,phoneNumberL,incB);
		phoneBox.setAlignment(Pos.CENTER);
		window.getChildren().addAll(instructL,phoneBox); 
		incB.setOnAction(event->{
			phoneNumber++; 
			String result=String.format("%010d", phoneNumber);
			StringBuilder res=new StringBuilder(); 
			res.append("(");
			for(int i=0;i<result.length();i++)
			{
				res.append(result.charAt(i)); 
				if(i==2)
				{
					res.append(") - "); 
				}
				else if(i==5)
				{
					res.append(" - ");
				}
			}
			phoneNumberL.setText(res.toString());
		});
	}
}
