class ReverseString {

    String reverse(String inputString) {
        char[] s = inputString.toCharArray();
        StringBuilder a = new StringBuilder();
        int index = s.length-1;
        while (index>=0){
            a.append(s[index]);
            index--;
        }
        return a.toString();
    }
  
}
