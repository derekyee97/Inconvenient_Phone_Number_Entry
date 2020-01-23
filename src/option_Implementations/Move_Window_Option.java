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
	public static void createMoveWindow(Stage myStage, Scene myScene, VBox menu,BorderPane root)
	{
		Pane canvas=new Pane();	
		Circle circle1=new Circle(20,Color.ALICEBLUE);
		Circle circle2=new Circle(20,Color.MEDIUMVIOLETRED);
		Circle circle3=new Circle(20,Color.LIMEGREEN);
		
		canvas.getChildren().addAll(circle1,circle2,circle3);
		circle1.relocate(5, 5);
		circle2.relocate(300, 50);
		circle3.relocate(100, 200);
		canvas.setMinSize(200,300);
		Label instructL=new Label ("Please select the number corresponding to your phone number in proper order : "); 
		StringBuilder num=new StringBuilder(); 
		Label phoneL=new Label("Your phone number is: ");
		Label phoneNum=new Label(""); 
		HBox holdNumLabel=new HBox(10,phoneL,phoneNum); 
		holdNumLabel.setAlignment(Pos.CENTER);
		canvas.setStyle("-fx-background-color: #FFFFFF");
		menu.getChildren().addAll(instructL,holdNumLabel,canvas);
		menu.setPadding(new Insets(10));
		root.setCenter(menu);
		
		 final Timeline loop = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

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
		 	loop3.setCycleCount(Timeline.INDEFINITE);
		 	loop3.play();
		 	loop2.setCycleCount(Timeline.INDEFINITE);
	        loop2.play();
	        loop.setCycleCount(Timeline.INDEFINITE);
	        loop.play();
	       
		
	}
}
