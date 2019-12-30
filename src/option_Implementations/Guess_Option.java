package option_Implementations;
import java.util.Random;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Guess_Option 
{
	public static void createGuessPage(VBox page)
	{
		Label a=new Label("Is this your number?");
		Random genDigit=new Random(); 
		Label resultGuess=new Label(genNumber());
		page.getChildren().removeAll(); 
		page.getChildren().addAll(a,resultGuess);
		
		
	}
	public static String genNumber()
	{
		Random genDigit=new Random(); 
		StringBuilder generatedNum=new StringBuilder();
		generatedNum.append("("); 
		for(int i=1;i<=10;i++)
		{
			generatedNum.append(Integer.toString(genDigit.nextInt(10))); 
			if(i==3)
			{
				generatedNum.append(") - "); 
			}
			else if(i==6)
			{
				generatedNum.append(" - ");
			}
		}
		return generatedNum.toString();
	}
}
