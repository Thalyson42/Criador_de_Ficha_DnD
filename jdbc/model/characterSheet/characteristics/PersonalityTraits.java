package jdbc.model.characterSheet.characteristics;

public class PersonalityTraits {
    private int idPersonalityTrait;
    private String personalityTrait;
    
    public int getIDPersonalityTrait(){
        return this.idPersonalityTrait;
    }
    
    public void setIDPersonalityTrait(int id){
        this.idPersonalityTrait = id;
    }
    
    public String getPersonalityTrait(){
        return this.personalityTrait;
    }
    
    public void setPersonalityTrait(String personalityTrait){
        this.personalityTrait = personalityTrait;
    }
}
