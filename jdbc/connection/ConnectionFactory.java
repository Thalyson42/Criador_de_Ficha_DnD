package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	private static Connection connection = null;
	
	public static Connection createConnection() throws SQLException{
		try {
			String url = "jdbc:mysql://localhost:3306/projeto_bd?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String password = "12369514";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected!");
			return connection;
		
		}catch (SQLException msg) {
			throw new RuntimeException(msg);
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
