public class JedliksToyCar {
    public int distance = 0;
    public int batery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (batery ==0){
            return "Battery empty";
        }
        return "Battery at " + batery +"%";
    }

    public void drive() {
        if (batery ==0){
            return;
        }
        distance += 20;
        batery--;
    }
}
