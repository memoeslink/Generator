package common;

import java.util.Locale;

public class NounGenerator extends Generator {

    public NounGenerator() {
        super();
    }

    public NounGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public String getNoun(Form form) {
        NounGetter getter;

        if ((locale.getLanguage().isEmpty() && locale.getCountry().isEmpty()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            getter = new international.NounGetter(r);
        else if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
            getter = new english.NounGetter(r);
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.NounGetter(r);
        else
            getter = new international.NounGetter(r);
        form = form != null ? form : Form.UNDEFINED;

        switch (form) {
            case SINGULAR:
            case SINGULAR_NEUTER:
                return getter.getNoun();
            case PLURAL:
            case PLURAL_NEUTER:
                return getter.getPluralNoun();
            case SINGULAR_MASCULINE:
                return getter.getMaleNoun();
            case PLURAL_MASCULINE:
                return getter.getPluralMaleNoun();
            case SINGULAR_FEMININE:
                return getter.getFemaleNoun();
            case PLURAL_FEMININE:
                return getter.getPluralFemaleNoun();
            case UNDEFINED:
            default:
                return getNoun(Form.values()[r.getInt(Form.values().length)]);
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
