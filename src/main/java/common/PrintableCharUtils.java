package common;

import org.memoeslink.CharHelper;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PrintableCharUtils {

    private PrintableCharUtils() {
    }

    public static boolean isPrintable(char c) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(c);
        return (!Character.isISOControl(c)) &&
                block != null &&
                block != Character.UnicodeBlock.SPECIALS;
    }

    public static boolean isAvailableInFont(char c) {
        if (c == CharHelper.NULL_CHAR || Character.isWhitespace(c))
            return false;
        Graphics g = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).getGraphics();
        Font font = new Font(g.getFont().toString(), Font.PLAIN, 5);
        g.dispose();
        return font.canDisplay(c);
    }

    public static boolean isDisplayable(char c) {
        return isPrintable(c) && isAvailableInFont(c);
    }

    public static char getFirstDisplayable(char... chars) {
        for (char c : chars) {
            if (isDisplayable(c))
                return c;
        }
        return '\0';
    }
}
