package international;

import common.NounDefiner;
import common.Randomizer;

public final class NounGetter extends common.NounGetter implements NounDefiner {

    public NounGetter() {
        super();
    }

    private NounGetter(Randomizer r) {
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

    @Override
    public NounGetter with(Randomizer r) {
        return new NounGetter(r);
    }

    public common.NounGetter getAnyGetter() {
        switch (r.getInt(2)) {
            case 0:
                return new english.NounGetter().with(r);
            case 1:
                return new spanish.NounGetter().with(r);
        }
        return new common.NounGetter().with(r);
    }
}
