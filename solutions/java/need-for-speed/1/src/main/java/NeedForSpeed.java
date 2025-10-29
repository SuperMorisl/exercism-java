class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    public int distance = 0;
    public int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        
    }
    public boolean batteryDrained() {
        return battery <batteryDrain;
    }
    public int distanceDriven() {
        return distance;
    }
    public void drive() {
        if (battery == 0){
            return ;
        }
        battery -= batteryDrain;
        distance += speed;
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    public int getspeed(){return speed;}
    public int getdrain(){return batteryDrain;}

}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int nombres = 100/car.getdrain();
        int f = nombres *car.getspeed();
        if(f>=distance){
            return true;
        }return false;
    }
}
