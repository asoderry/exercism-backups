import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        int indexOfColon = logLine.lastIndexOf(":");
        return logLine.substring(indexOfColon + 2).strip();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf("]")).toLowerCase(Locale.ROOT);
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String logLevel = LogLevels.logLevel(logLine);

        return message + " " + "(" + logLevel + ")";
    }
}
