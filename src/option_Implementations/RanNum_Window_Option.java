package option_Implementations;

import java.util.Random;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RanNum_Window_Option 
{
	public static void createRanNumWindow(VBox window)
	{
		Label instrL=new Label("Select stop beneath each number till the phone number is reached.");
		HBox numHolder=new HBox(10); 
		TextField firstD=new TextField("0");TextField secondD=new TextField("0");
		TextField thirdD=new TextField("0");TextField fourthD=new TextField("0");
		TextField fifthD=new TextField("0");TextField sixthD=new TextField("0");
		TextField seventhD=new TextField("0");TextField eighthD=new TextField("0");
		TextField ninthD=new TextField("0");
		Random gen=new Random(); 
	}
}
