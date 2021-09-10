package jdbc.model.characterSheet.spells;

public class Spell {
    private int idSpell;
    private String spellName;
    private String spellDescription;
    private int spellLevel;
    
	public int getIdSpell() {
		return idSpell;
	}
	
	public void setIdSpell(int idSpell) {
		this.idSpell = idSpell;
	}
	
	public String getSpellName() {
		return spellName;
	}
	
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}
	
	public String getSpellDescription() {
		return spellDescription;
	}
	
	public void setSpellDescription(String spellDescription) {
		this.spellDescription = spellDescription;
	}
	
	public int getSpellLevel() {
		return spellLevel;
	}
	
	public void setSpellLevel(int spellLevel) {
		this.spellLevel = spellLevel;
	}
    
}
