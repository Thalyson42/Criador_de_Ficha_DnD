package jdbc.dao.charactersheet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.ProficienceTools;


public class ProficienceToolsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createProficienceTools(CharacterSheet sheet, ProficienceTools proficienceTools) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO proficience_tools (idproficience_tools, proficience_tool, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, proficienceTools.getIDProficienceTools());
			stmt.setString(2, proficienceTools.getProficienceTools());
			stmt.setInt(3, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteProficienceTools(CharacterSheet sheet, ProficienceTools proficienceTools) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "DELETE FROM proficience_tools "
				+ "WHERE charactersheet_idcharactersheet=? AND idproficience_tools=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			stmt.setInt(2, proficienceTools.getIDProficienceTools());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateProficienceTools(CharacterSheet sheet, ProficienceTools proficienceTools) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "UPDATE proficience_tools SET proficience_tool=? "
				+ "WHERE charactersheet_idcharactersheet=? AND idproficience_tools=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, proficienceTools.getProficienceTools());
			stmt.setInt(2, idCharacterSheet);
			stmt.setInt(3, proficienceTools.getIDProficienceTools());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<ProficienceTools> readProficienceTools(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		ArrayList<ProficienceTools> proficienceTools = new ArrayList<ProficienceTools>();
		String sql = "SELECT idproficience_tools, proficience_tool "
				+ "FROM proficience_tools "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ProficienceTools proficienceTool = new ProficienceTools();
				
				proficienceTool.setIDProficienceTools(rs.getInt("idproficience_tools"));
				proficienceTool.setProficienceTools(rs.getString("proficience_tool"));
				
				proficienceTools.add(proficienceTool);
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return proficienceTools;
	}
}
