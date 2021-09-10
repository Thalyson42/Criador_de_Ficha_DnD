package jdbc.dao.charactersheet.skills;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.characterSheet.skills.Skills;

public class SkillsDAO {
	private Connection connection;
	
	public Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}

	public void createSkills(Skills skills, CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		String sql = "INSERT INTO skills "
				+ "(idskill, acrobatics, animal_handling, arcana, athletics, deception, history, insight, "
				+ "intimidation, investigation, medicine, nature, perception, performance, persuasion, religion, sleigth_of_hand, "
				+ "stealth, survival, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, skills.getIdskills());
			stmt.setInt(2, skills.getAcrobatics());
			stmt.setInt(3, skills.getAnimalHandling());
			stmt.setInt(4, skills.getArcana());
			stmt.setInt(5, skills.getAthletics());
			stmt.setInt(6, skills.getDeception());
			stmt.setInt(7, skills.getHistory());
			stmt.setInt(8, skills.getInsight());
			stmt.setInt(9, skills.getIntimidation());
			stmt.setInt(10, skills.getInvestigation());
			stmt.setInt(11, skills.getMedicine());
			stmt.setInt(12, skills.getNature());
			stmt.setInt(13, skills.getPerception());
			stmt.setInt(14, skills.getPerformance());
			stmt.setInt(15, skills.getPersuasion());
			stmt.setInt(16, skills.getReligion());
			stmt.setInt(17, skills.getSleigthOfHand());
			stmt.setInt(18, skills.getStealth());
			stmt.setInt(19, skills.getSurvival());
			stmt.setInt(20, sheetId);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void deleteSkills(Skills skills) {
		String sql = "DELETE FROM skills WHERE idskill=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, skills.getIdskills());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateSkills(Skills skills) {
		String sql = "UPDATE skills SET "
				+ "acrobatics=?, animal_handling=?, arcana=?, athletics=?, deception=?, history=?, insight=?, "
				+ "intimidation=?, investigation=?, medicine=?, nature=?, perception=?, performance=?, persuasion=?, religion=?, sleigth_of_hand=?, "
				+ "stealth=?, survival=? "
				+ "WHERE idskill=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, skills.getAcrobatics());
			stmt.setInt(2, skills.getAnimalHandling());
			stmt.setInt(3, skills.getArcana());
			stmt.setInt(4, skills.getAthletics());
			stmt.setInt(5, skills.getDeception());
			stmt.setInt(6, skills.getHistory());
			stmt.setInt(7, skills.getInsight());
			stmt.setInt(8, skills.getIntimidation());
			stmt.setInt(9, skills.getInvestigation());
			stmt.setInt(10, skills.getMedicine());
			stmt.setInt(11, skills.getNature());
			stmt.setInt(12, skills.getPerception());
			stmt.setInt(13, skills.getPerformance());
			stmt.setInt(14, skills.getPersuasion());
			stmt.setInt(15, skills.getReligion());
			stmt.setInt(16, skills.getSleigthOfHand());
			stmt.setInt(17, skills.getStealth());
			stmt.setInt(18, skills.getSurvival());
			stmt.setInt(19, skills.getIdskills());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Skills readSkills(CharacterSheet sheet) {
		int sheetId = sheet.getIdCharacterSheet();
		Skills skills = new Skills();
		String sql = "SELECT idskill, acrobatics, animal_handling, arcana, athletics, deception, history, insight, "
				+ "intimidation, investigation, medicine, nature, perception, performance, persuasion, religion, sleigth_of_hand, "
				+ "stealth, survival "
				+ "FROM skills "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, sheetId);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				skills.setIdskills(rs.getInt("idskill"));
				skills.setAcrobatics(rs.getInt("acrobatics"));
				skills.setAnimalHandling(rs.getInt("animal_handling"));
				skills.setArcana(rs.getInt("arcana"));
				skills.setAthletics(rs.getInt("athletics"));
				skills.setDeception(rs.getInt("deception"));
				skills.setHistory(rs.getInt("history"));
				skills.setInsight(rs.getInt("insight"));
				skills.setIntimidation(rs.getInt("intimidation"));
				skills.setInvestigation(rs.getInt("investigation"));
				skills.setMedicine(rs.getInt("medicine"));
				skills.setNature(rs.getInt("nature"));
				skills.setPerception(rs.getInt("perception"));
				skills.setPerformance(rs.getInt("performance"));
				skills.setPersuasion(rs.getInt("persuasion"));
				skills.setReligion(rs.getInt("religion"));
				skills.setSleigthOfHand(rs.getInt("sleigth_of_hand"));
				skills.setStealth(rs.getInt("stealth"));
				skills.setSurvival(rs.getInt("survival"));
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return skills;
	}
}
