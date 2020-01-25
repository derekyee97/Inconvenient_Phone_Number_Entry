package option_Implementations;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Move_Window_Option 
{
	public static void createMoveWindow(Stage myStage,VBox mainMenu, VBox menu,BorderPane root)
	{
		Pane canvas=new Pane();	
		Circle circle1=new Circle(20,Color.BLUE);Circle circle2=new Circle(20,Color.RED);
		Circle circle3=new Circle(20,Color.LIMEGREEN);Circle circle4=new Circle(20,Color.MEDIUMPURPLE); 
		Circle circle5=new Circle(20,Color.ORANGE);Circle circle6=new Circle(20,Color.GOLD);
		Circle circle7=new Circle(20,Color.FUCHSIA); Circle circle8=new Circle(20,Color.FIREBRICK); 
		Circle circle9=new Circle(20,Color.HOTPINK); Circle circle0=new Circle(20,Color.BLACK);
		Label keyL=new Label("Please select the color circle corresponding to the number to enter each digit: "); 
		Label zeroL=new Label("zero");Label oneL=new Label("one");Label twoL=new Label("two");
		Label threeL=new Label("three");Label fourL=new Label("four");Label fiveL=new Label("five");
		Label sixL=new Label("six");Label sevenL=new Label("seven");Label eightL=new Label("eight");
		Label nineL=new Label("nine");
		oneL.setTextFill(Color.BLUE);twoL.setTextFill(Color.RED);threeL.setTextFill(Color.LIMEGREEN);
		fourL.setTextFill(Color.MEDIUMPURPLE);fiveL.setTextFill(Color.ORANGE);sixL.setTextFill(Color.GOLD);
		sevenL.setTextFill(Color.FUCHSIA);eightL.setTextFill(Color.FIREBRICK);nineL.setTextFill(Color.HOTPINK);
		oneL.setStyle("-fx-font-weight: bold");zeroL.setStyle("-fx-font-weight: bold");twoL.setStyle("-fx-font-weight: bold");
		threeL.setStyle("-fx-font-weight: bold");fourL.setStyle("-fx-font-weight: bold");fiveL.setStyle("-fx-font-weight: bold");
		sixL.setStyle("-fx-font-weight: bold");sevenL.setStyle("-fx-font-weight: bold");eightL.setStyle("-fx-font-weight: bold");nineL.setStyle("-fx-font-weight: bold");
		HBox labelHold=new HBox(5,zeroL,oneL,twoL,threeL,fourL,fiveL,sixL,sevenL,eightL,nineL); 
		labelHold.setAlignment(Pos.CENTER);
		canvas.getChildren().addAll(circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle0);
		circle1.relocate(5, 5);circle2.relocate(300, 50);circle3.relocate(175, 200);
		circle4.relocate(300, 300); circle5.relocate(250, 250); circle6.relocate(300, 200);
		circle7.relocate(350, 350); circle8.relocate(100,300); circle9.relocate(75,57);circle0.relocate(100,400);
		canvas.setMinSize(200,300);
		StringBuilder num=new StringBuilder(); num.append("(");
		Label phoneL=new Label("Your phone number is: ");
		Label phoneNum=new Label(""); 
		Button delete=new Button("Delete"); 
		Button submitB=new Button("Submit"); 
		HBox holdNumLabel=new HBox(10,phoneL,phoneNum,delete); 
		holdNumLabel.setAlignment(Pos.CENTER);
		canvas.setStyle("-fx-background-color: #FFFFFF");
		menu.getChildren().addAll(keyL,labelHold,holdNumLabel,canvas,submitB);
		menu.setPadding(new Insets(10));
		root.setCenter(menu);
		
		 final Timeline loop1 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX = 3;
	            double deltaY = 3;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle1.setLayoutX(circle1.getLayoutX() + deltaX);
	                circle1.setLayoutY(circle1.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle1.getLayoutX() >= (bounds.getMaxX() - circle1.getRadius());
	                final boolean atLeftBorder = circle1.getLayoutX() <= (bounds.getMinX() + circle1.getRadius());
	                final boolean atBottomBorder =circle1.getLayoutY() >= (bounds.getMaxY() - circle1.getRadius());
	                final boolean atTopBorder = circle1.getLayoutY() <= (bounds.getMinY() + circle1.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop2 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX = 1;
	            double deltaY = 1;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle2.setLayoutX(circle2.getLayoutX() + deltaX);
	                circle2.setLayoutY(circle2.getLayoutY() + deltaY);

	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle2.getLayoutX() >= (bounds.getMaxX() - circle2.getRadius());
	                final boolean atLeftBorder = circle2.getLayoutX() <= (bounds.getMinX() + circle2.getRadius());
	                final boolean atBottomBorder = circle2.getLayoutY() >= (bounds.getMaxY() - circle2.getRadius());
	                final boolean atTopBorder = circle2.getLayoutY() <= (bounds.getMinY() + circle2.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop3 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =2;
	            double deltaY =2;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle3.setLayoutX(circle3.getLayoutX() + deltaX);
	                circle3.setLayoutY(circle3.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle3.getLayoutX() >= (bounds.getMaxX() - circle3.getRadius());
	                final boolean atLeftBorder = circle3.getLayoutX() <= (bounds.getMinX() + circle3.getRadius());
	                final boolean atBottomBorder =circle3.getLayoutY() >= (bounds.getMaxY() - circle3.getRadius());
	                final boolean atTopBorder = circle3.getLayoutY() <= (bounds.getMinY() + circle3.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop4 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =3;
	            double deltaY =3;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle4.setLayoutX(circle4.getLayoutX() + deltaX);
	                circle4.setLayoutY(circle4.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle4.getLayoutX() >= (bounds.getMaxX() - circle4.getRadius());
	                final boolean atLeftBorder = circle4.getLayoutX() <= (bounds.getMinX() + circle4.getRadius());
	                final boolean atBottomBorder =circle4.getLayoutY() >= (bounds.getMaxY() - circle4.getRadius());
	                final boolean atTopBorder = circle4.getLayoutY() <= (bounds.getMinY() + circle4.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop5 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =2;
	            double deltaY =2;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle5.setLayoutX(circle5.getLayoutX() + deltaX);
	                circle5.setLayoutY(circle5.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle5.getLayoutX() >= (bounds.getMaxX() - circle5.getRadius());
	                final boolean atLeftBorder = circle5.getLayoutX() <= (bounds.getMinX() + circle5.getRadius());
	                final boolean atBottomBorder =circle5.getLayoutY() >= (bounds.getMaxY() - circle5.getRadius());
	                final boolean atTopBorder = circle5.getLayoutY() <= (bounds.getMinY() + circle5.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop6 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =1;
	            double deltaY =1;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle6.setLayoutX(circle6.getLayoutX() + deltaX);
	                circle6.setLayoutY(circle6.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle6.getLayoutX() >= (bounds.getMaxX() - circle6.getRadius());
	                final boolean atLeftBorder = circle6.getLayoutX() <= (bounds.getMinX() + circle6.getRadius());
	                final boolean atBottomBorder =circle6.getLayoutY() >= (bounds.getMaxY() - circle6.getRadius());
	                final boolean atTopBorder = circle6.getLayoutY() <= (bounds.getMinY() + circle6.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop7 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =2;
	            double deltaY =2;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle7.setLayoutX(circle7.getLayoutX() + deltaX);
	                circle7.setLayoutY(circle7.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle7.getLayoutX() >= (bounds.getMaxX() - circle7.getRadius());
	                final boolean atLeftBorder = circle7.getLayoutX() <= (bounds.getMinX() + circle7.getRadius());
	                final boolean atBottomBorder =circle7.getLayoutY() >= (bounds.getMaxY() - circle7.getRadius());
	                final boolean atTopBorder = circle7.getLayoutY() <= (bounds.getMinY() + circle3.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop8 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =2;
	            double deltaY =2;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle8.setLayoutX(circle8.getLayoutX() + deltaX);
	                circle8.setLayoutY(circle8.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle8.getLayoutX() >= (bounds.getMaxX() - circle8.getRadius());
	                final boolean atLeftBorder = circle8.getLayoutX() <= (bounds.getMinX() + circle8.getRadius());
	                final boolean atBottomBorder =circle8.getLayoutY() >= (bounds.getMaxY() - circle8.getRadius());
	                final boolean atTopBorder = circle8.getLayoutY() <= (bounds.getMinY() + circle3.getRadius());
	                
	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop9 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =2;
	            double deltaY =2;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle9.setLayoutX(circle9.getLayoutX() + deltaX);
	                circle9.setLayoutY(circle9.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle9.getLayoutX() >= (bounds.getMaxX() - circle9.getRadius());
	                final boolean atLeftBorder = circle9.getLayoutX() <= (bounds.getMinX() + circle9.getRadius());
	                final boolean atBottomBorder =circle9.getLayoutY() >= (bounds.getMaxY() - circle9.getRadius());
	                final boolean atTopBorder = circle9.getLayoutY() <= (bounds.getMinY() + circle9.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		 final Timeline loop0 = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

	            double deltaX =1;
	            double deltaY =1;

	            @Override
	            public void handle(final ActionEvent t) {
	                circle0.setLayoutX(circle0.getLayoutX() + deltaX);
	                circle0.setLayoutY(circle0.getLayoutY() + deltaY);
	                final Bounds bounds = canvas.getBoundsInLocal();
	                final boolean atRightBorder = circle0.getLayoutX() >= (bounds.getMaxX() - circle0.getRadius());
	                final boolean atLeftBorder = circle0.getLayoutX() <= (bounds.getMinX() + circle0.getRadius());
	                final boolean atBottomBorder =circle0.getLayoutY() >= (bounds.getMaxY() - circle0.getRadius());
	                final boolean atTopBorder = circle0.getLayoutY() <= (bounds.getMinY() + circle0.getRadius());

	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	            }
	        }));
		  	loop9.setCycleCount(Timeline.INDEFINITE);loop9.play();
		 	loop8.setCycleCount(Timeline.INDEFINITE);loop8.play();
		 	loop7.setCycleCount(Timeline.INDEFINITE);loop7.play();
		 	loop6.setCycleCount(Timeline.INDEFINITE);loop6.play();
		 	loop5.setCycleCount(Timeline.INDEFINITE);loop5.play();
		 	loop4.setCycleCount(Timeline.INDEFINITE);loop4.play();
		 	loop3.setCycleCount(Timeline.INDEFINITE);loop3.play();
		 	loop2.setCycleCount(Timeline.INDEFINITE);loop2.play();
	        loop1.setCycleCount(Timeline.INDEFINITE);loop1.play();
	        loop0.setCycleCount(Timeline.INDEFINITE);loop0.play();
	       circle0.setOnMouseClicked(event->{
	    	   num.append("0");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle1.setOnMouseClicked(event->{
	    	   num.append("1");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle2.setOnMouseClicked(event->{
	    	   num.append("2");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle3.setOnMouseClicked(event->{
	    	   num.append("3");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle4.setOnMouseClicked(event->{
	    	   num.append("4");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle5.setOnMouseClicked(event->{
	    	   num.append("5");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle6.setOnMouseClicked(event->{
	    	   num.append("6");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle7.setOnMouseClicked(event->{
	    	   num.append("7");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle8.setOnMouseClicked(event->{
	    	   num.append("8");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       circle9.setOnMouseClicked(event->{
	    	   num.append("9");
	    	   checkFormat(num);
	    	   phoneNum.setText(num.toString());
	       });
	       
	       delete.setOnAction(event->{
	    	   if(num.length()==1)
	    	   {
	    	   }
	    	   else
	    	   {
	    		   num.setLength(num.length()-1);
	    		   phoneNum.setText(num.toString());
	    	   }
	       });
	       submitB.setOnAction(event->{
	    	   root.setCenter(mainMenu);
	       });
	}
	private static void checkFormat(StringBuilder num)
	{
		if(num.length()==4)
		{
			num.append(")-"); 
		}
		else if(num.length()==9)
		{
			num.append("-");
		}
	}
}
