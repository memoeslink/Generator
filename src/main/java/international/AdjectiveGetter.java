package international;

import common.AdjectiveDefiner;
import common.Randomizer;

public final class AdjectiveGetter extends common.AdjectiveGetter implements AdjectiveDefiner {

    public AdjectiveGetter() {
        super();
    }

    public AdjectiveGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getAdjective() {
        return getAnyGetter().getAdjective();
    }

    @Override
    public String getPluralAdjective() {
        return getAnyGetter().getPluralAdjective();
    }

    @Override
    public String getFemaleAdjective() {
        return getAnyGetter().getFemaleAdjective();
    }

    @Override
    public String getPluralFemaleAdjective() {
        return getAnyGetter().getPluralFemaleAdjective();
    }

    @Override
    public String getMaleAdjective() {
        return getAnyGetter().getMaleAdjective();
    }

    @Override
    public String getPluralMaleAdjective() {
        return getAnyGetter().getPluralMaleAdjective();
    }

    public common.AdjectiveGetter getAnyGetter() {
        switch (r.getInt(2)) {
            case 0:
                return new english.AdjectiveGetter(r);
            case 1:
                return new spanish.AdjectiveGetter(r);
        }
        return new common.AdjectiveGetter(r);
    }
}
