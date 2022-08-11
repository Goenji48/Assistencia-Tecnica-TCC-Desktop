package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.control.ClienteControl;
import application.model.ClienteDAO;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	@FXML
	private Button btnLogin, btnNew;
	@FXML
	private TextField txtEmail;
	@FXML
	private PasswordField txtSenha;
	ClienteControl control;
	static String name = "";

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	
	public void login() {
		String email = txtEmail.getText();
		String password = txtSenha.getText();
		name = email;
		ClienteControl.loginUser(email, password);
		
	}
	
	public void createAccount() {
		InitializeFXMLControllers.openNewAccountWindow();
	}
	 
		
	}


