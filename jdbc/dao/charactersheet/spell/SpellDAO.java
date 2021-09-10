package jdbc.dao.charactersheet.spell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.spells.Spell;
import jdbc.model.characterSheet.spells.Spells;

public class SpellDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createSpell(Spells spells, Spell spell) {
		int idSpells = spells.getIdSpells();
		String sql = "INSERT INTO spell (idspell, spell_name, spell_description, spell_level, spells_idspells) "
				+ "VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, spell.getIdSpell());
			stmt.setString(2, spell.getSpellName());
			stmt.setString(3, spell.getSpellDescription());
			stmt.setInt(4, spell.getSpellLevel());
			stmt.setInt(5, idSpells);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteSpell(Spells spells, Spell spell) {
		int idSpells = spells.getIdSpells();
		String sql = "DELETE FROM spell WHERE spells_idspells=? AND idspell=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idSpells);
			stmt.setInt(2, spell.getIdSpell());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateSpell(Spells spells, Spell spell) {
		int idSpells = spells.getIdSpells();
		String sql = "UPDATE spell SET "
				+ "spell_name=?, spell_description=?, spell_level=? "
				+ "WHERE spells_idspells=? AND idspell=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, spell.getSpellName());
			stmt.setString(2, spell.getSpellDescription());
			stmt.setInt(3, spell.getSpellLevel());
			stmt.setInt(4, idSpells);
			stmt.setInt(5, spell.getIdSpell());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<Spell> readSpell(Spells spells) {
		int idSpells = spells.getIdSpells();
		ArrayList<Spell> spell = new ArrayList<Spell>();
		String sql = "SELECT idspell, spell_name, spell_description, spell_level "
				+ "FROM spell "
				+ "WHERE spells_idspells=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idSpells);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Spell sp = new Spell();
				
				sp.setIdSpell(rs.getInt("idspell"));
				sp.setSpellName(rs.getString("spell_name"));
				sp.setSpellDescription(rs.getString("spell_description"));
				sp.setSpellLevel(rs.getInt("spell_level"));
				
				spell.add(sp);
			}
			stmt.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return spell;
	}
}
