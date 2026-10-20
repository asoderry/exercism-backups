public class LogLine {
    private final String LOG_LINE;
    private final String LOG_MESSAGE;
    private final LogLevel LOG_LEVEL;

    public LogLine(String logLine) {
        this.LOG_LINE = logLine;
        this.LOG_LEVEL = getLogLevel();
        this.LOG_MESSAGE = getLogMessage();
    }

    public LogLevel getLogLevel() {
        // Get String LogLevel
        String logLevelString = this.LOG_LINE.substring(1, this.LOG_LINE.indexOf("]"));

        // Match String to Enum
        return switch (logLevelString) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getLogMessage() {
        return this.LOG_LINE.substring(this.LOG_LINE.indexOf(" ") + 1);
    }

    public String getOutputForShortLog() {
        return "%d:%s".formatted(this.LOG_LEVEL.getEncodedLevel(), this.LOG_MESSAGE);
    }
}
