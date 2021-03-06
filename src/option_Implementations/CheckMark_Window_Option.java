package option_Implementations;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckMark_Window_Option 
{
	static StringBuilder phoneNumber=new StringBuilder("XXXXXXXXXX"); 
	static Label phoneL=new Label();
	static EventHandler checkNum=new EventHandler<ActionEvent>()
	{

		@Override
		//this event handler will check if the user drawn a number after every check click
		public void handle(ActionEvent event) 
		{
			CheckBox a=(CheckBox) event.getSource();     //get box that was clicked and link to gridpane parent
			GridPane parent=(GridPane) a.getParent(); 
			int num=getDrawnNumber(parent);            
			if(num<0)
			{
				phoneNumber.setCharAt(parent.getId().charAt(0)-'0','X');  //parent id links to spot in phonenumber (global var) 
			}
			else
			{
				phoneNumber.setCharAt(parent.getId().charAt(0)-'0',(char) (48+num));
			}
			
			setText(phoneL,phoneNumber);
			
		}
		
	};
	public static void createCheckMarkWindow(VBox window, Stage myStage)
	{
		//defining gridpanes to hold each digit of phone number, and filling with checkboxes 
		GridPane firstD=new GridPane();genBoxes(firstD);GridPane secondD=new GridPane();genBoxes(secondD);
		GridPane thirdD=new GridPane();genBoxes(thirdD);GridPane fourthD=new GridPane();genBoxes(fourthD);
		GridPane fifthD=new GridPane();genBoxes(fifthD);GridPane sixthD=new GridPane();genBoxes(sixthD);
		GridPane seventhD=new GridPane();genBoxes(seventhD);GridPane eighthD=new GridPane();genBoxes(eighthD);
		GridPane ninthD=new GridPane();genBoxes(ninthD);GridPane tenthD=new GridPane();genBoxes(tenthD);
		firstD.setId("0");secondD.setId("1");thirdD.setId("2");fourthD.setId("3");fifthD.setId("4");
		sixthD.setId("5");seventhD.setId("6");eighthD.setId("7");ninthD.setId("8");tenthD.setId("9");
		HBox holder=new HBox(10,firstD,secondD,thirdD,fourthD,fifthD,sixthD,seventhD,eighthD,ninthD,tenthD); 
		holder.setAlignment(Pos.CENTER); holder.setPadding(new Insets(10));
		setText(phoneL, phoneNumber);
		Image keyI=new Image("/resources/key.PNG");
		ImageView key=new ImageView(keyI);
		key.setFitWidth(1000);
		Label instructL=new Label("Please draw each digit with check marks as displayed above");
		window.getChildren().addAll(key, instructL,phoneL,holder); 
					
	}
	private static void genBoxes(GridPane digitHolder)
	{
		int row=0;
		for(int counter=0;counter<=28;counter++)
		{
			CheckBox box=new CheckBox(); 
			box.setId("test");
			box.setOnAction(checkNum);
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
	private static  int getDrawnNumber(GridPane digit)
	{
		boolean[] check=new boolean[28]; 
		int count=-1;
		for(Node a:digit.getChildren()) 
		{
			if(count<0)  //there's extra child thats not what we need so we need to skip it by doing this 
			{
				count=0;
				continue;
			}
			CheckBox isCheck=(CheckBox)(a);
			if(isCheck.isSelected())
			{
				check[count]=true;
			}
			count++;
		}
		//checking if 0 drawn
		if(check[4]!=true && check[5]!=true && check[8]!=true && check[9]!=true && check[13]!=true
				&& check[16]!=true && check[17]!=true && check[20]!=true && check[21]!=true 
				&& check[0]==true && check[1]==true && check[2]==true && check[3]==true
				&& check[7]==true && check[6]==true && check[11]==true && check[10]==true
				&& check[15]==true && check[14]==true && check[19]==true && check[18]==true
				&& check[23]==true && check[22]==true && check[24]==true && check[25]==true && check[26]==true && check[27]==true) 
		{
			return 0; 
		}
		//check if 1 drawn
		else if(check[4]==true && check[1]==true && check[5]==true && check[9]==true 
				&& check[13]==true && check[17]==true && check[21]==true && check[25]==true
				&& check[2]!=true && check[3]!=true && check[6]!=true && check[7]!=true 
				&& check[8]!=true && check[10]!=true && check[11]!=true && check[12]!=true && check[14]!=true &&
				check[15]!=true && check[16]!=true && check[18]!=true && check[19]!=true && check[20]!=true
				&& check[22]!=true && check[23]!=true && check[24]!=true && check[26]!=true && check[27]!=true)
		{
			return 1;
		}
		//check if 2 drawn
		else if(check[7]==true && check[11]==true && check[0]==true && check[1]==true &&
				check[6]==true && check[10]==true && check[13]==true && check[16]==true && check[23]==true 
				&& check[27]==true && check[24]==true && check[25]==true && check[26]==true
				&& check[2]!=true && check[3]!=true && check[4]!=true && check[5]!=true && 
				check[8]!=true && check[9]!=true && check[12]!=true && check[14]!=true && check[15]!=true && 
				check[17]!=true && check[18]!=true && check[19]!=true && check[20]!=true && check[21]!=true &&
				check[22]!=true)
		{
			return 2;
		}
		//check 3
		else if(check[7]==true && check[0]==true && check[1]==true && check[6]==true 
				&& check[10]==true && check[12]==true && check[13]==true && check[18]==true
				&& check[22]==true && check[24]==true && check[25]==true && check[23]==true
				&& check[2]!=true && check[2]!=true && check[4]!=true && check[5]!=true && 
				check[8]!=true && check[9]!=true && check[11]!=true && check[14]!=true && 
				check[15]!=true && check[16]!=true && check[17]!=true && check[19]!=true && 
				check[20]!=true && check[26]!=true && check[27]!=true && check[21]!=true)
		{
			return 3;
		}
		//check 4
		else if(check[3]==true && check[7]==true && check[11]==true && check[15]==true 
				&& check[12]==true && check[13]==true && check[14]==true && check[9]==true && 
				check[5]==true && check[17]==true && check[21]==true && check[25]==true &&
				check[0]!=true && check[4]!=true && check[8]!=true && check[1]!=true && check[2]!=true &&
				check[6]!=true && check[10]!=true && check[18]!=true && check[22]!=true && check[26]!=true &&
				check[19]!=true && check[16]!=true && check[23]!=true && check[20]!=true && check[27]!=true &&
				check[24]!=true)
		{
			return 4;
		}
		//check 5
		else if(check[3]==true && check[0]==true && check[1]==true && check[2]==true 
				&& check[7]==true && check[11]==true && check[15]==true && check[12]==true && 
				check[13]==true && check[18]==true && check[22]==true && check[25]==true && check[24]==true 
				&& check[23]==true &&
				check[4]!=true && check[5]!=true && check[6]!=true && check[8]!=true && check[9]!=true && 
				check[10]!=true && check[14]!=true && check[19]!=true && check[16]!=true && check[17]!=true &&
				check[20]!=true && check[21]!=true && check[27]!=true && check[26]!=true)
		{
			return 5;
		}
		//check 6
		else if(check[0]==true && check[1]==true && check[6]==true && check[7]==true 
				&& check[15]==true && check[11]==true && check[12]==true && check[13]==true && 
				check[18]==true && check[22]==true && check[24]==true && check[25]==true && check[23]==true 
				&& check[19]==true && 
				check[3]!=true && check[2]!=true && check[4]!=true && check[5]!=true && check[8]!=true &&
				check[9]!=true && check[10]!=true && check[14]!=true && check[16]!=true && check[17]!=true &&
				check[20]!=true && check[21]!=true && check[27]!=true && check[26]!=true)
		{
			return 6;
		}
		else if(check[3]==true && check[7]==true && check[1]==true && check[2]==true 
				&& check[0]==true && check[6]==true && check[10]==true && check[13]==true && 
				check[17]==true && check[20]==true && check[24]==true &&
				check[4]!=true && check[5]!=true && check[8]!=true && check[9]!=true && 
				check[11]!=true && check[15]!=true && check[12]!=true && check[19]!=true &&
				check[16]!=true && check[23]!=true && check[27]!=true && check[21]!=true &&
				check[22]!=true && check[25]!=true && check[26]!=true && check[18]!=true &&
				check[14]!=true)
		{
			return 7;
		}
		else if(check[0]==true && check[1]==true && check[7]==true && check[11]==true 
				&& check[6]==true && check[10]==true && check[12]==true && check[13]==true && 
				check[18]==true && check[22]==true && check[19]==true && check[23]==true && 
				check[24]==true && check[25]==true &&
				check[3]!=true && check[2]!=true && check[4]!=true && check[5]!=true && check[8]!=true &&
				check[9]!=true && check[15]!=true && check[14]!=true && check[16]!=true && check[17]!=true &&
				check[20]!=true && check[21]!=true && check[27]!=true && check[26]!=true)
				
		{
			return 8; 
		}
		else if(check[0]==true && check[1]==true && check[7]==true && check[11]==true 
				&& check[6]==true && check[10]==true && check[12]==true && check[13]==true && 
				check[18]==true && check[14]==true && check[22]==true && check[23]==true && 
				check[24]==true && check[25]==true && 
				check[3]!=true && check[2]!=true && check[4]!=true && check[5]!=true && check[8]!=true &&
				check[9]!=true && check[15]!=true && check[19]!=true && check[16]!=true && check[17]!=true &&
				check[20]!=true && check[21]!=true && check[27]!=true && check[26]!=true)
				
		{
			return 9;
		}
		return -1;
	}
	private static void setText(Label label, StringBuilder num) 
	{
		StringBuilder result=new StringBuilder("("); 
		result.append(num.charAt(0));result.append(num.charAt(1));result.append(num.charAt(2)); 
		result.append(") - "); 
		result.append(num.charAt(3));result.append(num.charAt(4)); result.append(num.charAt(5)); 
		result.append(" - "); 
		result.append(num.charAt(6)); result.append(num.charAt(7)); result.append(num.charAt(8));result.append(num.charAt(9));
		label.setText(result.toString());
	}
	
}
