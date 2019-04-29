import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class ProgrammingExercise16_21 extends Application {
	Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	Timeline animation;
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		TextField count = new TextField();
		count.setAlignment(Pos.CENTER);
		count.setFont(Font.font(60));
		mediaPlayer.setCycleCount(Timeline.INDEFINITE);
		
		animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			int number = Integer.parseInt(count.getText());
			if (number > 0) {
				number--;
				count.setText(Integer.toString(number));
			}
			else {
				mediaPlayer.play();
			}
		}));
		
		animation.setCycleCount(Timeline.INDEFINITE);
		
		count.setOnKeyPressed(e -> {
					if (e.getCode() == KeyCode.ENTER) {
						animation.play();
					}
				});
		
		Scene scene = new Scene(pane, 500, 100);
		primaryStage.setTitle("ProgrammingExercise16-21");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.getChildren().add(count);
	}
	
	private static void main(String[] args) {
		Application.launch(args);
	}
}