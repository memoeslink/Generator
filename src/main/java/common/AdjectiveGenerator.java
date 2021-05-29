package common;

import java.util.Locale;

public class AdjectiveGenerator extends Generator {

    public AdjectiveGenerator() {
        super();
    }

    public AdjectiveGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public String getAdjective(Form form) {
        AdjectiveGetter getter;

        if ((locale.getLanguage().isEmpty() && locale.getCountry().isEmpty()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            getter = new international.AdjectiveGetter();
        else if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
            getter = new english.AdjectiveGetter();
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.AdjectiveGetter();
        else
            getter = new international.AdjectiveGetter();
        form = form != null ? form : Form.UNDEFINED;

        switch (form) {
            case SINGULAR:
            case SINGULAR_NEUTER:
                return getter.with(r).getAdjective();
            case PLURAL:
            case PLURAL_NEUTER:
                return getter.with(r).getPluralAdjective();
            case SINGULAR_MASCULINE:
                return getter.with(r).getMaleAdjective();
            case PLURAL_MASCULINE:
                return getter.with(r).getPluralMaleAdjective();
            case SINGULAR_FEMININE:
                return getter.with(r).getFemaleAdjective();
            case PLURAL_FEMININE:
                return getter.with(r).getPluralFemaleAdjective();
            case UNDEFINED:
            default:
                return getAdjective(Form.values()[r.getInt(Form.values().length)]);
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
