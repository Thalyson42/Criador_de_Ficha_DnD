package jdbc.dao.charactersheet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.ClassFeats;

public class ClassFeatsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createClassFeats(CharacterSheet sheet, ClassFeats feats) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO class_feats "
				+ "(idclass_feats, feats, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, feats.getIDClassFeats());
			stmt.setString(2, feats.getClassFeats());
			stmt.setInt(3, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteClassFeats(CharacterSheet sheet, ClassFeats feats) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "DELETE FROM class_feats "
				+ "WHERE charactersheet_idcharactersheet=? AND idclass_feats=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			stmt.setInt(2, feats.getIDClassFeats());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateClassFeats(CharacterSheet sheet, ClassFeats feats) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "UPDATE class_feats SET "
				+ "feats=? "
				+ "WHERE charactersheet_idcharactersheet=? AND idclass_feats=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, feats.getClassFeats());
			stmt.setInt(2, idCharacterSheet);
			stmt.setInt(3, feats.getIDClassFeats());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<ClassFeats> readClassFeats(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		ArrayList<ClassFeats> feats = new ArrayList<ClassFeats>();
		String sql = "SELECT idclass_feats, feats "
				+ "FROM class_feats "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ClassFeats feat = new ClassFeats();
				
				feat.setIDClassFeats(rs.getInt("idclass_feats"));
				feat.setClassFeats(rs.getString("feats"));
				
				feats.add(feat);
			}
			
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return feats;
		
	}
}
