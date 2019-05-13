/*
Author: Jacob Almeida
Date: 05-13-2019
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.collections.ObservableList;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.geometry.Pos;
import java.util.jar.*;
import javafx.scene.text.*;
import javafx.scene.input.KeyCode;

public class FinalProject extends Application{
	Timeline animation;
	int counter = 15;
	StackPane pane = new StackPane();
	
	Text youwin = new Text("YOU WIN");
	
	@Override
	public void start(Stage primaryStage) {
		
		Circle circle1 = new Circle(50);
		Circle circle2 = new Circle(95);
		Circle circle3 = new Circle(87);
		Circle circle4 = new Circle(17);
		Circle circle5 = new Circle(75);
		Circle circle6 = new Circle(63);
		Circle circle7 = new Circle(44);
		Circle circle8 = new Circle(130);
		Circle circle9 = new Circle(117);
		Circle circle10 = new Circle(64);
		Circle circle11= new Circle(52);
		Circle circle12 = new Circle(40);
		Circle circle13 = new Circle(87);
		Circle circle14 = new Circle(94);
		Circle circle15 = new Circle(20);
		
		circle1.setFill(Color.MAGENTA);
		circle2.setFill(Color.BLUE);
		circle3.setFill(Color.GRAY);
		circle4.setFill(Color.GREEN);
		circle5.setFill(Color.CYAN);
		circle6.setFill(Color.YELLOW);
		circle7.setFill(Color.RED);
		circle8.setFill(Color.BLACK);
		circle9.setFill(Color.rgb(255, 50, 0));
		circle10.setFill(Color.rgb(128, 255, 0));
		circle11.setFill(Color.rgb(238, 174, 0));
		circle12.setFill(Color.rgb(165, 154, 75));
		circle13.setFill(Color.rgb(108, 235, 40));
		circle14.setFill(Color.rgb(128, 205, 50));
		circle15.setFill(Color.rgb(0, 255, 78));
		
		circle1.setStroke(Color.BLACK);
		circle2.setStroke(Color.BLACK);
		circle3.setStroke(Color.BLACK);
		circle4.setStroke(Color.BLACK);
		circle5.setStroke(Color.BLACK);
		circle6.setStroke(Color.BLACK);
		circle7.setStroke(Color.BLACK);
		circle8.setStroke(Color.BLACK);
		circle9.setStroke(Color.BLACK);
		circle10.setStroke(Color.BLACK);
		circle11.setStroke(Color.BLACK);
		circle12.setStroke(Color.BLACK);
		circle13.setStroke(Color.BLACK);
		circle14.setStroke(Color.BLACK);
		circle15.setStroke(Color.BLACK);
		
		Rectangle rectangle = new Rectangle(1000, 230);
		rectangle.setFill(Color.TRANSPARENT);
		rectangle.setStroke(Color.TRANSPARENT);
				
		Rectangle rectangle2 = new Rectangle(450, 500);
		rectangle2.setFill(Color.TRANSPARENT);
		rectangle2.setStroke(Color.TRANSPARENT);
		
		Circle circlepath1 = new Circle(125);
		circlepath1.setFill(Color.TRANSPARENT);
		circlepath1.setStroke(Color.TRANSPARENT);
		
		Ellipse ellipsepath = new Ellipse(100, 100, 100, 50);
		ellipsepath.setFill(Color.TRANSPARENT);
		ellipsepath.setStroke(Color.TRANSPARENT);
		
		Rectangle rectangle3 = new Rectangle(195, 274);
		rectangle3.setFill(Color.TRANSPARENT);
		rectangle3.setStroke(Color.TRANSPARENT);
		
		Circle circlepath3 = new Circle(170);
		circlepath3.setFill(Color.TRANSPARENT);
		circlepath3.setStroke(Color.TRANSPARENT);
		
		Rectangle rectangle4 = new Rectangle(620, 500);
		rectangle4.setFill(Color.TRANSPARENT);
		rectangle4.setStroke(Color.TRANSPARENT);
		
		Circle circlepath4 = new Circle(322);
		circlepath4.setFill(Color.TRANSPARENT);
		circlepath4.setStroke(Color.TRANSPARENT);
		
		Rectangle rectangle5 = new Rectangle(263, 500);
		rectangle5.setFill(Color.TRANSPARENT);
		rectangle5.setStroke(Color.TRANSPARENT);
		
		Circle circlepath5 = new Circle(243);
		circlepath5.setFill(Color.TRANSPARENT);
		circlepath5.setStroke(Color.TRANSPARENT);
		
		Rectangle rectangle6 = new Rectangle(16, 437);
		rectangle6.setFill(Color.TRANSPARENT);
		rectangle6.setStroke(Color.TRANSPARENT);
		
		Circle circlepath6 = new Circle(25);
		circlepath6.setFill(Color.TRANSPARENT);
		circlepath6.setStroke(Color.TRANSPARENT);
		
		Rectangle rectangle7 = new Rectangle(126, 344);
		rectangle7.setFill(Color.TRANSPARENT);
		rectangle7.setStroke(Color.TRANSPARENT);
		
		Circle circlepath7 = new Circle(325);
		circlepath7.setFill(Color.TRANSPARENT);
		circlepath7.setStroke(Color.TRANSPARENT);
		
		Rectangle rectangle8 = new Rectangle(126, 344);
		rectangle8.setFill(Color.TRANSPARENT);
		rectangle8.setStroke(Color.TRANSPARENT);
		
		TextField count = new TextField("60");
		count.setAlignment(Pos.CENTER);
		count.setFont(Font.font("Times", FontWeight.BOLD, 30));
		count.setEditable(false);
		count.setPrefWidth(60);
		
		Text gameover = new Text("GAME OVER\n  YOU LOSE");
		gameover.setFill(Color.RED);
		gameover.setStroke(Color.BLACK);
		gameover.setFont(Font.font("Times New Roman", 
			FontWeight.BOLD, 100));
		
		pane.getChildren().addAll(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9, circle10, circle11, circle12, circle13, circle14, circle15, count);
		
		BorderPane border = new BorderPane();
		border.setCenter(pane);
		border.setTop(count);
		
		PathTransition path1 = new PathTransition();
		path1.setPath(circlepath1);
		path1.setNode(circle1);
		path1.setAutoReverse(true);
		path1.setCycleCount(Timeline.INDEFINITE);
		path1.setDuration(Duration.millis(2000));
		path1.play();
		
		PathTransition path2 = new PathTransition();
		path2.setPath(rectangle);
		path2.setNode(circle2);
		path2.setAutoReverse(false);
		path2.setCycleCount(Timeline.INDEFINITE);
		path2.setDuration(Duration.millis(3000));
		path2.play();
		
		 PathTransition path3 = new PathTransition();
		path3.setPath(ellipsepath);
		path3.setNode(circle3);
		path3.setAutoReverse(false);
		path3.setCycleCount(Timeline.INDEFINITE);
		path3.setDuration(Duration.millis(1000));
		path3.play();
		
		 PathTransition path4 = new PathTransition();
		path4.setPath(rectangle2);
		path4.setNode(circle4);
		path4.setAutoReverse(true);
		path4.setCycleCount(Timeline.INDEFINITE);
		path4.setDuration(Duration.millis(3000));
		path4.play();
		
		 PathTransition path5 = new PathTransition();
		path5.setPath(rectangle3);
		path5.setNode(circle5);
		path5.setAutoReverse(false);
		path5.setCycleCount(Timeline.INDEFINITE);
		path5.setDuration(Duration.millis(1020));
		path5.play();
		
		 PathTransition path6 = new PathTransition();
		path6.setPath(rectangle4);
		path6.setNode(circle6);
		path6.setAutoReverse(false);
		path6.setCycleCount(Timeline.INDEFINITE);
		path6.setDuration(Duration.millis(2002));
		path6.play();
		
		 PathTransition path7 = new PathTransition();
		path7.setPath(circlepath3);
		path7.setNode(circle7);
		path7.setAutoReverse(false);
		path7.setCycleCount(Timeline.INDEFINITE);
		path7.setDuration(Duration.millis(2000));
		path7.play();
		
		 PathTransition path8 = new PathTransition();
		path8.setPath(circlepath4);
		path8.setNode(circle8);
		path8.setAutoReverse(false);
		path8.setCycleCount(Timeline.INDEFINITE);
		path8.setDuration(Duration.millis(1000));
		path8.play();
		
		 PathTransition path9 = new PathTransition();
		path9.setPath(circlepath5);
		path9.setNode(circle9);
		path9.setAutoReverse(false);
		path9.setCycleCount(Timeline.INDEFINITE);
		path9.setDuration(Duration.millis(2700));
		path9.play();
		
		 PathTransition path10 = new PathTransition();
		path10.setPath(circlepath6);
		path10.setNode(circle10);
		path10.setAutoReverse(false);
		path10.setCycleCount(Timeline.INDEFINITE);
		path10.setDuration(Duration.millis(4200));
		path10.play();
		
		 PathTransition path11 = new PathTransition();
		path11.setPath(circlepath7);
		path11.setNode(circle11);
		path11.setAutoReverse(false);
		path11.setCycleCount(Timeline.INDEFINITE);
		path11.setDuration(Duration.millis(1350));
		path11.play();
		
		 PathTransition path12 = new PathTransition();
		path12.setPath(rectangle5);
		path12.setNode(circle12);
		path12.setAutoReverse(false);
		path12.setCycleCount(Timeline.INDEFINITE);
		path12.setDuration(Duration.millis(1100));
		path12.play();
		
		 PathTransition path13 = new PathTransition();
		path13.setPath(rectangle6);
		path13.setNode(circle13);
		path13.setAutoReverse(false);
		path13.setCycleCount(Timeline.INDEFINITE);
		path13.setDuration(Duration.millis(1111));
		path13.play();
		
		 PathTransition path14 = new PathTransition();
		path14.setPath(rectangle7);
		path14.setNode(circle14);
		path14.setAutoReverse(false);
		path14.setCycleCount(Timeline.INDEFINITE);
		path14.setDuration(Duration.millis(5052));
		path14.play();
		
		 PathTransition path15 = new PathTransition();
		path15.setPath(rectangle8);
		path15.setNode(circle15);
		path15.setAutoReverse(false);
		path15.setCycleCount(Timeline.INDEFINITE);
		path15.setDuration(Duration.millis(1234));
		path15.play();
		
		circle1.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle1);
				pane.getChildren().remove(circlepath1);
				number();
			}
		});
		
		circle2.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle2);
				pane.getChildren().remove(rectangle);
				number();
			}
		});
		
		circle3.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle3);
				pane.getChildren().remove(ellipsepath);
				number();
			}
		});
		
		circle4.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle4);
				pane.getChildren().remove(rectangle2);
				number();
			}
		});
		
		circle5.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle5);
				pane.getChildren().remove(rectangle3);
				number();
			}
		});
		
		circle6.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle6);
				pane.getChildren().remove(rectangle4);
				number();
			}
		});
		
		circle7.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle7);
				pane.getChildren().remove(circlepath3);
				number();
			}
		});
		
		circle8.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle8);
				pane.getChildren().remove(circlepath4);
				number();
			}
		});
		
		circle9.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle9);
				pane.getChildren().remove(circlepath5);
				number();
			}
		});
		
		circle10.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle10);
				pane.getChildren().remove(circlepath6);
				number();
			}
		});
		
		circle11.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle11);
				pane.getChildren().remove(circlepath7);
				number();
			}
		});
		
		circle12.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle12);
				pane.getChildren().remove(rectangle5);
				number();
			}
		});
		
		circle13.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle13);
				pane.getChildren().remove(rectangle6);
				number();
			}
		});
		
		circle14.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle14);
				pane.getChildren().remove(rectangle7);
				number();
			}
		});
		
		circle15.setOnMouseClicked (e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().remove(circle15);
				pane.getChildren().remove(rectangle8);
				number();
			}
		});
		
		animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			int number = Integer.parseInt(count.getText());
			if (number > 0) {
				number--;
				count.setText(Integer.toString(number));
			}
			else {
				pane.getChildren().add(gameover);
				path1.pause();
				path2.pause();
				path3.pause();
				path4.pause();
				path5.pause();
				path6.pause();
				path7.pause();
				path8.pause();
				path9.pause();
				path10.pause();
				path11.pause();
				path12.pause();
				path13.pause();
				path14.pause();
				path15.pause();
			}
		}));
			
		youwin.setFill(Color.GREEN);
		youwin.setStroke(Color.BLACK);
		youwin.setFont(Font.font("Times", FontWeight.BOLD, 100));
		
		animation.setCycleCount(Timeline.INDEFINITE);
		
		 Scene scene = new Scene(border, 1000, 1000);
		primaryStage.setTitle("Final Project");
		primaryStage.setScene(scene);
		animation.play();
		primaryStage.show();
	}
	
	public void number() {
		if (counter > 1) {
			counter--;
		}
		else if (counter == 1) {
			animation.stop();
			pane.getChildren().add(youwin);
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}