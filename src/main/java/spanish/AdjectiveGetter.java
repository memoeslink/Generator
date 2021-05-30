package spanish;

import common.AdjectiveDefiner;
import common.Database;
import common.Gender;
import common.Randomizer;

public final class AdjectiveGetter extends common.AdjectiveGetter implements AdjectiveDefiner, spanish.AdjectiveDefiner {

    public AdjectiveGetter() {
        super();
    }

    private AdjectiveGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getAdjective() {
        Adjective adjective = getRefinedSingularAdjective();
        return !adjective.isPlural() ? adjective.getBase() : getAdjective();
    }

    @Override
    public String getPluralAdjective() {
        Adjective adjective = getRefinedPluralAdjective();
        return adjective.isPlural() ? adjective.getBase() : getPluralAdjective();
    }

    @Override
    public String getFemaleAdjective() {
        Adjective adjective = getRefinedSingularAdjective();
        return adjective.getGender() == Gender.FEMININE ? adjective.getBase() : getFemaleAdjective();
    }

    @Override
    public String getPluralFemaleAdjective() {
        Adjective adjective = getRefinedPluralAdjective();
        return adjective.getGender() == Gender.FEMININE ? adjective.getBase() : getPluralFemaleAdjective();
    }

    @Override
    public String getMaleAdjective() {
        Adjective adjective = getRefinedSingularAdjective();
        return adjective.getGender() == Gender.MASCULINE ? adjective.getBase() : getMaleAdjective();
    }

    @Override
    public String getPluralMaleAdjective() {
        Adjective adjective = getRefinedPluralAdjective();
        return adjective.getGender() == Gender.MASCULINE ? adjective.getBase() : getPluralMaleAdjective();
    }

    @Override
    public AdjectiveGetter with(Randomizer r) {
        return new AdjectiveGetter(r);
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
}
