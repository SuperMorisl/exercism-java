
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] last = {0,2,5,3,7,8,4};
        return last;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
        
            
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: birdsPerDay){
            if (birds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int index = 0;
        if (numberOfDays > 7){
            index = 7;
        }
        else{
            index = numberOfDays;
        }
        for (int i = 0;i<index;i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }
    

    public int getBusyDays() {
        int day = 0;
        for (int birds: birdsPerDay){
            if (birds >=5){
                day+=1;
            }
        }
        return day;
    }
}
