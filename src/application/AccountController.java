package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import application.control.ClienteControl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AccountController implements Initializable  {
	
	@FXML
	private TextField txtRG, txtName, txtUsername, txtEmail, txtPassword, txtConfirmPassword,
	txtDate, txtPhone, txtCEP, txtHouseNumber;
	@FXML
	private Button btnCreate;
	
	String password;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {
		
		try {
			setNotificationDesign();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		btnCreate.setOnAction(e ->{
			if(txtRG.getText().trim().isEmpty() || txtName.getText().trim().isEmpty() ||
					txtUsername.getText().trim().isEmpty()
					|| txtEmail.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty()
					|| txtDate.getText().trim().isEmpty() || txtPhone.getText().trim().isEmpty()
					|| txtCEP.getText().trim().isEmpty()
					|| txtHouseNumber.getText().trim().isEmpty()) {
				
				JOptionPane.showMessageDialog(null, "Preencha todos os Campos Necessários!", "Erro", 0);
				
			} else {
				
				if(txtPassword.getText().equals(txtConfirmPassword.getText())) {
					createNewAccount();
				} else {
					JOptionPane.showMessageDialog(null, "Verifique se digitou a senha corretamente", "Erro", 0);
				}
			}
		});
		
	}
	
	public UIManager setNotificationDesign() throws ClassNotFoundException,
	InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager ui = new UIManager();
		ui.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		return ui;
	}
	
	public void createNewAccount() {
			String rg = txtRG.getText();
			String nome = txtName.getText();
			String userName = txtUsername.getText();
			String email = txtEmail.getText();
			String password = txtPassword.getText();
			String data_nasc = txtDate.getText();
			String telefone = txtPhone.getText();
			String cep = txtCEP.getText();
			int houseNumber = Integer.parseInt(txtHouseNumber.getText());
			ClienteControl.newUser(rg, nome, userName, email, password,
					data_nasc, telefone, cep, houseNumber);
	}
	
	public void metodo() {
		
	}

}
