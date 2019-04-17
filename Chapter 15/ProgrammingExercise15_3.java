import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.event.*;

public class ProgrammingExercise15_3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Pane for circle
		Pane pane = new Pane();
		// Circle(int centerX, int centerY, double radius)
		Circle circle = new Circle(20.0);
		// Color(double red, double green, double blue, double opacity)
		circle.setFill(Color.rgb(128, 255, 0));
		circle.setStroke(Color.MAGENTA);
		pane.getChildren().add(circle);
		
		// HBox for buttons
		HBox buttonbox = new HBox(5);
		Button left = new Button("Left");
		Button right = new Button("Right");
		Button up = new Button("Up");
		Button down = new Button("Down");
		buttonbox.getChildren().addAll(left, right, up, down);
		// GridPane for Pane and HBox
		BorderPane border = new BorderPane();
		border.setCenter(pane);
		border.setBottom(buttonbox);
		
		// Create scene and add to stage
		Scene scene = new Scene(border, 200, 150);
		primaryStage.setTitle("ProgrammingExercise15_3");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Add EventListeners in lamba functions
		left.setOnAction(e -> {
			if (circle.getCenterX() - 10 >= circle.getRadius()) {
				circle.setCenterX(circle.getCenterX() - 10);
			}
			else {
				circle.setCenterX(circle.getRadius());
			}
		});
		
		right.setOnAction(e -> {
			if (circle.getCenterX() + 10 <= (scene.getWidth() - circle.getRadius())) {
				circle.setCenterX(circle.getCenterX() + 10);
			}
		});
		
		up.setOnAction(e -> {
			if (circle.getCenterY() - 10 >= circle.getRadius()) {
				circle.setCenterY(circle.getCenterY() - 10);
			}
			else {
				circle.setCenterY(circle.getRadius());
			}
		});
		
		down.setOnAction(e -> {
			if (circle.getCenterY() + 10 <= (scene.getHeight() - circle.getRadius())) {
				circle.setCenterY(circle.getCenterY() + 10);
			}
		});
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}