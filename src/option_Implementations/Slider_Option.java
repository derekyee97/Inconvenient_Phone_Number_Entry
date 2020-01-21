package option_Implementations;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Slider_Option 
{
	public static void createSliderWindowOption(VBox window)
	{
		Slider slider=new Slider();
		Slider beginSlider=new Slider();
		beginSlider.setMaxWidth(200);
		slider.setMaxWidth(500);
		beginSlider.setMin(0);
		beginSlider.setMax(9);
		beginSlider.setValue(0);
		beginSlider.setShowTickLabels(true);slider.setShowTickLabels(true); 
		Label instructL=new Label("Please use slide the slider to your phone number."); 
		Label beginL=new Label("Please use the slider to indicate the first digit of your phone number: "); 
		Label secondL=new Label("PLease use the slide to indicate the rest of the digits in your phone number: "); 
		Label firstL=new Label("0"); 
		Label result=new Label("Inputted Phone Number: "); 
		Label phoneRestL=new Label("000000000");
		HBox phoneNumber=new HBox(result,firstL,phoneRestL); 
		phoneNumber.setAlignment(Pos.CENTER);
		slider.setMin(0);
		slider.setMax(999999999);
		slider.setValue(0);
		window.getChildren().addAll(instructL, beginL, beginSlider, secondL ,slider, phoneNumber);
		slider.valueProperty().addListener(new ChangeListener<Number>() 
		{

             @Override
             public void changed(ObservableValue<? extends Number> observableValue,Number oldValue,Number newValue)
             { 
                   String result=String.format("%09d", newValue.intValue());
                   phoneRestL.textProperty().setValue(
                       String.valueOf(newValue.intValue()));
             }
        });
		beginSlider.valueProperty().addListener(new ChangeListener<Number>() 
		{

             @Override
             public void changed(ObservableValue<? extends Number> observableValue,Number oldValue,Number newValue)
             { 
                     
            	 firstL.textProperty().setValue(
                    		 String.valueOf(newValue.intValue()));
             }
        });
    
	}
}
