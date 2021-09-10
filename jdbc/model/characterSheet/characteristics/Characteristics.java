package jdbc.model.characterSheet.characteristics;

import java.util.ArrayList;

public class Characteristics {
    private int idCharacteristic;
    private ArrayList<PersonalityTraits> personalityTraits = new ArrayList<PersonalityTraits>();
    private String ideals;
    private String bonds;
    private String flaws;
    
    public int getIDCharacteristic(){
        return this.idCharacteristic;
    }
    
    public void setIDCharacteristic(int id){
        this.idCharacteristic = id;
    }

	public ArrayList<PersonalityTraits> getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(ArrayList<PersonalityTraits> personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public String getIdeals() {
		return ideals;
	}

	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}

	public String getBonds() {
		return bonds;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public String getFlaws() {
		return flaws;
	}

	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}
    
}
