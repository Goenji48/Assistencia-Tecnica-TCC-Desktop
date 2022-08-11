package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.control.EquipamentoControl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EquipmentController implements Initializable {
	
	@FXML
	private TextArea txaRelato;
	@FXML
	private TextField txtNomeEquipamento, txtRGequipment;
	@FXML
	private ComboBox<String> tipoDefeito, tipoEquipamento;
	@FXML
	private Button btnCadastrar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//43.291.849-1
		comboBoxConfig();
	}
	
	public void comboBoxConfig() {
		ObservableList<String> equipmentTips = FXCollections.observableArrayList(
				"Computadores",
				"Notebook",
				"Celulares",
				"Televisores",
				"Tablets",
				"Eletrodomésticos"
				);
		
		ObservableList<String> problemTips = FXCollections.observableArrayList
				(
				"Sem Vídeo",
				"Não Liga",
				"Liga, entra no Sistema operacional mas depois desliga"
				);
		
		tipoEquipamento.setItems(equipmentTips);
		tipoDefeito.setItems(problemTips);
	}
	
	public void setEquipment() {
		String tipo_equipamento = "alwfnlakwfn";//tipoEquipamento.getSelectionModel().getSelectedItem();
		String descricao_defeito = "b";//txaRelato.getText();
		String nome_equipamento = "c";//txtNomeEquipamento.getText();
		String tipo_defeito = "lkawflknawl";//tipoDefeito.getSelectionModel().getSelectedItem();
		String rg = "e";//txtRGequipment.getText();
		
		
		System.out.println(tipo_equipamento);
		EquipamentoControl.addNewEquipment(tipo_equipamento, descricao_defeito, nome_equipamento,
				tipo_defeito, rg);
	}

}
