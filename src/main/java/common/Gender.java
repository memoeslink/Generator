package common;

public enum Gender {
    UNDEFINED(-1),
    MASCULINE(1),
    FEMININE(2),
    NEUTRAL(0);

    private int value;

    private Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
