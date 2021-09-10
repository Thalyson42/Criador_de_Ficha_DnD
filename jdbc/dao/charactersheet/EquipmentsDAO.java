package jdbc.dao.charactersheet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import jdbc.model.characterSheet.Equipments;
import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;

public class EquipmentsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createEquipments(CharacterSheet sheet, Equipments equips) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO equipments (idequipments, equipment, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, equips.getIDEquipament());
			stmt.setString(2, equips.getEquipment());
			stmt.setInt(3, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteEquipments(CharacterSheet sheet, Equipments equips) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "DELETE FROM equipments "
				+ "WHERE charactersheet_idcharactersheet=? AND idequipments=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			stmt.setInt(2, equips.getIDEquipament());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateEquipments(CharacterSheet sheet, Equipments equips) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "UPDATE equipments SET equipment=? "
				+ "WHERE charactersheet_idcharactersheet=? AND idequipments=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, equips.getEquipment());
			stmt.setInt(2, idCharacterSheet);
			stmt.setInt(3, equips.getIDEquipament());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<Equipments> readEquipments(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		ArrayList<Equipments> equips = new ArrayList<Equipments>();
		String sql = "SELECT idequipments, equipment "
				+ "FROM equipments "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Equipments equip = new Equipments();
				
				equip.setIDEquipment(rs.getInt("idequipments"));
				equip.setEquipment(rs.getString("equipment"));
				
				equips.add(equip);
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return equips;
	}
}
