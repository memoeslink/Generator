package common;

import java.util.Locale;

public class NameGenerator extends Generator {

    public NameGenerator() {
        super();
    }

    public NameGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public String getName(NameType nameType) {
        NameGetter getter;

        if ((locale.getLanguage().isEmpty() && locale.getCountry().isEmpty()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            getter = new international.NameGetter();
        else if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
            getter = new english.NameGetter();
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.NameGetter();
        else
            getter = new international.NameGetter();
        nameType = nameType != null ? nameType : NameType.EMPTY;

        switch (nameType) {
            case DEFAULT:
                return getter.with(r).getDefaultName();
            case TEST_CASE:
                return getter.with(r).getTestName();
            case MALE_FORENAME:
                return getter.with(r).getMaleForename();
            case FEMALE_FORENAME:
                return getter.with(r).getFemaleForename();
            case DOUBLE_BARRELLED_MALE_FORENAME:
                return getter.with(r).getDoubleBarrelledMaleForename();
            case DOUBLE_BARRELLED_FEMALE_FORENAME:
                return getter.with(r).getDoubleBarrelledFemaleForename();
            case DOUBLE_MALE_FORENAME:
                return getter.with(r).getDoubleMaleForename();
            case DOUBLE_FEMALE_FORENAME:
                return getter.with(r).getDoubleFemaleForename();
            case SURNAME:
                return getter.with(r).getSurname();
            case DUAL_SURNAME:
                return getter.with(r).getDualSurname();
            case MALE_SIMPLE_NAME:
                return getter.with(r).getMaleSimpleName();
            case FEMALE_SIMPLE_NAME:
                return getter.with(r).getFemaleSimpleName();
            case MALE_FULL_NAME:
                return getter.with(r).getMaleFullName();
            case FEMALE_FULL_NAME:
                return getter.with(r).getFemaleFullName();
            case EMPTY:
            default:
                return getter.getEmptyName();
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
