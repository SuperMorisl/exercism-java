class SqueakyClean {
    static String clean(String identifier) {
        char[] test = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i =0;i<test.length;i++){
            if (test[i] == ' '){
                builder.append('_');
            }else if (test[i] == '-'){
                builder.append(Character.toUpperCase(test[i+1]));
                i++;
            }else if (test[i] == '4'){
                builder.append('a');            
            }else if (test[i]=='3'){
                builder.append('e');
            }else if (test[i]=='0'){
                builder.append('o');
            }else if (test[i]=='1'){
                builder.append('l');
            }else if (test[i]=='7'){
                builder.append('t');
            }
            else{if (Character.isLetter(test[i]))builder.append(test[i]);
            else continue;}
            
        }

        String buildString = builder.toString();
        return buildString;
    }
}
