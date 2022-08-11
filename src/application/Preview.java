package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Preview extends Application {
	
	public static Stage stage_main;

	@Override
	public void start(Stage stage) throws Exception {
		try {
		stage_main = stage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/preview.fxml"));
		Pane root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Assistência Técnica - Preview");
		stage.getIcons().add(new Image("application/logo.png"));
		stage.setResizable(false);
		stage.show();
		stage.setOnCloseRequest(w ->{
			Platform.exit();
			System.exit(0);
		});
	} catch (Exception e) {
		e.printStackTrace();	}
} 
	
	public static void main(String[] args) {
		launch(args);
	}

}
