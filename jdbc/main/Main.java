package jdbc.main;

import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.model.user.User;
import jdbc.dao.charactersheet.CharacterSheetDAO;
import jdbc.dao.user.ProfileDAO;
import jdbc.dao.user.UserDAO;
import jdbc.model.characterSheet.CharacterSheet;
import jdbc.model.user.Profile;
import jdbc.connection.ConnectionFactory;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			ConnectionFactory.createConnection();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		User user = new User();
		UserDAO userdao = new UserDAO();
		Profile profile = new Profile();
		ProfileDAO profiledao = new ProfileDAO();
		CharacterSheet sheet = new CharacterSheet();
		CharacterSheetDAO sheetdao = new CharacterSheetDAO();
		ArrayList<CharacterSheet> character = new ArrayList<CharacterSheet>();

		
		String login = "Froko";
		String password = "123123";
		
		user = userdao.readUser(login, password);
		
		user.setCharacterSheet(sheetdao.readCharacterSheet(user));
		
		character = user.getCharacterSheet();
		
		sheet = character.get(1);
//		sheet.setPlayerName("bleble");
//		sheet.setCharacterName("e");
//		sheet.setCharacterClass("chalass");
//		sheet.setRace("race");
//		sheet.setAlignment("alignment");
//		sheet.setBackground("background");
//		sheet.setProficienceBonus(2);
//		sheet.setInspiration(true);
//		sheet.setXpPoints(1.200);
//		sheet.setLifePoints(15);
//		sheet.setLevel(3);
//		sheet.setArmorClass(14);
//		sheet.setHitDice("hit_dice");
//		sheet.setSpeed("speed");
//		sheet.setInitiative("initiative");
//		sheet.setPassivePerception(16);
		
		sheetdao.deleteCharacterSheet(sheet, user);
		user.removeCharacterSheet(sheet);
		

		
	
//		sheetdao.createCharacterSheet(sheet, user);
		
		
		
		
//		profiledao.createProfile(user);

		
//		profile = user.getProfile();
//		
//		profiledao.deleteProfile(profile);
//		
//		String profileName = "Thalyson";
//		int age = 25;
//		String sex = "Masculino";
//		String profileDescription = "funcionou";
//		String email = "thalyson107@gmail.com";
//		String phone = "8388725484151";
//		
//		profile.setProfileName(profileName);
//		profile.setAge(age);
//		profile.setSex(sex);
//		profile.setProfileDescription(profileDescription);
//		profile.setEmail(email);
//		profile.setPhone(phone);
//		
//		profile = profiledao.readProfile(user);
//		System.out.println(profile.getProfileName()+"\n"+profile.getAge()+"\n"+profile.getSex()+"\n"+profile.getProfileDescription()+"\n"+profile.getEmail()+"\n"+profile.getPhone());
//		
		
	}

}
