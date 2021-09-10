package jdbc.model.characterSheet;

public class RefProficienceBonus {
    static int refProficienceBonus;
    
    static int getRefProficienceBonus(){
        return refProficienceBonus;
    }
    
    static void setRefProficienceBonus(int prof){
        refProficienceBonus = prof;
    }
}
