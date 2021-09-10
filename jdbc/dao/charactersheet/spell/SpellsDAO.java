package jdbc.dao.charactersheet.spell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.spells.Spells;

public class SpellsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createSpells(CharacterSheet sheet, Spells spells) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO spells "
				+ "(idspells, spellcasting_class, spellcasting_ability, spell_save_dc, spell_attack_bonus, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, spells.getIdSpells());
			stmt.setString(2, spells.getSpellcastingClass());
			stmt.setString(3, spells.getSpellcastingAbility());
			stmt.setInt(4, spells.getSpellSaveDC());
			stmt.setInt(5, spells.getSpellAttackBonus());
			stmt.setInt(6, idCharacterSheet);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteSpells(Spells spells) {
		String sql = "DELETE FROM spells "
				+ "WHERE idspells=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, spells.getIdSpells());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void updateSpells(Spells spells) {
		String sql = "UPDATE spells SET "
				+ "spellcasting_class=?, spellcasting_ability=?, spell_save_dc=?, spell_attack_bonus=? "
				+ "WHERE idspells=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, spells.getSpellcastingClass());
			stmt.setString(2, spells.getSpellcastingAbility());
			stmt.setInt(3, spells.getSpellSaveDC());
			stmt.setInt(4, spells.getSpellAttackBonus());
			stmt.setInt(5, spells.getIdSpells());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public Spells readSpells(CharacterSheet sheet) {
		int idCharacterSheet = sheet.getIdCharacterSheet();
		Spells spells = new Spells();
		String sql = "SELECT idspells, spellcasting_class, spellcasting_ability, spell_save_dc, spell_attack_bonus "
				+ "FROM spells "
				+ "WHERE  charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacterSheet);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				spells.setIdSpells(rs.getInt("idspells"));
				spells.setSpellcastingClass(rs.getString("spellcasting_class"));
				spells.setSpellcastingAbility(rs.getString("spellcasting_ability"));
				spells.setSpellSaveDC(rs.getInt("spell_save_dc"));
				spells.setSpellAttackBonus(rs.getInt("spell_attack_bonus"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return spells;
	}
}
