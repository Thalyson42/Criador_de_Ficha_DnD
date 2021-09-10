package jdbc.dao.charactersheet.attribute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.attribute.AttributeMod;

public class AttributeModDAO {
	private Connection connection;
	
	public Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}

	public void createAttributeMod(AttributeMod attributeMod, CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO attribute_mod "
				+ "(idattribute_mod, strength_mod, dexterity_mod, constitution_mod, intelligence_mod, wisdom_mod, charisma_mod, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attributeMod.getIdAttributeMod());
			stmt.setInt(2, attributeMod.getStrengthMod());
			stmt.setInt(3, attributeMod.getDexterityMod());
			stmt.setInt(4, attributeMod.getConstitutionMod());
			stmt.setInt(5, attributeMod.getIntelligenceMod());
			stmt.setInt(6, attributeMod.getWisdomMod());
			stmt.setInt(7, attributeMod.getCharismaMod());
			stmt.setInt(8, sheetId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteAttributeMod(AttributeMod attributeMod) {
		String sql = "DELETE FROM attribute_mod WHERE idattribute_mod=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attributeMod.getIdAttributeMod());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateAttributeMod(AttributeMod attributeMod) {
		String sql = "UPDATE attribute_mod SET "
				+ "strength_mod=?, dexterity_mod=?, constitution_mod=?, intelligence_mod=?, wisdom_mod=?, charisma_mod=? "
				+ "WHERE idattribute_mod=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attributeMod.getStrengthMod());
			stmt.setInt(2, attributeMod.getDexterityMod());
			stmt.setInt(3, attributeMod.getConstitutionMod());
			stmt.setInt(4, attributeMod.getIntelligenceMod());
			stmt.setInt(5, attributeMod.getWisdomMod());
			stmt.setInt(6, attributeMod.getCharismaMod());
			stmt.setInt(7, attributeMod.getIdAttributeMod());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public AttributeMod readAttributeMod(CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		AttributeMod attributeMod = new AttributeMod();
		String sql = "SELECT idattribute_mod, strength_mod, dexterity_mod, constitution_mod, intelligence_mod, wisdom_mod, charisma_mod "
				+ "FROM attribute_mod "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				attributeMod.setIdAttributeMod(rs.getInt("idattribute_mod"));
				attributeMod.setStrengthMod(rs.getInt("strength_mod"));
				attributeMod.setDexterityMod(rs.getInt("dexterity_mod"));
				attributeMod.setConstitutionMod(rs.getInt("constitution_mod"));
				attributeMod.setIntelligenceMod(rs.getInt("intelligence_mod"));
				attributeMod.setWisdomMod(rs.getInt("wisdom_mod"));
				attributeMod.setCharismaMod(rs.getInt("charisma_mod"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return attributeMod;
	}
}
