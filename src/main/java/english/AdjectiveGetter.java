package english;

import common.AdjectiveDefiner;
import common.Database;
import common.Randomizer;
import io.github.encryptorcode.pluralize.Pluralize;

public final class AdjectiveGetter extends common.AdjectiveGetter implements AdjectiveDefiner {

    public AdjectiveGetter() {
        super();
    }

    private AdjectiveGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getAdjective() {
        return Database.selectEnglishAdjective(r.getInt(1, Database.countEnglishAdjectives()));
    }

    @Override
    public String getPluralAdjective() {
        String adjective = getAdjective();

        if (Pluralize.isSingular(adjective))
            adjective = Pluralize.plural(adjective);
        return adjective;
    }

    @Override
    public String getFemaleAdjective() {
        return getAdjective();
    }

    @Override
    public String getPluralFemaleAdjective() {
        return getPluralAdjective();
    }

    @Override
    public String getMaleAdjective() {
        return getAdjective();
    }

    @Override
    public String getPluralMaleAdjective() {
        return getPluralAdjective();
    }

    @Override
    public AdjectiveGetter with(Randomizer r) {
        return new AdjectiveGetter(r);
    }
}
