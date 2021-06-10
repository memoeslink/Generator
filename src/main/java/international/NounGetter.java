package international;

import common.NounDefiner;
import common.Randomizer;

public final class NounGetter extends common.NounGetter implements NounDefiner {

    public NounGetter() {
        super();
    }

    public NounGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getNoun() {
        return getAnyGetter().getNoun();
    }

    @Override
    public String getPluralNoun() {
        return getAnyGetter().getPluralNoun();
    }

    @Override
    public String getFemaleNoun() {
        return getAnyGetter().getFemaleNoun();
    }

    @Override
    public String getPluralFemaleNoun() {
        return getAnyGetter().getPluralFemaleNoun();
    }

    @Override
    public String getMaleNoun() {
        return getAnyGetter().getMaleNoun();
    }

    @Override
    public String getPluralMaleNoun() {
        return getAnyGetter().getPluralMaleNoun();
    }

    public common.NounGetter getAnyGetter() {
        switch (r.getInt(2)) {
            case 0:
                return new english.NounGetter(r);
            case 1:
                return new spanish.NounGetter(r);
        }
        return new common.NounGetter(r);
    }
}
