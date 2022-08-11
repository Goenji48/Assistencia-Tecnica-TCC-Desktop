package application.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import application.util.ConnectionSQL;

public class EquipamentoDAO {
	
	Connection connection = ConnectionSQL.getConnection();
	PreparedStatement st = null;
	ResultSet rs = null;
	Equipamento equipamento;
	
	public int addEquipment(Equipamento equipamento) {
		int result = 0;
		String sql = "insert into Equipamento values(?, ?, ?, ?, ?)";
		
		try {
			st = connection.prepareStatement(sql);
			st.setString(1, equipamento.getTipo_equipamento());
			st.setString(2, equipamento.getDescricao_defeito());
			st.setString(3, equipamento.getNome_equipamento());
			st.setString(4, equipamento.getTipo_defeito());
			st.setString(5, equipamento.getRg());
			
			result = st.executeUpdate();
			
			if(result == 1) {
				JOptionPane.showMessageDialog(null, "Equipamento Registrado com Sucesso");
			}
			
			if(connection.getAutoCommit() == true) {
				System.out.println("Commitado");
			} else {
				System.out.println("Não Commitado");
			}
			
			connection.close();
			st.close();
			return result;
			
		} catch (SQLException e) {
			try {
				if(connection != null) {
					connection.rollback();
				}
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
			return 0;
		}
	}

}
