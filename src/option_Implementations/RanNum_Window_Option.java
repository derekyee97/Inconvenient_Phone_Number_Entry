package option_Implementations;

import java.util.Random;

import javafx.scene.control.Button;
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
		VBox first=new VBox(20);VBox second=new VBox(20);VBox third=new VBox(20);
		VBox fourth=new VBox(20);VBox fifth=new VBox(20);VBox sixth=new VBox(20);
		VBox seventh=new VBox(20);VBox eighth=new VBox(20);VBox ninth=new VBox(20);
		Button firstStop=new Button("Stop");Button secondStop=new Button("Stop");Button thirdStop=new Button("Stop");
		Button fourthStop=new Button("Stop");Button fifthStop=new Button("Stop");Button sixthStop=new Button("Stop");
		Button seventhStop=new Button("Stop");Button eighthStop=new Button("Stop");Button ninthStop=new Button("Stop");
		TextField firstD=new TextField("0");TextField secondD=new TextField("1");
		TextField thirdD=new TextField("2");TextField fourthD=new TextField("3");
		TextField fifthD=new TextField("4");TextField sixthD=new TextField("5");
		TextField seventhD=new TextField("6");TextField eighthD=new TextField("7");
		TextField ninthD=new TextField("8");
		first.getChildren().addAll(firstD,firstStop);second.getChildren().addAll(secondD,secondStop); third.getChildren().addAll(thirdD,thirdStop);
		fourth.getChildren().addAll(fourthD,fourthStop);fifth.getChildren().addAll(fifthD,fifthStop); sixth.getChildren().addAll(sixthD,sixthStop); 
		seventh.getChildren().addAll(seventhD,seventhStop); eighth.getChildren().addAll(eighthD,eighthStop);ninth.getChildren().addAll(ninthD,ninthStop); 
		numHolder.getChildren().addAll(first,second,third,fourth,fifth,sixth,seventh,eighth,ninth);
		window.getChildren().addAll(instrL,numHolder); 
		Random gen=new Random(); 
		
		
		
	}
}
