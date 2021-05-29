package common;

public class CharHelper {
    public static final char NULL_CHAR = '\0';

    public static boolean equalsAny(char c, char... chars) {
        for (char character : chars) {
            if (c == character) return true;
        }
        return false;
    }

    public static boolean isLetter(char c) {
        if (c == NULL_CHAR)
            return false;
        return Character.isLetter(c);
    }

    public static boolean isUnaccentedVowel(char c) {
        if (c == NULL_CHAR)
            return false;
        return english.Constant.VOWELS.indexOf(c) != -1;
    }

    public static boolean isVowel(char c) {
        if (c == NULL_CHAR)
            return false;
        return StringHelper.stripAccents(english.Constant.VOWELS).indexOf(c) != -1;
    }

    public static boolean isDefaultVowel(char c) {
        if (c == NULL_CHAR)
            return false;
        return Constant.VOWELS.indexOf(c) != -1;
    }

    public static boolean isConsonant(char c) {
        if (c == NULL_CHAR)
            return false;
        return StringHelper.stripAccents(english.Constant.CONSONANTS).indexOf(c) != 1;
    }

    public static boolean isSpace(char c) {
        if (c == NULL_CHAR)
            return false;
        return Character.isSpaceChar(c);
    }

    public static String getUnicode(char c) {
        if (c == '\0')
            return "";
        return String.format("\\u%04X", (int) c);
    }
}
