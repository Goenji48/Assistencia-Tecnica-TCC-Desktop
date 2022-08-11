package application;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InitializeFXMLControllers {
	
	public static Stage stage, primaryStage, account_stage;
	
	public static void openHome() {
		try {
			stage = new Stage();
			FXMLLoader loader = new FXMLLoader(Preview.class.getResource("fxml/home.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Assistência Técnica - Home");
			stage.getIcons().add(new Image("application/logo.png"));
			stage.show();
			stage.setOnCloseRequest(w ->{
				Platform.exit();
				System.exit(0);
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openNewAccountWindow() {
		try {
			account_stage = new Stage();
			FXMLLoader loader = new FXMLLoader(Preview.class.getResource("fxml/newAccount.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			account_stage.setScene(scene);
			account_stage.setResizable(false);
			account_stage.setTitle("Criar uma Nova Conta");
			account_stage.show();
			account_stage.setOnCloseRequest(w -> {
				stage.close();
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openLogin() {
		try {
			primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(Preview.class.getResource("fxml/login.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Assistência Técnica - Login");
			primaryStage.getIcons().add(new Image("application/logo.png"));
			primaryStage.show();
			primaryStage.setOnCloseRequest(w -> {
				Platform.exit();
				System.exit(0);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openEquipmentWindow() {
		try {
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader(Preview.class.getResource("fxml/equipment.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Cadastrar Equipamento");
			stage.show();
			stage.setOnCloseRequest(w -> {
				stage.close();
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
