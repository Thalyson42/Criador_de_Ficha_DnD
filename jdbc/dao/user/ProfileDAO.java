package jdbc.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import jdbc.connection.ConnectionFactory;
import jdbc.model.user.User;
import jdbc.model.user.Profile;

public class ProfileDAO {
	private Connection connection = null;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createProfile(User user) {
		Profile profile = user.getProfile();
		String sql = "INSERT INTO userprofile (idprofile, user_iduser, profile_name, age, sex, profile_description, email, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, profile.getIdProfile());
			stmt.setInt(2, user.getIdUser());
			stmt.setString(3, profile.getProfileName());
			stmt.setInt(4, profile.getAge());
			stmt.setString(5, profile.getSex());
			stmt.setString(6, profile.getProfileDescription());
			stmt.setString(7, profile.getEmail());
			stmt.setString(8, profile.getPhone());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteProfile(Profile profile) {
		int id = profile.getIdProfile();
		String sql = "DELETE FROM userprofile WHERE idprofile=?";
		
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
	
	public void updateProfile(Profile profile) {
		String sql = "UPDATE userprofile SET profile_name=?, age=?, sex=?, profile_description=?, email=?, phone=? WHERE idprofile=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, profile.getProfileName());
			stmt.setInt(2, profile.getAge());
			stmt.setString(3, profile.getSex());
			stmt.setString(4, profile.getProfileDescription());
			stmt.setString(5, profile.getEmail());
			stmt.setString(6, profile.getPhone());
			stmt.setInt(7, profile.getIdProfile());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Profile readProfile(User user) {
		int userID = user.getIdUser();
		Profile profile = new Profile();
		String sql = "SELECT idprofile, profile_name, age, sex, profile_description, email, phone FROM userprofile"
				+ " WHERE user_iduser=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, userID);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				profile.setIdProfile(rs.getInt("idprofile"));
				profile.setProfileName(rs.getString("profile_name"));
				profile.setAge(rs.getInt("age"));
				profile.setSex(rs.getString("sex"));
				profile.setProfileDescription(rs.getString("profile_description"));
				profile.setEmail(rs.getString("email"));
				profile.setPhone(rs.getString("phone"));
			}
			stmt.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return profile;
	}
}
