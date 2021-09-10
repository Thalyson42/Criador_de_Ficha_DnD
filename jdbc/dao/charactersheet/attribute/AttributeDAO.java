package jdbc.dao.charactersheet.attribute;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.attribute.Attribute;

public class AttributeDAO {
	private Connection connection;
	
	public Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}

	public void createAttribute(Attribute attribute, CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO attribute "
				+ "(idattribute, strength, dexterity, constitution, intelligence, wisdom, charisma, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attribute.getIdattribute());
			stmt.setInt(2, attribute.getStrength());
			stmt.setInt(3, attribute.getDexterity());
			stmt.setInt(4, attribute.getConstitution());
			stmt.setInt(5, attribute.getIntelligence());
			stmt.setInt(6, attribute.getWisdom());
			stmt.setInt(7, attribute.getCharisma());
			stmt.setInt(8, sheetId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteAttribute(Attribute attribute) {
		String sql = "DELETE FROM attribute WHERE idattribute=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attribute.getIdattribute());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateAttribute(Attribute attribute) {
		String sql = "UPDATE attribute SET "
				+ "strength=?, dexterity=?, constitution=?, intelligence=?, wisdom=?, charisma=? "
				+ "WHERE idattribute=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attribute.getStrength());
			stmt.setInt(2, attribute.getDexterity());
			stmt.setInt(3, attribute.getConstitution());
			stmt.setInt(4, attribute.getIntelligence());
			stmt.setInt(5, attribute.getWisdom());
			stmt.setInt(6, attribute.getCharisma());
			stmt.setInt(7, attribute.getIdattribute());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Attribute readAttribute(CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		Attribute attribute = new Attribute();
		String sql = "SELECT idattribute, strength, dexterity, constitution, intelligence, wisdom, charisma "
				+ "FROM attribute "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				attribute.setIdattribute(rs.getInt("idattribute"));
				attribute.setStrength(rs.getInt("strength"));
				attribute.setDexterity(rs.getInt("dexterity"));
				attribute.setConstitution(rs.getInt("constitution"));
				attribute.setIntelligence(rs.getInt("intelligence"));
				attribute.setWisdom(rs.getInt("wisdom"));
				attribute.setCharisma(rs.getInt("charisma"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return attribute;
	}
}
