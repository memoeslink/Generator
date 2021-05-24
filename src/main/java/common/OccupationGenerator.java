package common;

import java.util.Locale;

public class OccupationGenerator extends Generator {

    public OccupationGenerator() {
        super();
    }

    public OccupationGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public String getOccupation(Gender gender) {
        OccupationGetter getter;

        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
            getter = new english.OccupationGetter();
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.OccupationGetter();
        else
            getter = new international.OccupationGetter();
        gender = gender != null ? gender : Gender.UNDEFINED;

        switch (gender) {
            case MASCULINE:
                return getter.with(r).getMaleOccupation();
            case FEMININE:
                return getter.with(r).getFemaleOccupation();
            case NEUTRAL:
                return getter.with(r).getGenderlessOccupation();
            case UNDEFINED:
            default:
                return getter.with(r).getOccupation();
        }
    }

    public static String getDefaultOccupation() {
        return Constant.DEFAULT_OCCUPATION;
    }
}
