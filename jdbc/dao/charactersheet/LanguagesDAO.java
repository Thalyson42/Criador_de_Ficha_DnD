package jdbc.dao.charactersheet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.Languages;

public class LanguagesDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createLanguages(CharacterSheet sheet, Languages language) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO languages (idlanguages, language, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, language.getIDLanguage());
			stmt.setString(2, language.getLanguage());
			stmt.setInt(3, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteLanguages(CharacterSheet sheet, Languages language) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "DELETE FROM languages "
				+ "WHERE charactersheet_idcharactersheet=? AND idlanguages=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			stmt.setInt(2, language.getIDLanguage());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateLanguages(CharacterSheet sheet, Languages language) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "UPDATE languages SET language=? "
				+ "WHERE charactersheet_idcharactersheet=? AND idlanguages=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, language.getLanguage());
			stmt.setInt(2, idCharacterSheet);
			stmt.setInt(3, language.getIDLanguage());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<Languages> readLanguages(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		ArrayList<Languages> languages = new ArrayList<Languages>();
		String sql = "SELECT idlanguages, language "
				+ "FROM languages "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Languages language = new Languages();
				
				language.setIDLanguage(rs.getInt("idlanguages"));
				language.setLanguage(rs.getString("language"));
				
				languages.add(language);
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return languages;
	}
}
