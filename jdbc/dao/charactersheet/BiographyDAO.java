package jdbc.dao.charactersheet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.Biography;

public class BiographyDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createBiography(Biography biography, CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO biography "
				+ "(idbiography, age, height, weight, eyes, skin, hair, character_appearance, "
				+ "allies_organization, character_backstory, additional_features_traits, treasure, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, biography.getIdBio());
			stmt.setString(2, biography.getCharacterName());
			stmt.setString(3, biography.getAge());
			stmt.setString(4, biography.getHeight());
			stmt.setString(5, biography.getWeight());
			stmt.setString(6, biography.getEyes());
			stmt.setString(7, biography.getSkin());
			stmt.setString(8, biography.getHair());
			stmt.setString(9, biography.getCharacterAppearance());
			stmt.setString(10, biography.getAlliesOrganizations());
			stmt.setString(11, biography.getCharacterBackstory());
			stmt.setString(12, biography.getAdditionalFeaturesTraits());
			stmt.setString(13, biography.getTreasure());
			stmt.setInt(14, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteBiography(Biography biography) {
		String sql = "DELETE FROM biography "
				+ "WHERE idbiography=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, biography.getIdBio());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateBiography(Biography biography) {
		String sql = "UPDATE biography "
				+ "SET age=?, height=?, weight=?, eyes=?, skin=?, hair=?, character_appearance=?, "
				+ "allies_organization=?, character_backstory=?, additional_features_traits=?, treasure=? "
				+ "WHERE idbiography=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, biography.getCharacterName());
			stmt.setString(2, biography.getAge());
			stmt.setString(3, biography.getHeight());
			stmt.setString(4, biography.getWeight());
			stmt.setString(5, biography.getEyes());
			stmt.setString(6, biography.getSkin());
			stmt.setString(7, biography.getHair());
			stmt.setString(8, biography.getCharacterAppearance());
			stmt.setString(9, biography.getAlliesOrganizations());
			stmt.setString(10, biography.getCharacterBackstory());
			stmt.setString(11, biography.getAdditionalFeaturesTraits());
			stmt.setString(12, biography.getTreasure());
			stmt.setInt(13, biography.getIdBio());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Biography readBiography(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		Biography biography = new Biography();
		String sql = "SELECT idbiography, age, height, weight, eyes, skin, hair, character_appearance, "
				+ "allies_organization, character_backstory, additional_features_traits, treasure "
				+ "FROM biography "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				biography.setIdBio(rs.getInt("idbiography"));
				biography.setCharacterName(rs.getString("character_name"));
				biography.setAge(rs.getString("age"));
				biography.setHeight(rs.getString("height"));
				biography.setWeight(rs.getString("weight"));
				biography.setEyes(rs.getString("eyes"));
				biography.setSkin(rs.getString("skin"));
				biography.setHair(rs.getString("hair"));
				biography.setCharacterAppearance(rs.getString("character_appearance"));
				biography.setAlliesOrganizations(rs.getString("allies_organizations"));
				biography.setCharacterBackstory(rs.getString("character_backstory"));
				biography.setAdditionalFeaturesTraits(rs.getString("additional_features_traits"));
				biography.setTreasure(rs.getString("treasure"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return biography;
	}
}
