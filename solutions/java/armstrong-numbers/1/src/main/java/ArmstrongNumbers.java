class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String s = "" + numberToCheck;
        int k = s.length();
        int sum = 0;
        for (int i =0;i<k;i++){
            sum += (int) Math.pow(s.charAt(i) - '0', k);
        }return numberToCheck == sum;

    }

}
