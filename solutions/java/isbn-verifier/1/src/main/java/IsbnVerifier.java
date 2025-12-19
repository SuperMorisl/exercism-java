class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int i = 10;
        int sum = 0;
        String cleanedString = stringToVerify.replaceAll("-", "");
        if (cleanedString.length()<10||cleanedString.length()>10){return false;}
        for (char c : cleanedString.toCharArray()){
            if (i!= 1 && c =='X'){
                return false;
            }
            if (i==0){
                break;
            }else if (c=='X'){
                sum +=10*i;
                i--;
                    
            }else if (Character.isDigit(c)){
                sum += (c-'0')*i;
                i--;
            }else{return false;}
        }if(sum%11==0){
           return true; 
        }return false;
    }

}
