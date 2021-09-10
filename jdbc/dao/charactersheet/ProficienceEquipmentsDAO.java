package jdbc.dao.charactersheet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.ProficienceEquipments;

public class ProficienceEquipmentsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createProficienceEquipments(CharacterSheet sheet, ProficienceEquipments proficienceEquipments) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO proficience_equipments (idproficience_equipments, proficience_equip, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, proficienceEquipments.getIdProficienceEquipment());
			stmt.setString(2, proficienceEquipments.getProficienceEquipment());
			stmt.setInt(3, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteProficienceEquipments(CharacterSheet sheet, ProficienceEquipments proficienceEquipments) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "DELETE FROM proficience_equipments "
				+ "WHERE charactersheet_idcharactersheet=? AND idproficience_equipments=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			stmt.setInt(2, proficienceEquipments.getIdProficienceEquipment());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateProficienceEquipments(CharacterSheet sheet, ProficienceEquipments proficienceEquipments) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "UPDATE proficience_equipments SET proficience_equip=? "
				+ "WHERE charactersheet_idcharactersheet=? AND idproficience_equipments=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, proficienceEquipments.getProficienceEquipment());
			stmt.setInt(2, idCharacterSheet);
			stmt.setInt(3, proficienceEquipments.getIdProficienceEquipment());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<ProficienceEquipments> readProficienceEquipments(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		ArrayList<ProficienceEquipments> proficienceEquipments = new ArrayList<ProficienceEquipments>();
		String sql = "SELECT idproficience_equipments, proficience_equip "
				+ "FROM proficience_equipments "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ProficienceEquipments proficienceEquipment = new ProficienceEquipments();
				
				proficienceEquipment.setIdProficienceEquipment(rs.getInt("idproficience_equipments"));
				proficienceEquipment.setProficienceEquipment(rs.getString("proficience_equip"));
				
				proficienceEquipments.add(proficienceEquipment);
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return proficienceEquipments;
	}

}
