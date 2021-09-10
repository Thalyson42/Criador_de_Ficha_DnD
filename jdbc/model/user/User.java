package jdbc.model.user;

import jdbc.model.user.Profile;
import jdbc.model.characterSheet.CharacterSheet;
import java.util.ArrayList;

public class User {
	private int idUser;
	private String login;
	private String password;
	private Profile profile = new Profile();
	private ArrayList<CharacterSheet> characterSheet = new ArrayList<CharacterSheet>();
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public ArrayList<CharacterSheet> getCharacterSheet() {
		return characterSheet;
	}
	public void addCharacterSheet(CharacterSheet characterSheet) {
		this.characterSheet.add(characterSheet);
	}
	public void removeCharacterSheet(CharacterSheet characterSheet) {
		this.characterSheet.remove(characterSheet);
	}
	public void setCharacterSheet(ArrayList<CharacterSheet> characterSheet) {
		this.characterSheet = characterSheet;
	}
}
