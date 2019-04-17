import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.input.MouseButton;

public class ProgrammingExercise15_Animation extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle rectangle = new Rectangle(90, 60);
		rectangle.setFill(Color.rgb(128, 255, 0));
		rectangle.setStroke(Color.YELLOW);
		
		Polygon polygon = new Polygon();
		polygon.setFill(Color.CYAN);
		polygon.setStroke(Color.MAGENTA);
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = 500 / 2, centerY = 500 / 2;
		double radius = Math.min(500, 500) * 0.4;
		
		int s = 5;
		
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}
		
		pane.getChildren().addAll(rectangle, polygon);
		
		PathTransition path = new PathTransition();
		path.setPath(polygon);
		path.setNode(rectangle);
		path.setAutoReverse(true);
		path.setCycleCount(Timeline.INDEFINITE);
		path.setDuration(Duration.millis(4000));
		path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		path.play();
		
		FadeTransition fade = new FadeTransition(Duration.millis(2000), rectangle);
		fade.setFromValue(1.0);
		fade.setToValue(0.1);
		fade.setCycleCount(Timeline.INDEFINITE);
		fade.setAutoReverse(true);
		fade.play();
		
		FadeTransition fade2 = new FadeTransition(Duration.millis(1000), polygon);
		fade2.setFromValue(1.0);
		fade2.setToValue(0.1);
		fade2.setCycleCount(Timeline.INDEFINITE);
		fade2.setAutoReverse(true);
		fade2.play();
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("ProgrammingExercise15_Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		rectangle.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				path.pause();
				fade.pause();
				fade2.play();
				System.out.println("Animation Paused");
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				path.play();
				fade.play();
				fade2.pause();
				System.out.println("Animation Resumed");
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}