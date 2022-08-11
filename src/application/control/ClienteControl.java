package application.control;

import application.model.Cliente;
import application.model.ClienteDAO;

public class ClienteControl {
	
	public static void loginUser(String email, String senha) {
		Cliente cliente = new Cliente();
		cliente.setEmail(email);
		cliente.setSenha(senha);
		new ClienteDAO().loginUser(cliente);
	}
	
	public static void newUser(String rg, String name, String username, String email, 
			String senha, String data, String telefone, String cep,
			int houseNumber) {
		Cliente cliente = new Cliente();
		cliente.setRg(rg);
		cliente.setNome(name);
		cliente.setUsername(username);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		cliente.setData_nasc(data);
		cliente.setTelefone(telefone);
		cliente.setCep(cep);
		cliente.setHouseNumber(houseNumber);
		new ClienteDAO().newUser(cliente);
	}
	
}
