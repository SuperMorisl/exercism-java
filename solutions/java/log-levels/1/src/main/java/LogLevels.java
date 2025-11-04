public class LogLevels {
    
    public static String message(String logLine) {
        int start = 0;
        if (logLine.indexOf("ERROR")!=-1||logLine.indexOf("WARNING")!=-1||logLine.indexOf("INFO")!=-1){
            start = logLine.indexOf(":");
        }
        return logLine.substring(start+1).trim();
    }

    public static String logLevel(String logLine) {
        int start = 0;
        int end = 0;
        if(logLine.indexOf("ERROR")!=-1||logLine.indexOf("WARNING")!=-1||logLine.indexOf("INFO")!=-1){
            start = logLine.indexOf("[");
            end = logLine.indexOf("]");
        }
        return logLine.substring(start+1,end).trim().toLowerCase();

    }
    

    public static String reformat(String logLine) {
        String mess = message(logLine);
        String level = logLevel(logLine);
        return mess + " ("+level+")";
    }
}
