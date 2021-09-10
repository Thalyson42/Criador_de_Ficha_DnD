package jdbc.dao.charactersheet.skills;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.skills.HasSkills;

public class HasSkillDAO {
	private Connection connection;
	
	public Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}

	public void createHasSkills(HasSkills hasSkills, CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO has_skils "
				+ "(idhas_skils, has_acrobatics, has_animal_handling, has_arcana, has_athletics, has_deception, has_history, has_insight, "
				+ "has_intimidation, has_investigation, has_medicine, has_nature, has_perception, has_performance, has_persuasion, has_religion, "
				+ "has_sleigth_of_hand, has_stealth, , has_survival, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, hasSkills.getIdHasSkills());
			stmt.setBoolean(2, hasSkills.isHasAcrobatics());
			stmt.setBoolean(3, hasSkills.isHasAnimalHandling());
			stmt.setBoolean(4, hasSkills.isHasArcana());
			stmt.setBoolean(5, hasSkills.isHasAthletics());
			stmt.setBoolean(6, hasSkills.isHasDeception());
			stmt.setBoolean(7, hasSkills.isHasHistory());
			stmt.setBoolean(8, hasSkills.isHasInsight());
			stmt.setBoolean(9, hasSkills.isHasIntimidation());
			stmt.setBoolean(10, hasSkills.isHasInvestigation());
			stmt.setBoolean(11, hasSkills.isHasMedicine());
			stmt.setBoolean(12, hasSkills.isHasNature());
			stmt.setBoolean(13, hasSkills.isHasPerception());
			stmt.setBoolean(14, hasSkills.isHasPerformance());
			stmt.setBoolean(15, hasSkills.isHasPersuasion());
			stmt.setBoolean(16, hasSkills.isHasReligion());
			stmt.setBoolean(17, hasSkills.isHasSleigthOfHand());
			stmt.setBoolean(18, hasSkills.isHasStealth());
			stmt.setBoolean(19, hasSkills.isHasSurvival());
			stmt.setInt(20, sheetId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteHasSkills(HasSkills hasSkills) {
		String sql = "DELETE FROM has_skils WHERE idhas_skils=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, hasSkills.getIdHasSkills());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateHasSkills(HasSkills hasSkills) {
		String sql = "UPDATE has_skils SET "
				+ "has_acrobatics=?, has_animal_handling=?, has_arcana=?, has_athletics=?, has_deception=?, has_history=?, has_insight=?, "
				+ "has_intimidation=?, has_investigation=?, has_medicine=?, has_nature=?, has_perception=?, has_performance=?, has_persuasion=?, has_religion=?, "
				+ "has_sleigth_of_hand=?, has_stealth=?, has_survival=? "
				+ "WHERE idhas_skils=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setBoolean(1, hasSkills.isHasAcrobatics());
			stmt.setBoolean(2, hasSkills.isHasAnimalHandling());
			stmt.setBoolean(3, hasSkills.isHasArcana());
			stmt.setBoolean(4, hasSkills.isHasAthletics());
			stmt.setBoolean(5, hasSkills.isHasDeception());
			stmt.setBoolean(6, hasSkills.isHasHistory());
			stmt.setBoolean(7, hasSkills.isHasInsight());
			stmt.setBoolean(8, hasSkills.isHasIntimidation());
			stmt.setBoolean(9, hasSkills.isHasInvestigation());
			stmt.setBoolean(10, hasSkills.isHasMedicine());
			stmt.setBoolean(11, hasSkills.isHasNature());
			stmt.setBoolean(12, hasSkills.isHasPerception());
			stmt.setBoolean(13, hasSkills.isHasPerformance());
			stmt.setBoolean(14, hasSkills.isHasPersuasion());
			stmt.setBoolean(15, hasSkills.isHasReligion());
			stmt.setBoolean(16, hasSkills.isHasSleigthOfHand());
			stmt.setBoolean(17, hasSkills.isHasStealth());
			stmt.setBoolean(18, hasSkills.isHasSurvival());
			stmt.setInt(19, hasSkills.getIdHasSkills());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public HasSkills readHasSkills(CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		HasSkills hasSkills = new HasSkills();
		String sql = "SELECT idhas_skils, has_acrobatics, has_animal_handling, has_arcana, has_athletics, has_deception, has_history, has_insight, "
				+ "has_intimidation, has_investigation, has_medicine, has_nature, has_perception, has_performance, has_persuasion, has_religion, "
				+ "has_sleigth_of_hand, has_stealth, has_survival "
				+ "FROM has_skils "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				hasSkills.setIdHasSkills(rs.getInt("idskill"));
				hasSkills.setHasAcrobatics(rs.getBoolean("acrobatics"));
				hasSkills.setHasAnimalHandling(rs.getBoolean("animal_handling"));
				hasSkills.setHasArcana(rs.getBoolean("arcana"));
				hasSkills.setHasAthletics(rs.getBoolean("athletics"));
				hasSkills.setHasDeception(rs.getBoolean("deception"));
				hasSkills.setHasHistory(rs.getBoolean("history"));
				hasSkills.setHasInsight(rs.getBoolean("insight"));
				hasSkills.setHasIntimidation(rs.getBoolean("intimidation"));
				hasSkills.setHasInvestigation(rs.getBoolean("has_investigation"));
				hasSkills.setHasMedicine(rs.getBoolean("medicine"));
				hasSkills.setHasNature(rs.getBoolean("nature"));
				hasSkills.setHasPerception(rs.getBoolean("perception"));
				hasSkills.setHasPerformance(rs.getBoolean("performance"));
				hasSkills.setHasPersuasion(rs.getBoolean("persuasion"));
				hasSkills.setHasReligion(rs.getBoolean("religion"));
				hasSkills.setHasSleigthOfHand(rs.getBoolean("sleigth_of_hand"));
				hasSkills.setHasStealth(rs.getBoolean("stealth"));
				hasSkills.setHasSurvival(rs.getBoolean("survival"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return hasSkills;
	}
}
