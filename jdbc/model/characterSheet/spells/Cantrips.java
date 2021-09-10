package jdbc.model.characterSheet.spells;

public class Cantrips {
    private int idCantrip;
    private String cantripName;
    private String cantripDescription;
    
    public int getIDCantrip(){
        return this.idCantrip;
    }
    
    public void setIDCantrip(int id){
        this.idCantrip = id;
    }
    
    public String getCantripName(){
        return this.cantripName;
    }
    
    public void setCantripName(String name){
        this.cantripName = name;
    }
    
    public String getCantripDescription(){
        return this.cantripDescription;
    }
    
    public void setCantripDescription(String description){
        this.cantripDescription = description;
    }
}
