package english;

import common.Database;
import common.NounDefiner;
import common.Randomizer;
import io.github.encryptorcode.pluralize.Pluralize;

public final class NounGetter extends common.NounGetter implements NounDefiner {

    public NounGetter() {
        super();
    }

    public NounGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getNoun() {
        return Database.selectEnglishNoun(r.getInt(1, Database.countEnglishNouns()));
    }

    @Override
    public String getPluralNoun() {
        String noun = getNoun();

        if (Pluralize.isSingular(noun))
            noun = Pluralize.plural(noun);
        return noun;
    }

    @Override
    public String getFemaleNoun() {
        return getNoun();
    }

    @Override
    public String getPluralFemaleNoun() {
        return getPluralNoun();
    }

    @Override
    public String getMaleNoun() {
        return getNoun();
    }

    @Override
    public String getPluralMaleNoun() {
        return getPluralNoun();
    }
}
