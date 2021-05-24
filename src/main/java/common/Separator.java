package common;

public enum Separator {
    HYPHEN('-'),
    TILDE('~'),
    UNDERSCORE('_'),
    DOT('.'),
    COMMA(','),
    SPACE(' ');

    private char character;

    private Separator(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }
}
