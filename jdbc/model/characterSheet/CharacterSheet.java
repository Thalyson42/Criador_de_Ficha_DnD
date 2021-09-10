package jdbc.model.characterSheet;

import java.util.ArrayList;

import jdbc.model.characterSheet.ClassFeats;
import jdbc.model.characterSheet.Equipments;
import jdbc.model.characterSheet.Languages;
import jdbc.model.characterSheet.ProficienceEquipments;
import jdbc.model.characterSheet.ProficienceTools;
import jdbc.model.characterSheet.attribute.Attribute;
import jdbc.model.characterSheet.attribute.AttributeMod;
import jdbc.model.characterSheet.attribute.HasSavingThrows;
import jdbc.model.characterSheet.attribute.SavingThrows;
import jdbc.model.characterSheet.characteristics.Characteristics;
import jdbc.model.characterSheet.skills.HasSkills;
import jdbc.model.characterSheet.skills.Skills;
import jdbc.model.characterSheet.spells.Spells;

public class CharacterSheet {
    private int idCharacterSeet;
    private String playerName;
    private String characterName;
    private String characterClass;
    private String race;
    private String alignment;
    private String background;
    private int proficienceBonus = 0;
    private boolean inspiration = false;
    private double xpPoints = 0;
    private int lifePoints = 0;
    private int level = 0;
    private int armorClass = 0;
    private String hitDice;
    private String speed;
    private String initiative;
    private int passivePerception = 0;
    private Attribute attributes = new Attribute();
    private AttributeMod attibuteMod = new AttributeMod();
    private HasSavingThrows hasSavingThrows = new HasSavingThrows();
    private SavingThrows savingThrows = new SavingThrows();
    private Skills skills = new Skills();
    private HasSkills hasSkills = new HasSkills();
    private Characteristics characteristics = new Characteristics();
    private ArrayList<ClassFeats> classFeats = new ArrayList<ClassFeats>();
    private ArrayList<Equipments> equipaments = new ArrayList<Equipments>();
    private ArrayList<Languages> languages = new ArrayList<Languages>();
    private Spells spells = new Spells();
    private ArrayList<ProficienceEquipments> proficienceEquipments = new ArrayList<ProficienceEquipments>();
    private ArrayList<ProficienceTools> proficienceTools = new ArrayList<ProficienceTools>();
    private Biography biography = new Biography();
    
	public int getIdCharacterSheet() {
		
		return this.idCharacterSeet;
	}
	public void setIdCharacterSheet(int idCharacterSheet) {
		this.idCharacterSeet = idCharacterSheet;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getXpPoints() {
		return this.xpPoints;
	}
	public void setXpPoints(double exp) {
		this.xpPoints = exp;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public int getProficienceBonus() {
		return proficienceBonus;
	}
	public void setProficienceBonus(int proficienceBonus) {
		this.proficienceBonus = proficienceBonus;
	}
	public boolean isInspiration() {
		return inspiration;
	}
	public void setInspiration(boolean inspiration) {
		this.inspiration = inspiration;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getInitiative() {
		return this.initiative;
	}
	public void setInitiative(String initiative) {
		this.initiative = initiative;
	}
	public int getPassivePerception() {
		return passivePerception;
	}
	public void setPassivePerception(int passivePerception) {
		this.passivePerception = passivePerception;
	}
	public int getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	public String getHitDice() {
		return this.hitDice;
	}
	public void setHitDice(String hitdice) {
		this.hitDice = hitdice;
	}
	public Attribute getAttributes() {
		return attributes;
	}
	public void setAttributes(Attribute attributes) {
		this.attributes = attributes;
	}
	public AttributeMod getAttibuteMod() {
		return attibuteMod;
	}
	public void setAttibuteMod(AttributeMod attibuteMod) {
		this.attibuteMod = attibuteMod;
	}
	public HasSavingThrows getHasSavingThrows() {
		return hasSavingThrows;
	}
	public void setHasSavingThrows(HasSavingThrows hasSavingThrows) {
		this.hasSavingThrows = hasSavingThrows;
	}
	public SavingThrows getSavingThrows() {
		return savingThrows;
	}
	public void setSavingThrows(SavingThrows savingThrows) {
		this.savingThrows = savingThrows;
	}
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public HasSkills getHasSkills() {
		return hasSkills;
	}
	public void setHasSkills(HasSkills hasSkills) {
		this.hasSkills = hasSkills;
	}
	public Characteristics getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(Characteristics characteristics) {
		this.characteristics = characteristics;
	}
	public ArrayList<ClassFeats> getClassFeats() {
		return classFeats;
	}
	public void setClassFeats(ArrayList<ClassFeats> classFeats) {
		this.classFeats = classFeats;
	}
	public ArrayList<Equipments> getEquipaments() {
		return equipaments;
	}
	public void setEquipaments(ArrayList<Equipments> equipaments) {
		this.equipaments = equipaments;
	}
	public ArrayList<Languages> getLanguages() {
		return languages;
	}
	public void setLanguages(ArrayList<Languages> languages) {
		this.languages = languages;
	}
	public Spells getSpells() {
		return spells;
	}
	public void setSpells(Spells spells) {
		this.spells = spells;
	}
	public ArrayList<ProficienceEquipments> getProficienceEquipments() {
		return proficienceEquipments;
	}
	public void setProficienceEquipments(ArrayList<ProficienceEquipments> proficienceEquipments) {
		this.proficienceEquipments = proficienceEquipments;
	}
	public ArrayList<ProficienceTools> getProficienceTools() {
		return proficienceTools;
	}
	public void setProficienceTools(ArrayList<ProficienceTools> proficienceTools) {
		this.proficienceTools = proficienceTools;
	}
	public Biography getBiography() {
		return biography;
	}
	public void setBiography(Biography biography) {
		this.biography = biography;
	}
}
