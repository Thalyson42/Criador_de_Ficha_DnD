package jdbc.model.characterSheet.spells;

import java.util.ArrayList;

public class Spells {
    private int idSpells;
    private String spellcastingClass;
    private ArrayList<Spell> spell = new ArrayList<Spell>();
    private ArrayList<Cantrips> cantrips = new ArrayList<Cantrips>();
    private String spellcastingAbility;
    private int spellSaveDC = 0;
    private int spellAttackBonus = 0;
    
	public int getIdSpells() {
		return idSpells;
	}
	
	public void setIdSpells(int idSpells) {
		this.idSpells = idSpells;
	}
	
	public String getSpellcastingClass() {
		return spellcastingClass;
	}

	public void setSpellcastingClass(String spellcastingClass) {
		this.spellcastingClass = spellcastingClass;
	}

	public ArrayList<Spell> getSpell() {
		return spell;
	}
	
	public void setSpell(ArrayList<Spell> spell) {
		this.spell = spell;
	}
	
	public ArrayList<Cantrips> getCantrips() {
		return cantrips;
	}
	
	public void setCantrips(ArrayList<Cantrips> cantrips) {
		this.cantrips = cantrips;
	}
	
	public String getSpellcastingAbility() {
		return spellcastingAbility;
	}
	
	public void setSpellcastingAbility(String spellcastingAbility) {
		this.spellcastingAbility = spellcastingAbility;
	}
	
	public int getSpellSaveDC() {
		return spellSaveDC;
	}
	
	public void setSpellSaveDC(int spellSaveDC) {
		this.spellSaveDC = spellSaveDC;
	}
	
	public int getSpellAttackBonus() {
		return spellAttackBonus;
	}
	
	public void setSpellAttackBonus(int spellAttackBonus) {
		this.spellAttackBonus = spellAttackBonus;
	}
    
}
