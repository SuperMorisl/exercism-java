public class GameMaster {

    public String describe(Character character){
        StringBuilder s = new StringBuilder();
        s.append("You're a level ");
        s.append(character.getLevel());
        s.append(" ");
        s.append(character.getCharacterClass());
        s.append(" with ");
        s.append(character.getHitPoints());
        s.append(" hit points.");
        return s.toString();
    }
    public String describe(Destination destination){
        StringBuilder s = new StringBuilder();
        s.append("You've arrived at ");
        s.append(destination.getName());
        s.append(", which has ");
        s.append(destination.getInhabitants());
        s.append(" inhabitants.");
        return s.toString();
    }
    public String describe(TravelMethod travelmethod){
        StringBuilder s = new StringBuilder();
        if (travelmethod == TravelMethod.HORSEBACK) {
        s.append("You're traveling to your destination on horseback.");}
        else{s.append("You're traveling to your destination by walking.");}
        return s.toString();
    } 
    public String describe(Character character, Destination destination, TravelMethod travelmethod){
        StringBuilder s = new StringBuilder();
        s.append(describe(character)+" ");
        s.append(describe(travelmethod)+" ");
        s.append(describe(destination));
        return s.toString();
    }
    public String describe(Character character, Destination destination){
        return describe(character, destination, TravelMethod.WALKING);
            
    }
}
