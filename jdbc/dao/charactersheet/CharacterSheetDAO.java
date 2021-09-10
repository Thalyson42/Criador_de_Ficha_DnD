package jdbc.dao.charactersheet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.user.User;

public class CharacterSheetDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createCharacterSheet(CharacterSheet sheet, User user) {
		int userId = user.getIdUser();
		String sql = "INSERT INTO charactersheet "
				+ "(idcharactersheet, player_name, character_name, character_class, race, alignment, "
				+ "background, proficience_bonus, inspiration, xp_points, life_points, level, armor_class, "
				+ "hit_dice, speed, initiative, passive_perception, user_iduser) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheet.getIdCharacterSheet());
			stmt.setString(2, sheet.getPlayerName());
			stmt.setString(3, sheet.getCharacterName());
			stmt.setString(4, sheet.getCharacterClass());
			stmt.setString(5, sheet.getRace());
			stmt.setString(6, sheet.getAlignment());
			stmt.setString(7, sheet.getBackground());
			stmt.setInt(8, sheet.getProficienceBonus());
			stmt.setBoolean(9, sheet.isInspiration());
			stmt.setDouble(10, sheet.getXpPoints());
			stmt.setInt(11, sheet.getLifePoints());
			stmt.setInt(12, sheet.getLevel());
			stmt.setInt(13, sheet.getArmorClass());
			stmt.setString(14, sheet.getHitDice());
			stmt.setString(15, sheet.getSpeed());
			stmt.setString(16, sheet.getInitiative());
			stmt.setInt(17, sheet.getPassivePerception());
			stmt.setInt(18, userId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	
	public void deleteCharacterSheet(CharacterSheet sheet, User user) {
		int userId = user.getIdUser();
		String sql = "DELETE FROM charactersheet WHERE user_iduser=? AND idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, userId);
			stmt.setInt(2, sheet.getIdCharacterSheet());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateCharacterSheet(CharacterSheet sheet, User user) {
		int userId = user.getIdUser();
		String sql = "UPDATE charactersheet SET "
				+ "player_name=?, character_name=?, character_class=?, race=?, alignment=?, "
				+ "background=?, proficience_bonus=?, inspiration=?, xp_points=?, life_points=?, level=?, armor_class=?, "
				+ "hit_dice=?, speed=?, initiative=?, passive_perception=? "
				+ "WHERE user_iduser=? AND idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, sheet.getPlayerName());
			stmt.setString(2, sheet.getCharacterName());
			stmt.setString(3, sheet.getCharacterClass());
			stmt.setString(4, sheet.getRace());
			stmt.setString(5, sheet.getAlignment());
			stmt.setString(6, sheet.getBackground());
			stmt.setInt(7, sheet.getProficienceBonus());
			stmt.setBoolean(8, sheet.isInspiration());
			stmt.setDouble(9, sheet.getXpPoints());
			stmt.setInt(10, sheet.getLifePoints());
			stmt.setInt(11, sheet.getLevel());
			stmt.setInt(12, sheet.getArmorClass());
			stmt.setString(13, sheet.getHitDice());
			stmt.setString(14, sheet.getSpeed());
			stmt.setString(15, sheet.getInitiative());
			stmt.setInt(16, sheet.getPassivePerception());
			stmt.setInt(17, userId);
			stmt.setInt(18, sheet.getIdCharacterSheet());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//Read for when user log-in
	public ArrayList<CharacterSheet> readCharacterSheet(User user) {
		ArrayList<CharacterSheet> sheets = new ArrayList<CharacterSheet>();
		int userId = user.getIdUser();
		String sql = "SELECT "
		+ "idcharactersheet, player_name, character_name, character_class, race, alignment, "
		+ "background, proficience_bonus, inspiration, xp_points, life_points, level, armor_class, "
		+ "hit_dice, speed, initiative, passive_perception "
		+ "FROM charactersheet "
		+ "WHERE user_iduser=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, userId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				CharacterSheet sheet = new CharacterSheet();
				sheet.setIdCharacterSheet(rs.getInt("idcharactersheet"));
				sheet.setPlayerName(rs.getString("player_name"));
				sheet.setCharacterName(rs.getString("character_name"));
				sheet.setCharacterClass(rs.getString("character_class"));
				sheet.setRace(rs.getString("race"));
				sheet.setAlignment(rs.getString("alignment"));
				sheet.setBackground(rs.getString("background"));
				sheet.setProficienceBonus(rs.getInt("proficience_bonus"));
				sheet.setInspiration(rs.getBoolean("inspiration"));
				sheet.setXpPoints(rs.getDouble("xp_points"));
				sheet.setLifePoints(rs.getInt("life_points"));
				sheet.setLevel(rs.getInt("level"));
				sheet.setArmorClass(rs.getInt("armor_class"));
				sheet.setHitDice(rs.getString("hit_dice"));
				sheet.setSpeed(rs.getString("speed"));
				sheet.setInitiative(rs.getString("initiative"));
				sheet.setPassivePerception(rs.getInt("passive_perception"));
				sheets.add(sheet);
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return sheets;
	}
}
