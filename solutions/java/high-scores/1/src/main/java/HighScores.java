import java.util.List;
import java.util.*;

class HighScores {
    private List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        List<Integer> s = new ArrayList<>(highScores);
        Collections.sort(s);
        return s.get(s.size()-1);
    }

    List<Integer> personalTopThree() {
        List<Integer> s = new ArrayList<>(highScores);
        Collections.sort(s);
        int sze = 0;
        if (s.size()<3){
             sze = s.size()+1;
        }else { sze = 4;}
        List<Integer> l = new ArrayList<>();
        for(int i = 1;i<sze;i++){
            l.add(s.get(s.size()-i));
            
        }
        return l;
    }

}
