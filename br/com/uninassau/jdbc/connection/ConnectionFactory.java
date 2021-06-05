package br.com.uninassau.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	public static Connection createConnection() throws SQLException{
		try {
			
			Connection conexao = null;
			String url = "jdbc:mysql://localhost:3306/projeto_bd?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String password = "12369514";
			conexao = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");
			return conexao;
		
		}catch (SQLException msg) {
			throw new RuntimeException(msg);
		}
	}
}
