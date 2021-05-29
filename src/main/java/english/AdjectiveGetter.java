package english;

import common.AdjectiveDefiner;
import common.Randomizer;

public final class AdjectiveGetter extends common.AdjectiveGetter implements AdjectiveDefiner {

    public AdjectiveGetter() {
        super();
    }

    private AdjectiveGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getAdjective() {
        return super.getAdjective();
    }

    @Override
    public String getPluralAdjective() {
        return super.getPluralAdjective();
    }

    @Override
    public String getFemaleAdjective() {
        return super.getFemaleAdjective();
    }

    @Override
    public String getPluralFemaleAdjective() {
        return super.getPluralFemaleAdjective();
    }

    @Override
    public String getMaleAdjective() {
        return super.getMaleAdjective();
    }

    @Override
    public String getPluralMaleAdjective() {
        return super.getPluralMaleAdjective();
    }

    @Override
    public AdjectiveGetter with(Randomizer r) {
        return new AdjectiveGetter(r);
    }
}
