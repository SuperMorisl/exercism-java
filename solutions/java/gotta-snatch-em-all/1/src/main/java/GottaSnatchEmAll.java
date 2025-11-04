import java.util.List;
import java.util.Set;
import java.util.HashSet;
class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        if (collection.contains(card)){
            return false;
        }else{
            collection.add(card);
            return true;
        }
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveUnique = false;
        boolean theyHaveUnique = false;
    
        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                iHaveUnique = true;
                break;
            }
        }
    
        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                theyHaveUnique = true;
                break;
            }
        }
    
        return iHaveUnique && theyHaveUnique;
    }


    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> s = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            s.retainAll(collections.get(i));
        }
        return s;}

        
    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> s = new HashSet<>();
        for (Set<String> coll : collections) {
            s.addAll(coll);
        }return s;

}}
