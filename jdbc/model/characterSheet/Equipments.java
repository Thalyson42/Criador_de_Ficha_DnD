package jdbc.model.characterSheet;

public class Equipments {
    private int idEquipment;
    private String equipment;
    private double Weight = 0;

    public int getIDEquipament(){
        return this.idEquipment;
    }
    
    public void setIDEquipment(int id){
        this.idEquipment = id;
    }
    
    public String getEquipment(){
        return this.equipment;
    }
    
    public void setEquipment(String equipment){
        this.equipment = equipment;
    }

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}
    
    
}
