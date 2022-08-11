package application.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
	
	static String nameBD = "AssistenciaTecnicaTeste";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
		"user=sa; password=12345;" + "databaseName=" + nameBD + ";"
					);
		} catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		try {
			if(getConnection().isReadOnly()) {
				System.out.println("Conectado!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
