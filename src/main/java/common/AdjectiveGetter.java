package common;

public class AdjectiveGetter implements AdjectiveDefiner {
    protected Randomizer r;

    public AdjectiveGetter() {
        r = new Randomizer();
    }

    protected AdjectiveGetter(Randomizer r) {
        this.r = r != null ? r : new Randomizer();
    }

    @Override
    public String getEmptyAdjective() {
        return StringHelper.EMPTY;
    }

    @Override
    public String getAdjective() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPluralAdjective() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleAdjective() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPluralFemaleAdjective() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleAdjective() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPluralMaleAdjective() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public AdjectiveGetter with(Randomizer r) {
        return new AdjectiveGetter(r);
    }
}
