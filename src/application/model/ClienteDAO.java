package application.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import application.InitializeFXMLControllers;
import application.util.ConnectionSQL;

public class ClienteDAO {
	
	Connection connection = ConnectionSQL.getConnection();
	PreparedStatement st = null;
	ResultSet rs = null;
	Cliente cliente;

	public int newUser(Cliente cliente) {
		int result = 0;
		String sql = "Insert into Cliente values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		
		try {
			st = connection.prepareStatement(sql);
			st.setString(1, cliente.getRg());
			st.setString(2, cliente.getNome());
			st.setString(3, cliente.getUsername());
			st.setString(4, cliente.getEmail());
			st.setString(5, cliente.getSenha());
			st.setString(6, cliente.getData_nasc());
			st.setString(7, cliente.getTelefone());
			st.setString(8, cliente.getCep());
			st.setInt(9, cliente.getHouseNumber());
			
			result = st.executeUpdate();
			
			if(result == 1) {
				InitializeFXMLControllers.account_stage.close();
				JOptionPane.showMessageDialog(null, "Conta Criada com Sucesso");
			}
			connection.close();
			st.close();
			return result;
			
		} catch (SQLException e) {
			try {
				if(connection != null) {
					connection.rollback();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return 0;
		}
	}
	
	public void loginUser(Cliente cliente) {
		String sql = "SELECT email, senha from Cliente WHERE email = ? and senha = ?";
		
		try {
			st = connection.prepareStatement(sql);
			
			st.setString(1, cliente.getEmail());
			st.setString(2, cliente.getSenha());
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				InitializeFXMLControllers.openHome();
				cliente = new Cliente();
				cliente.setNome(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				//System.out.println("Logado");
				
			} else {
				JOptionPane.showMessageDialog(null, "Nome ou senha inválida ou Usuário não Encontrado!", "Erro", 0);
			}
			
			rs.close();
			st.close();
			connection.close();
		} catch(SQLException e) {
			Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		}
		
	}

}
