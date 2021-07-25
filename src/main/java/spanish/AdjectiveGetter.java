package spanish;

import common.AdjectiveDefiner;
import common.Database;
import common.Gender;
import common.Randomizer;

public final class AdjectiveGetter extends common.AdjectiveGetter implements AdjectiveDefiner, spanish.AdjectiveDefiner {

    public AdjectiveGetter() {
        super();
    }

    public AdjectiveGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getAdjective() {
        return getRefinedSingularAdjective().getBase();
    }

    @Override
    public String getPluralAdjective() {
        return getRefinedPluralAdjective().getBase();
    }

    @Override
    public String getFemaleAdjective() {
        return getRefinedFemaleAdjective().getBase();
    }

    @Override
    public String getPluralFemaleAdjective() {
        return getRefinedPluralFemaleAdjective().getBase();
    }

    @Override
    public String getMaleAdjective() {
        return getRefinedMaleAdjective().getBase();
    }

    @Override
    public String getPluralMaleAdjective() {
        return getRefinedPluralMaleAdjective().getBase();
    }

    @Override
    public Adjective getRefinedSingularAdjective() {
        Adjective adjective = getRefinedAdjective(Database.selectSpanishSingularAdjective(r.getInt(1, Database.countSpanishSingularAdjectives())));
        adjective.setPlural(false);
        return adjective;
    }

    @Override
    public Adjective getRefinedPluralAdjective() {
        Adjective adjective = getRefinedAdjective(Database.selectSpanishPluralAdjective(r.getInt(1, Database.countSpanishPluralAdjectives())));
        adjective.setPlural(true);
        return adjective;
    }

    @Override
    public Adjective getRefinedFemaleAdjective() {
        Adjective adjective = getRefinedSingularAdjective();
        return adjective.getGender() == Gender.FEMININE ? adjective : getRefinedFemaleAdjective();
    }

    @Override
    public Adjective getRefinedPluralFemaleAdjective() {
        Adjective adjective = getRefinedPluralAdjective();
        return adjective.getGender() == Gender.FEMININE ? adjective : getRefinedPluralFemaleAdjective();
    }

    @Override
    public Adjective getRefinedMaleAdjective() {
        Adjective adjective = getRefinedSingularAdjective();
        return adjective.getGender() == Gender.MASCULINE ? adjective : getRefinedMaleAdjective();
    }

    @Override
    public Adjective getRefinedPluralMaleAdjective() {
        Adjective adjective = getRefinedPluralAdjective();
        return adjective.getGender() == Gender.MASCULINE ? adjective : getRefinedPluralMaleAdjective();
    }
}
