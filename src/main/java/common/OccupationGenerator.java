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

        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
            getter = new english.OccupationGetter();
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.OccupationGetter();
        else
            getter = new international.OccupationGetter();
        occupationType = occupationType != null ? occupationType : OccupationType.ANY;

        switch (occupationType) {
            case MALE_OCCUPATION:
                return getter.with(r).getMaleOccupation();
            case FEMALE_OCCUPATION:
                return getter.with(r).getFemaleOccupation();
            case GENDERLESS_OCCUPATION:
                return getter.with(r).getGenderlessOccupation();
            case MALE_JOB_TITLE:
                return getter.with(r).getMaleJobTitle();
            case FEMALE_JOB_TITLE:
                return getter.with(r).getFemaleJobTitle();
            case GENDERLESS_JOB_TITLE:
                return getter.with(r).getGenderlessJobTitle();
            case MALE_FANTASY_CLASS:
                return getter.with(r).getMaleFantasyClass();
            case FEMALE_FANTASY_CLASS:
                return getter.with(r).getFemaleFantasyClass();
            case GENDERLESS_FANTASY_CLASS:
                return getter.with(r).getGenderlessFantasyClass();
            case ANY:
            default:
                return getOccupation(OccupationType.values()[r.getInt(OccupationType.values().length)]);
        }
    }

    public static String getDefaultOccupation() {
        return Constant.DEFAULT_OCCUPATION;
    }
}
