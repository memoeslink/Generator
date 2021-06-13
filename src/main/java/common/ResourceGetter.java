package common;

import java.io.*;
import java.util.HashMap;

public class ResourceGetter {
    private static Randomizer r;
    private static final HashMap<String, Integer> countRegistry = new HashMap<>();
    private static final String RESOURCES_PATH = "src/main/resources/%s";

    static {
        r = new Randomizer();
    }

    private ResourceGetter(Randomizer r) {
        if (r == null || !r.getSeed().equals(ResourceGetter.r.getSeed()))
            ResourceGetter.r = r != null ? r : new Randomizer();
    }

    public static char getChar(char[] chars) {
        if (chars != null && chars.length > 0)
            return chars[r.getInt(chars.length)];
        return CharHelper.NULL_CHAR;
    }

    public static char getChar(String s) {
        if (StringHelper.isNotNullOrEmpty(s))
            return s.charAt(r.getInt(s.length()));
        return CharHelper.NULL_CHAR;
    }

    public static String getString(String s) {
        return String.valueOf(getChar(s));
    }

    public static String getString(String[] strings) {
        if (StringHelper.isNotNullOrEmpty(strings))
            return strings[r.getInt(strings.length)];
        return StringHelper.EMPTY;
    }

    public static String getSplitString(String s) {
        String[] parts = StringHelper.splitByParagraphMark(s);

        if (parts.length > 0)
            return parts[r.getInt(parts.length)];
        return StringHelper.EMPTY;
    }

    public static String getLineFromFile(String filename) {
        String s = StringHelper.EMPTY;
        File file = new File(String.format(RESOURCES_PATH, filename));

        if (file.exists()) {
            FileInputStream is;

            try {
                is = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return s;
            }
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            LineNumberReader lnr = new LineNumberReader(br);
            Integer lineCount = 0;

            if (countRegistry.containsKey(filename))
                lineCount = countRegistry.get(filename);
            else {
                try {
                    lnr.skip(Long.MAX_VALUE);
                    lineCount = lnr.getLineNumber() + 1;
                    countRegistry.put(filename, lineCount);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (lineCount != null && lineCount > 0) {
                try {
                    is.getChannel().position(0);

                    for (int x = 0, limit = r.getInt(1, lineCount); x < limit; x++) {
                        s = br.readLine();
                    }
                    br.close();
                    lnr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            br = null;
            lnr = null;
        }
        return s;
    }

    public static char getLetter() {
        return getChar(english.Constant.LETTERS);
    }

    public static char getUpperCase() {
        return getChar(english.Constant.UPPERCASE_ALPHABET);
    }

    public static char getLowerCase() {
        return getChar(english.Constant.LOWERCASE_ALPHABET);
    }

    public static ResourceGetter with(Randomizer r) {
        return new ResourceGetter(r);
    }
}
