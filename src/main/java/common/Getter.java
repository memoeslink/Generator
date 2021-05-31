package common;

public final class Getter {
    protected Randomizer r;

    private Getter(Randomizer r) {
        this.r = r != null ? r : new Randomizer();
    }

    public char getAChar(String s) {
        if (StringHelper.isNotNullOrEmpty(s))
            return s.charAt(r.getInt(s.length()));
        return CharHelper.NULL_CHAR;
    }

    public static Getter with(Randomizer r) {
        return new Getter(r);
    }
}
