class Acronym {
    private String a;
    Acronym(String phrase) {
        StringBuilder acr = new StringBuilder();
        char[] phr = phrase.toCharArray();
        acr.append(phr[0]);
        for(int i = 1 ;i<phr.length;i++){
            if(phr[i]=='\''){
                continue;
            }
            if (!Character.isLetter(phr[i])&&Character.isLetter(phr[i+1])){
                acr.append(phr[i+1]);
            }
        }
        a = acr.toString().toUpperCase();
    }

    String get() {
        return a;
    }

}
