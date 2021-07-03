package common;

import java.util.HashMap;

public enum Gender {
    UNDEFINED(-1, "⁇", "⁇", "⍰", "�", "□", "?"),
    MASCULINE(1, "♂", "⚨", "⚩", "⁇", "⍰", "�", "□", "?"),
    FEMININE(2, "♀", "⚨", "⚩", "⁇", "⍰", "�", "□", "?"),
    NEUTRAL(0, "⚲", "⚪", "⁇", "⍰", "�", "□", "?");

    private int value;
    private String[] glyphs;
    private static final HashMap<Integer, Gender> lookup = new HashMap<>();

    static {
        for (Gender gender : Gender.values()) {
            lookup.put(gender.getValue(), gender);
        }
    }

    private Gender(int value, String... glyphs) {
        this.value = value;
        this.glyphs = glyphs;
    }

    public int getValue() {
        return value;
    }

    public String getGlyph() {
        return glyphs[0];
    }

    public static Gender get(int value) {
        return lookup.get(value);
    }
}
