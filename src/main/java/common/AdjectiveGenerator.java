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

        if (StringHelper.isNullOrEmpty(locale.getLanguage()) || StringHelper.isNullOrEmpty(locale.getCountry()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            getter = new international.AdjectiveGetter(r);
        else if (locale.getLanguage().equals("en"))
            getter = new english.AdjectiveGetter(r);
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.AdjectiveGetter(r);
        else
            getter = new international.AdjectiveGetter(r);
        form = form != null ? form : Form.UNDEFINED;

        switch (form) {
            case SINGULAR:
            case SINGULAR_NEUTER:
                return getter.getAdjective();
            case PLURAL:
            case PLURAL_NEUTER:
                return getter.getPluralAdjective();
            case SINGULAR_MASCULINE:
                return getter.getMaleAdjective();
            case PLURAL_MASCULINE:
                return getter.getPluralMaleAdjective();
            case SINGULAR_FEMININE:
                return getter.getFemaleAdjective();
            case PLURAL_FEMININE:
                return getter.getPluralFemaleAdjective();
            case UNDEFINED:
            default:
                return getAdjective(Form.values()[r.getInt(Form.values().length)]);
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
