package common;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CharHelper {
    public static final char NULL_CHAR = '\0';

    public static boolean isNull(char c) {
        return c == NULL_CHAR;
    }

    public static char defaultIfNull(char c) {
        if (c == NULL_CHAR)
            return Character.SPACE_SEPARATOR;
        else return c;
    }

    public static char defaultIfNull(char c, char defaultValue) {
        if (c == NULL_CHAR)
            return defaultIfNull(defaultValue);
        return c;
    }

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

    public boolean isPrintable(char c) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(c);
        return (!Character.isISOControl(c)) &&
                block != null &&
                block != Character.UnicodeBlock.SPECIALS;
    }

    public boolean isCharDisplayableInFont(char c) {
        if (c == NULL_CHAR || Character.isWhitespace(c))
            return false;
        Graphics g = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).getGraphics();
        Font font = new Font(g.getFont().toString(), Font.PLAIN, 5);
        g.dispose();
        return font.canDisplay(c);
    }

    public boolean isGlyphDisplayable(char c) {
        return isPrintable(c) && isCharDisplayableInFont(c);
    }

    public static String getUnicode(char c) {
        if (c == NULL_CHAR)
            return StringHelper.EMPTY;
        return String.format("\\u%04X", (int) c);
    }
}
