class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder res = new StringBuilder();
        for(char c : dnaStrand.toCharArray()){
            switch(c){
                case('G'):
                    res.append('C');
                    break;
                case('C'):
                    res.append('G');
                    break;
                case('A'):
                    res.append('U');
                    break;
                case('T'):
                    res.append('A');
                    break;
                
            }
        }
        return res.toString();
    }

}
