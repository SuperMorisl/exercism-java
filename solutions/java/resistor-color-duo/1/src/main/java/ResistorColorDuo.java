import java.util.*;
class ResistorColorDuo {
    String[] co = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int value(String[] colors) {
        
        StringBuilder l = new StringBuilder();
        l.append(simple(colors[0]));
        l.append(simple(colors[1]));
        return Integer.parseInt(l.toString());
    }
    
    int simple(String color){
        for(int i = 0; i<co.length;i++){
            if(color == co[i]){
                return i;
            }
        }return -1;
    }
}
