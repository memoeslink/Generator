package common;

public class NounGetter implements NounDefiner {
    protected Randomizer r;

    public NounGetter() {
        r = new Randomizer();
    }

    protected NounGetter(Randomizer r) {
        this.r = r != null ? r : new Randomizer();
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
        return new common.NounGetter(r);
    }
}
