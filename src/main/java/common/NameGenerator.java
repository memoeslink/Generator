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
            case FULL_NAME:
                return getter.with(r).getFullName();
            case MALE_DEFINED_FORENAME:
                return getter.with(r).getMaleDefinedForename();
            case FEMALE_DEFINED_FORENAME:
                return getter.with(r).getFemaleDefinedForename();
            case DEFINED_FAMILY_NAME:
                return getter.with(r).getDefinedFamilyName();
            case MALE_DEFINED_FULL_NAME:
                return getter.with(r).getMaleDefinedFullName();
            case FEMALE_DEFINED_FULL_NAME:
                return getter.with(r).getFemaleDefinedFullName();
            case DEFINED_FULL_NAME:
                return getter.with(r).getDefinedFullName();
            case MALE_ITERATIVE_FORENAME:
                return getter.with(r).getMaleIterativeForename();
            case FEMALE_ITERATIVE_FORENAME:
                return getter.with(r).getFemaleIterativeForename();
            case ITERATIVE_FAMILY_NAME:
                return getter.with(r).getIterativeFamilyName();
            case MALE_ITERATIVE_FULL_NAME:
                return getter.with(r).getMaleIterativeFullName();
            case FEMALE_ITERATIVE_FULL_NAME:
                return getter.with(r).getFemaleIterativeFullName();
            case ITERATIVE_FULL_NAME:
                return getter.with(r).getIterativeFullName();
            case MALE_PATTERN_FORENAME:
                return getter.with(r).getMalePatternForename();
            case FEMALE_PATTERN_FORENAME:
                return getter.with(r).getFemalePatternForename();
            case PATTERN_FAMILY_NAME:
                return getter.with(r).getPatternFamilyName();
            case MALE_PATTERN_FULL_NAME:
                return getter.with(r).getMalePatternFullName();
            case FEMALE_PATTERN_FULL_NAME:
                return getter.with(r).getFemalePatternFullName();
            case PATTERN_FULL_NAME:
                return getter.with(r).getPatternFullName();
            case USERNAME:
                return getter.with(r).getUsername();
            case COMPOSITE_USERNAME:
                return getter.with(r).getCompositeUsername();
            case DERIVED_USERNAME:
                return getter.with(r).getDerivedUsername();
            case ANONYMOUS_NAME:
                return getter.with(r).getAnonymousName();
            case ANONYMOUS_ANIMAL:
                return getter.with(r).getAnonymousAnimal();
            case EMPTY:
            default:
                return getter.getEmptyName();
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
