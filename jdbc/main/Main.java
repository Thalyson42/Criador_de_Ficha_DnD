package jdbc.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import jdbc.model.user.User;
import jdbc.dao.charactersheet.BiographyDAO;
import jdbc.dao.charactersheet.CharacterSheetDAO;
import jdbc.dao.charactersheet.ClassFeatsDAO;
import jdbc.dao.charactersheet.EquipmentsDAO;
import jdbc.dao.charactersheet.LanguagesDAO;
import jdbc.dao.charactersheet.ProficienceEquipmentsDAO;
import jdbc.dao.charactersheet.ProficienceToolsDAO;
import jdbc.dao.charactersheet.attribute.AttributeDAO;
import jdbc.dao.charactersheet.attribute.AttributeModDAO;
import jdbc.dao.charactersheet.attribute.HasSavingThrowsDAO;
import jdbc.dao.charactersheet.attribute.SavingThrowsDAO;
import jdbc.dao.charactersheet.characteristics.CharacteristicsDAO;
import jdbc.dao.charactersheet.characteristics.PersonalityTraitsDAO;
import jdbc.dao.charactersheet.skills.HasSkillDAO;
import jdbc.dao.charactersheet.skills.SkillsDAO;
import jdbc.dao.charactersheet.spell.CantripsDAO;
import jdbc.dao.charactersheet.spell.SpellDAO;
import jdbc.dao.charactersheet.spell.SpellsDAO;
import jdbc.dao.user.ProfileDAO;
import jdbc.dao.user.UserDAO;
import jdbc.model.characterSheet.Biography;
import jdbc.model.characterSheet.CharacterSheet;
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
import jdbc.model.characterSheet.characteristics.PersonalityTraits;
import jdbc.model.characterSheet.skills.HasSkills;
import jdbc.model.characterSheet.skills.Skills;
import jdbc.model.characterSheet.spells.Cantrips;
import jdbc.model.characterSheet.spells.Spell;
import jdbc.model.characterSheet.spells.Spells;
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
		



		SpellDAO spellDao = new SpellDAO();
		Cantrips cantrip = new Cantrips();
		CantripsDAO cantripDao = new CantripsDAO();
		Spells spells = new Spells();
		
		spells.setIdSpells(1);
		
		cantrip.setIDCantrip(1);
		cantrip.setCantripDescription("mudou");
		
		cantripDao.deleteCantrips(spells, cantrip);
	

	}
}
