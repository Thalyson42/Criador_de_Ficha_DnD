package jdbc.dao.charactersheet.spell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.spells.Cantrips;
import jdbc.model.characterSheet.spells.Spells;

public class CantripsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createCantrips(Spells spells, Cantrips cantrips) {
		int idSpells = spells.getIdSpells();
		String sql = "INSERT INTO cantrip (idcantrip, cantrip_name, cantrip_description, spells_idspells) "
				+ "VALUES (?, ?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, cantrips.getIDCantrip());
			stmt.setString(2, cantrips.getCantripName());
			stmt.setString(3, cantrips.getCantripDescription());
			stmt.setInt(4, idSpells);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteCantrips(Spells spells, Cantrips cantrips) {
		int idSpells = spells.getIdSpells();
		String sql = "DELETE FROM cantrip WHERE spells_idspells=? AND idcantrip=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idSpells);
			stmt.setInt(2, cantrips.getIDCantrip());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateCantrips(Spells spells, Cantrips cantrips) {
		int idSpells = spells.getIdSpells();
		String sql = "UPDATE cantrip SET "
				+ "cantrip_name=?, cantrip_description=? "
				+ "WHERE spells_idspells=? AND idcantrip=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, cantrips.getCantripName());
			stmt.setString(2, cantrips.getCantripDescription());
			stmt.setInt(3, idSpells);
			stmt.setInt(4, cantrips.getIDCantrip());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<Cantrips> readCantrips(Spells spells) {
		int idSpells = spells.getIdSpells();
		ArrayList<Cantrips> cantrips = new ArrayList<Cantrips>();
		String sql = "SELECT idcantrip, cantrip_name, cantrip_description "
				+ "FROM cantrip "
				+ "WHERE spells_idspells=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idSpells);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cantrips cantrip = new Cantrips();
				
				cantrip.setIDCantrip(rs.getInt("idcantrip"));
				cantrip.setCantripName(rs.getString("cantrip_name"));
				cantrip.setCantripDescription(rs.getString("cantrip_description"));
				
				cantrips.add(cantrip);
			}
			stmt.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cantrips;
	}
}
