package jdbc.dao.charactersheet.characteristics;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.characteristics.Characteristics;
import jdbc.connection.ConnectionFactory;

public class CharacteristicsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createCharacteristics(CharacterSheet sheet, Characteristics characteristics) {
		int sheetID = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO characteristics (idcharacteristics, ideals, bonds, flaws, charactersheet_idcharactersheet)"
				+ "VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, characteristics.getIDCharacteristic());
			stmt.setString(2, characteristics.getIdeals());
			stmt.setString(3, characteristics.getBonds());
			stmt.setString(4, characteristics.getFlaws());
			stmt.setInt(5, sheetID);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteCharacteristics(Characteristics characteristics) {
		String sql = "DELETE FROM characteristics WHERE idcharacteristics=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, characteristics.getIDCharacteristic());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateCharacteristics(Characteristics characteristics) {
		String sql = "UPDATE characteristics "
				+ "SET ideals=?, bonds=?, flaws=? "
				+ "WHERE idcharacteristics=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, characteristics.getIdeals());
			stmt.setString(2, characteristics.getBonds());
			stmt.setString(3, characteristics.getFlaws());
			stmt.setInt(4, characteristics.getIDCharacteristic());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Characteristics readCharacteristics(CharacterSheet sheet) {
		int sheetID = sheet.getIdCharacterSheet();
		Characteristics characteristics = new Characteristics();
		String sql = "SELECT idcharacteristics, ideals, bonds, flaws "
				+ "FROM characteristics "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetID);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				characteristics.setIDCharacteristic(rs.getInt("idcharacteristics"));
				characteristics.setIdeals(rs.getString("ideals"));
				characteristics.setBonds(rs.getString("bonds"));
				characteristics.setFlaws(rs.getString("flaws"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return characteristics;
	}
}
