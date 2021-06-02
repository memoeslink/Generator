package common;

public class ResourceGetter {
    private static Randomizer r;

    static {
        r = new Randomizer();
        int[] a = new int[]{};
    }

    private ResourceGetter(Randomizer r) {
        if (r == null || !r.getSeed().equals(ResourceGetter.r.getSeed()))
            ResourceGetter.r = r != null ? r : new Randomizer();
    }

    public static char getChar(String s) {
        if (StringHelper.isNotNullOrEmpty(s))
            return s.charAt(r.getInt(s.length()));
        return CharHelper.NULL_CHAR;
    }

    public static String getString(String s) {
        if (StringHelper.isNotNullOrBlank(s)) {
            String[] parts = s.split("¶[ ]*");
            return parts[r.getInt(parts.length)];
        }
        return StringHelper.EMPTY;
    }

    public static String getString(String[] strings) {
        if (StringHelper.isNotNullOrEmpty(strings))
            return strings[r.getInt(strings.length)];
        return StringHelper.EMPTY;
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
