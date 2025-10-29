public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double success = 0.0;
        if(speed==10){
            success = 0.77;
        }else if(speed == 9){
            success=0.8;
        }else if(5<=speed &&speed<=8){
            success = 0.9;
        }else{
            success = 1.0;
        }
        return success*speed*221;
        
    }

    public int workingItemsPerMinute(int speed) {
        int itemsPerMinute = (int) (productionRatePerHour(speed) / 60);
        return itemsPerMinute;
    }
}
