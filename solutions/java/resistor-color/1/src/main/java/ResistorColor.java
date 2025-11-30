import java.util.*;

    

class ResistorColor {
    private String[] c = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
        for (int i = 0; i<c.length;i++) {
            if(color == c[i]){
                return i;
            }
        }return -1;
    }

    String[] colors() {
        return c;
    }
}
