package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PreviewController implements Initializable{
	
	@FXML
	private MediaView video;
	
	Media media;
	Media audio;
	MediaPlayer mediaPlayer;
	MediaPlayer audioPlayer;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		File file = new File("src/application/preview.mp4");
		File audioFile = new File("src/application/effect_sound.mp3");
		media = new Media(file.getAbsoluteFile().toURI().toString());
		audio = new Media(audioFile.getAbsoluteFile().toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		audioPlayer = new MediaPlayer(audio);
		video.setMediaPlayer(mediaPlayer);
		
		ScaleTransition tt = new ScaleTransition();
		tt.setNode(video);
		tt.setDuration(Duration.seconds(2));
		tt.setToX(1);
		tt.setToY(1);
		tt.play();
		mediaPlayer.play();
		audioPlayer.play();
		mediaPlayer.setOnEndOfMedia(new Runnable() {

			@Override
			public void run() {
				Preview.stage_main.close();
				InitializeFXMLControllers.openLogin();
			}
			
		});
	}


}
