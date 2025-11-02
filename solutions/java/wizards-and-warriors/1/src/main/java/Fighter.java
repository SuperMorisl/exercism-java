public class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override 
    boolean isVulnerable(){
        return false;
    }
    @Override 
    int getDamagePoints(Fighter fighter){
        if (fighter.isVulnerable()){
            return 10;
        }
        return 6;
        }
}

class Wizard extends Fighter{
    public boolean spell = false;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    public void prepareSpell(){
        spell = true;
    }
    @Override 
    boolean isVulnerable(){
        if (spell){
            return false;
        }
        return true;
    }
    @Override 
    int getDamagePoints(Fighter fighter){
        if (spell){
            return 12;
        }return 3;
        
    }
    
}
