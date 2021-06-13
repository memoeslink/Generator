package common;

import java.util.Locale;

public class OccupationGenerator extends Generator {

    public OccupationGenerator() {
        super();
    }

    public OccupationGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public String getOccupation(OccupationType occupationType) {
        OccupationGetter getter;

        if (StringHelper.isNullOrEmpty(locale.getLanguage()))
            getter = new international.OccupationGetter(r);
        else if (locale.getLanguage().equals("en"))
            getter = new english.OccupationGetter(r);
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.OccupationGetter(r);
        else
            getter = new international.OccupationGetter(r);
        occupationType = occupationType != null ? occupationType : OccupationType.ANY;

        switch (occupationType) {
            case MALE_OCCUPATION:
                return getter.getMaleOccupation();
            case FEMALE_OCCUPATION:
                return getter.getFemaleOccupation();
            case GENDERLESS_OCCUPATION:
                return getter.getGenderlessOccupation();
            case MALE_JOB_TITLE:
                return getter.getMaleJobTitle();
            case FEMALE_JOB_TITLE:
                return getter.getFemaleJobTitle();
            case GENDERLESS_JOB_TITLE:
                return getter.getGenderlessJobTitle();
            case MALE_FANTASY_CLASS:
                return getter.getMaleFantasyClass();
            case FEMALE_FANTASY_CLASS:
                return getter.getFemaleFantasyClass();
            case GENDERLESS_FANTASY_CLASS:
                return getter.getGenderlessFantasyClass();
            case ANY:
            default:
                return getOccupation(OccupationType.values()[r.getInt(OccupationType.values().length)]);
        }
    }

    public static String getDefaultOccupation() {
        return Constant.DEFAULT_OCCUPATION;
    }
}
