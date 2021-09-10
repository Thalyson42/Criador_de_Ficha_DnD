package jdbc.model.characterSheet;

public class ClassFeats {
    private int idClassFeats;
    private String classFeats;
    
    public int getIDClassFeats(){
        return this.idClassFeats;
    }
    
    public void setIDClassFeats(int id){
        this.idClassFeats = id;
    }
    
    public String getClassFeats(){
        return this.classFeats;
    }
    
    public void setClassFeats(String feat){
        this.classFeats = feat;
    }

}
