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
            getter = new international.NounGetter();
        else if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
            getter = new english.NounGetter();
        else if (locale.getLanguage().equals("es"))
            getter = new spanish.NounGetter();
        else
            getter = new international.NounGetter();
        form = form != null ? form : Form.UNDEFINED;

        switch (form) {
            case SINGULAR:
            case SINGULAR_NEUTER:
                return getter.with(r).getNoun();
            case PLURAL:
            case PLURAL_NEUTER:
                return getter.with(r).getPluralNoun();
            case SINGULAR_MASCULINE:
                return getter.with(r).getMaleNoun();
            case PLURAL_MASCULINE:
                return getter.with(r).getPluralMaleNoun();
            case SINGULAR_FEMININE:
                return getter.with(r).getFemaleNoun();
            case PLURAL_FEMININE:
                return getter.with(r).getPluralFemaleNoun();
            case UNDEFINED:
            default:
                return getNoun(Form.values()[r.getInt(Form.values().length)]);
        }
    }

    public static String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }
}
