class CollatzCalculator {

    int computeStepCount(int start) {
        if (start<=0){
            throw new IllegalArgumentException("Only positive integers are allowed") ;
        }
        int res = start;
        int steps = 0;

        if (res ==1){
            return 0;
        }
        
        
        while (res !=1){
            if (res%2==0){
                res /= 2;
                
            }else {
                res*=3;
                res++;
                
            }steps++;
        }return steps;
    }

}
