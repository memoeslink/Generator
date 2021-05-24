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
            case MALE_NAME:
                return getter.with(r).getMaleName();
            case FEMALE_NAME:
                return getter.with(r).getFemaleName();
            case DOUBLE_BARRELLED_MALE_NAME:
                return getter.with(r).getDoubleBarrelledMaleName();
            case DOUBLE_BARRELLED_FEMALE_NAME:
                return getter.with(r).getDoubleBarrelledFemaleName();
            case DOUBLE_MALE_NAME:
                return getter.with(r).getDoubleMaleName();
            case DOUBLE_FEMALE_NAME:
                return getter.with(r).getDoubleFemaleName();
            case SURNAME:
                return getter.with(r).getSurname();
            case EMPTY:
            default:
                return getter.getEmptyName();
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
