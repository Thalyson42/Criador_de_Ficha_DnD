package jdbc.dao.charactersheet.attribute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.attribute.SavingThrows;

public class SavingThrowsDAO {
	private Connection connection;
	
	public Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}

	public void createSavingThrows(SavingThrows savingThrows, CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO saving_throws "
				+ "(idsaving_throws, saving_strength, saving_dexterity, saving_contitution, saving_intelligence, saving_wisdom, saving_charisma, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, savingThrows.getIdSavingThrows());
			stmt.setInt(2, savingThrows.getSavingStrength());
			stmt.setInt(3, savingThrows.getSavingDexterity());
			stmt.setInt(4, savingThrows.getSavingContitution());
			stmt.setInt(5, savingThrows.getSavingIntelligence());
			stmt.setInt(6, savingThrows.getSavingWisdom());
			stmt.setInt(7, savingThrows.getSavingCharisma());
			stmt.setInt(8, sheetId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteSavingThrows(SavingThrows attributeMod) {
		String sql = "DELETE FROM saving_throws WHERE idsaving_throws=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attributeMod.getIdSavingThrows());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateSavingThrows(SavingThrows attributeMod) {
		String sql = "UPDATE saving_throws SET "
				+ "saving_strength=?, saving_dexterity=?, saving_contitution=?, saving_intelligence=?, saving_wisdom=?, saving_charisma=? "
				+ "WHERE idsaving_throws=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, attributeMod.getSavingStrength());
			stmt.setInt(2, attributeMod.getSavingDexterity());
			stmt.setInt(3, attributeMod.getSavingContitution());
			stmt.setInt(4, attributeMod.getSavingIntelligence());
			stmt.setInt(5, attributeMod.getSavingWisdom());
			stmt.setInt(6, attributeMod.getSavingCharisma());
			stmt.setInt(7, attributeMod.getIdSavingThrows());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public SavingThrows readSavingThrows(CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		SavingThrows savingThrows = new SavingThrows();
		String sql = "SELECT idsaving_throws, saving_strength, saving_dexterity, saving_contitution, saving_intelligence, saving_wisdom, saving_charisma "
				+ "FROM saving_throws "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				savingThrows.setIdSavingThrows(rs.getInt("idsaving_throws"));
				savingThrows.setSavingStrength(rs.getInt("saving_strength"));
				savingThrows.setSavingDexterity(rs.getInt("saving_dexterity"));
				savingThrows.setSavingContitution(rs.getInt("saving_contitution"));
				savingThrows.setSavingIntelligence(rs.getInt("saving_intelligence"));
				savingThrows.setSavingWisdom(rs.getInt("saving_wisdom"));
				savingThrows.setSavingCharisma(rs.getInt("saving_charisma"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return savingThrows;
	}
}
