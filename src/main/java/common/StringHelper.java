package common;

public class StringHelper {
    public static final String EMPTY = "";

    public static String defaultIfNull(String s) {
        return s == null ? EMPTY : s;
    }

    public static String defaultIfNull(String s, String defaultValue) {
        if (s == null)
            return defaultValue == null ? EMPTY : defaultValue;
        return s;
    }

    public static String defaultIfEmpty(String s) {
        return defaultIfEmpty(s, EMPTY);
    }

    public static String defaultIfEmpty(String s, String defaultValue) {
        if (s == null || s.isEmpty())
            return defaultValue == null ? EMPTY : defaultValue;
        return s;
    }

    public static String defaultIfBlank(String s) {
        return defaultIfBlank(s, EMPTY);
    }

    public static String defaultIfBlank(String s, String defaultValue) {
        if (s == null || s.isEmpty() || s.isBlank())
            return defaultValue == null ? EMPTY : defaultValue;
        return s;
    }

    public static String trimToEmpty(String s) {
        return s == null ? EMPTY : s.trim();
    }

    public static String removeFirstChar(String s) {
        if (!defaultIfNull(s).isEmpty())
            s = s.substring(1);
        return s;
    }

    public static String removeLastChar(String s) {
        if (!defaultIfNull(s).isEmpty())
            s = s.substring(0, s.length() - 1);
        return s;
    }

    public static String getFirstChar(String s) {
        if (!defaultIfNull(s).isEmpty())
            return String.valueOf(s.charAt(0));
        return s;
    }

    public static String getLastChar(String s) {
        if (!defaultIfNull(s).isEmpty())
            return String.valueOf(s.charAt(s.length() - 1));
        return s;
    }
}
