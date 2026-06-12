public class LogLevels {
    public static String message(String logLine) {
        int messageStartIdx = logLine.indexOf(": ") + 2;
        return logLine.substring(messageStartIdx).trim();
    }
    public static String logLevel(String logLine) {
        int closingBracketIdx = logLine.indexOf("]");
        return logLine.substring(1, closingBracketIdx).toLowerCase();
    }
    public static String reformat(String logLine) {
        String logLevel = logLevel(logLine);
        String message = message(logLine);
        return String.format("%s (%s)", message, logLevel);
    }
}