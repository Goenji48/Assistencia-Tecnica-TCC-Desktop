package application.control;

import application.model.Equipamento;
import application.model.EquipamentoDAO;

public class EquipamentoControl {
	
	public static void addNewEquipment(String tipo_equipamento, String descricao_defeito, 
			String nome_equipamento, String tipo_defeito, String rg) {
		Equipamento equipamento = new Equipamento();
		equipamento.setTipo_defeito(tipo_defeito);
		equipamento.setDescricao_defeito(descricao_defeito);
		equipamento.setNome_equipamento(nome_equipamento);
		equipamento.setTipo_defeito(tipo_defeito);
		equipamento.setRg(rg);
		new EquipamentoDAO().addEquipment(equipamento);
	}

}
