package common;

public enum Gender {
    UNDEFINED(-1, "⁇", "⁇", "⍰", "�", "□", "?"),
    MASCULINE(1, "♂", "⚨", "⚩", "⁇", "⍰", "�", "□", "?"),
    FEMININE(2, "♀", "⚨", "⚩", "⁇", "⍰", "�", "□", "?"),
    NEUTRAL(0, "⚲", "⚪", "⁇", "⍰", "�", "□", "?");

    private int value;
    private String[] glyphs;

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
}
