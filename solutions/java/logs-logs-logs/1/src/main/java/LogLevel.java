public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int ENCODED_LEVEL;

    LogLevel(int encodedLevel) {
        this.ENCODED_LEVEL = encodedLevel;
    }

    public int getEncodedLevel() {
        return this.ENCODED_LEVEL;
    }
}
