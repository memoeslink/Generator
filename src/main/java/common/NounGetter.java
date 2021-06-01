package common;

public class NounGetter extends Getter implements NounDefiner {

    public NounGetter() {
        super();
    }

    protected NounGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getEmptyNoun() {
        return StringHelper.EMPTY;
    }

    @Override
    public String getNoun() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPluralNoun() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleNoun() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPluralFemaleNoun() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleNoun() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPluralMaleNoun() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public NounGetter with(Randomizer r) {
        return new NounGetter(r);
    }
}
