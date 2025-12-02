import java.util.*;
class ResistorColorTrio {
    String[] co = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    String label(String[] colors) {
        StringBuilder n = new StringBuilder();
        n.append(simple(colors[0]));
        n.append(simple(colors[1]));
        int j = simple(colors[2]);
        if (j==9){
            int number =  Integer.parseInt(n.toString());
            return number + " gigaohms";}
        for (int i= 0 ;i<j;i++){
            n.append(0);
        }
        int number = Integer.parseInt(n.toString());
        if (number ==0){
            return 0 + " ohms";
        }
        
        double numbers = number;
        double M = Math.pow(10.0,6.0);
        
        if (numbers%(Math.pow(10.0, 6.0))==0){
            int res = (int) (numbers/M);
            return res + " megaohms";
        }
        if (number%1000==0){
            return number/1000 + " kiloohms";
        }
        return number + " ohms";
    }
    int simple(String color){
        for(int i = 0; i<co.length;i++){
            if(color == co[i]){
                return i;
            }
        }return -1;
    }
    
}
