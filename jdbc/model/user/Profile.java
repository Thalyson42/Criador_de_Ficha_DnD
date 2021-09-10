package jdbc.model.user;

public class Profile {
	private int idProfile;
	private String profileName;
	private int age;
	private String sex;
	private String profileDescription;
	private String email;
	private String phone;
	
	public int getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(int idProfile) {
		this.idProfile = idProfile;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String name) {
		this.profileName = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProfileDescription() {
		return profileDescription;
	}
	public void setProfileDescription(String description) {
		this.profileDescription = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
