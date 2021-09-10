package jdbc.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.model.user.User;
import jdbc.connection.*;

public class UserDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createUser(String login, String password) {
		String sql = "INSERT INTO user (login, user_password) VALUES (?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, password);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Boolean verifyLogin(String login, String password) {
		String sql = "SELECT * FROM user WHERE login=? AND user_password=?";
		PreparedStatement stmt = null;
		try {
			UserDAO userDao = new UserDAO();
			
			stmt = userDao.getConnection().prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				stmt.close();
				rs.close();
				return true;
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public void deleteUser(User user) {
		int id = user.getIdUser();
		String sql = "DELETE FROM user WHERE iduser=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateUserLogin(User user, String newLogin) {
		int id = user.getIdUser();
		
		String sql = "UPDATE user SET login=? WHERE iduser=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, newLogin);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateUserPassword(User user, String newPassword) {
		int id = user.getIdUser();
		String sql = "UPDATE user SET user_password=? WHERE iduser=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, newPassword);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public User readUser(String login, String password) {
		User user = new User();
		String sql = "SELECT iduser, login, user_password FROM user WHERE login=? AND user_password=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				user.setIdUser(rs.getInt("iduser"));
				user.setLogin(rs.getString("login"));
				user.setPassword(rs.getString("user_password"));
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return user;
	}
}
