package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.ClienteDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HomeController implements Initializable{
	
	@FXML
	private Label labelWelcome;
	@FXML
	private Button btnExit ;
	@FXML
	private Pane btnRegistryEquipment;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		InitializeFXMLControllers.primaryStage.close();
		String name = LoginController.name;
		labelWelcome.setText("Bem Vindo " + name + "!");
		
		btnExit.setOnAction(e ->{
			InitializeFXMLControllers.stage.close();
			InitializeFXMLControllers.primaryStage.show();
		});
		
		btnRegistryEquipment.setOnMouseClicked(m ->{
			InitializeFXMLControllers.openEquipmentWindow();
		});
		
		btnRegistryEquipment.setOnMouseEntered(me ->{
			btnRegistryEquipment.setStyle("-fx-background-color: pink");
		});
		
		btnRegistryEquipment.setOnMouseExited(me1 ->{
			btnRegistryEquipment.setStyle("-fx-background-color: violet");
		});
	}
	
}
