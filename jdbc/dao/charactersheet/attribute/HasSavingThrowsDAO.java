package jdbc.dao.charactersheet.attribute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.attribute.HasSavingThrows;

public class HasSavingThrowsDAO {
	private Connection connection;
	
	public Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}

	public void createHasSavingThrows(HasSavingThrows hasSavingThrows, CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO has_savingthrows "
				+ "(idhas_savingthrows, has_savingstrength, has_savingdexterity, has_savingconstitution, has_savingintelligence, has_savingwisdom, has_savingcharisma, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, hasSavingThrows.getIdHasSavingThrows());
			stmt.setBoolean(2, hasSavingThrows.isHasSavingStrength());
			stmt.setBoolean(3, hasSavingThrows.isHasSavingDexterity());
			stmt.setBoolean(4, hasSavingThrows.isHasSavingContitution());
			stmt.setBoolean(5, hasSavingThrows.isHasSavingIntellingece());
			stmt.setBoolean(6, hasSavingThrows.isHasSavingWisdom());
			stmt.setBoolean(7, hasSavingThrows.isHasSavingCharisma());
			stmt.setInt(8, sheetId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteHasSavingThrows(HasSavingThrows hasSavingThrows) {
		String sql = "DELETE FROM has_savingthrows WHERE idhas_savingthrows=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, hasSavingThrows.getIdHasSavingThrows());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateHasSavingThrows(HasSavingThrows hasSavingThrows) {
		String sql = "UPDATE has_savingthrows SET "
				+ "has_savingstrength=?, has_savingdexterity=?, has_savingconstitution=?, has_savingintelligence=?, has_savingwisdom=?, has_savingcharisma=? "
				+ "WHERE idhas_savingthrows=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setBoolean(1, hasSavingThrows.isHasSavingStrength());
			stmt.setBoolean(2, hasSavingThrows.isHasSavingDexterity());
			stmt.setBoolean(3, hasSavingThrows.isHasSavingContitution());
			stmt.setBoolean(4, hasSavingThrows.isHasSavingIntellingece());
			stmt.setBoolean(5, hasSavingThrows.isHasSavingWisdom());
			stmt.setBoolean(6, hasSavingThrows.isHasSavingCharisma());
			stmt.setInt(7, hasSavingThrows.getIdHasSavingThrows());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public HasSavingThrows readHasSavingThrows(CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		HasSavingThrows hasSavingThrows = new HasSavingThrows();
		String sql = "SELECT idhas_savingthrows, has_savingstrength, has_savingdexterity, has_savingconstitution, has_savingintelligence, has_savingwisdom, has_savingcharisma "
				+ "FROM has_savingthrows "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				hasSavingThrows.setIdHasSavingThrows(rs.getInt("idhas_savingthrows"));
				hasSavingThrows.setHasSavingStrength(rs.getBoolean("has_savingstrength"));
				hasSavingThrows.setHasSavingDexterity(rs.getBoolean("has_savingdexterity"));
				hasSavingThrows.setHasSavingContitution(rs.getBoolean("has_savingconstitution"));
				hasSavingThrows.setHasSavingIntellingece(rs.getBoolean("has_savingintelligence"));
				hasSavingThrows.setHasSavingWisdom(rs.getBoolean("has_savingwisdom"));
				hasSavingThrows.setHasSavingCharisma(rs.getBoolean("has_savingcharisma"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return hasSavingThrows;
	}
}
