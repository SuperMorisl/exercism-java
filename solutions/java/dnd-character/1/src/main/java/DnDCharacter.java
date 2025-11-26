import java.util.List;
import java.util.*;

class DnDCharacter {
    
    private static final Random r = new Random();
    private int strength = ability(rollDice());
    private int constitution = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int intelligence = ability(rollDice());
    private int wisdom = ability(rollDice());
    private int charisma = ability(rollDice());

    
    int ability(List<Integer> scores) {
        List<Integer> mutableScores = new ArrayList<>(scores); 
        Collections.sort(mutableScores); 

        int sum = 0;
        // Sums the last three elements (indices 1, 2, 3) which are the largest
        for (int i = 1; i < mutableScores.size(); i++) {
            sum += mutableScores.get(i);
        }
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> points = new ArrayList<>();
        for(int i = 0;i<4;i++){
        points.add(r.nextInt(6) + 1);}
        Collections.sort(points);
        return points;
    }

    int modifier(int input) {
        double calculation = (input - 10) / 2.0;
        return (int) Math.floor(calculation);
        
    }

    int getStrength() {
        return strength;
    }
    

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
