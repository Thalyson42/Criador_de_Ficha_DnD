package jdbc.model.characterSheet.attribute;

public class AttributeMod {
	private int idAttributeMod;
	private int strengthMod = 0;
	private int dexterityMod = 0;
	private int constitutionMod = 0;
	private int intelligenceMod = 0;
	private int wisdomMod = 0;
	private int charismaMod = 0;
	
	public int getIdAttributeMod() {
		return idAttributeMod;
	}
	public void setIdAttributeMod(int idAttributeMod) {
		this.idAttributeMod = idAttributeMod;
	}
	public int getStrengthMod() {
		return strengthMod;
	}
	public void setStrengthMod(int strengthMod) {
		this.strengthMod = strengthMod;
	}
	public int getDexterityMod() {
		return dexterityMod;
	}
	public void setDexterityMod(int dexterityMod) {
		this.dexterityMod = dexterityMod;
	}
	public int getConstitutionMod() {
		return constitutionMod;
	}
	public void setConstitutionMod(int constitutionMod) {
		this.constitutionMod = constitutionMod;
	}
	public int getIntelligenceMod() {
		return intelligenceMod;
	}
	public void setIntelligenceMod(int intelligenceMod) {
		this.intelligenceMod = intelligenceMod;
	}
	public int getWisdomMod() {
		return wisdomMod;
	}
	public void setWisdomMod(int wisdomMod) {
		this.wisdomMod = wisdomMod;
	}
	public int getCharismaMod() {
		return charismaMod;
	}
	public void setCharismaMod(int charismaMod) {
		this.charismaMod = charismaMod;
	}
}
