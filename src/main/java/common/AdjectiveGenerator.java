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
        AdjectiveGetter getter = getGetter();
        form = form != null ? form : Form.UNDEFINED;

        return switch (form) {
            case SINGULAR, SINGULAR_NEUTER -> getter.getAdjective();
            case PLURAL, PLURAL_NEUTER -> getter.getPluralAdjective();
            case SINGULAR_MASCULINE -> getter.getMaleAdjective();
            case PLURAL_MASCULINE -> getter.getPluralMaleAdjective();
            case SINGULAR_FEMININE -> getter.getFemaleAdjective();
            case PLURAL_FEMININE -> getter.getPluralFemaleAdjective();
            default -> getAdjective(Form.values()[r.getInt(Form.values().length)]);
        };
    }

    public String getAdjectiveWithArticle(Form form) {
        AdjectiveGetter getter = getGetter();
        form = form != null ? form : Form.UNDEFINED;

        return switch (form) {
            case SINGULAR, SINGULAR_NEUTER -> getter.getAdjectiveWithArticle();
            case PLURAL, PLURAL_NEUTER -> getter.getPluralAdjectiveWithArticle();
            case SINGULAR_MASCULINE -> getter.getMaleAdjectiveWithArticle();
            case PLURAL_MASCULINE -> getter.getPluralMaleAdjectiveWithArticle();
            case SINGULAR_FEMININE -> getter.getFemaleAdjectiveWithArticle();
            case PLURAL_FEMININE -> getter.getPluralFemaleAdjectiveWithArticle();
            default -> getAdjectiveWithArticle(Form.values()[r.getInt(Form.values().length)]);
        };
    }

    public String getAdjectiveWithIndefiniteArticle(Form form) {
        AdjectiveGetter getter = getGetter();
        form = form != null ? form : Form.UNDEFINED;

        return switch (form) {
            case SINGULAR, SINGULAR_NEUTER -> getter.getAdjectiveWithIndefiniteArticle();
            case PLURAL, PLURAL_NEUTER -> getter.getPluralAdjectiveWithIndefiniteArticle();
            case SINGULAR_MASCULINE -> getter.getMaleAdjectiveWithIndefiniteArticle();
            case PLURAL_MASCULINE -> getter.getPluralMaleAdjectiveWithIndefiniteArticle();
            case SINGULAR_FEMININE -> getter.getFemaleAdjectiveWithIndefiniteArticle();
            case PLURAL_FEMININE -> getter.getPluralFemaleAdjectiveWithIndefiniteArticle();
            default -> getAdjectiveWithIndefiniteArticle(Form.values()[r.getInt(Form.values().length)]);
        };
    }

    private AdjectiveGetter getGetter() {
        if (StringHelper.isNullOrEmpty(locale.getLanguage()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            return new international.AdjectiveGetter(r);
        else if (locale.getLanguage().equals("en"))
            return new english.AdjectiveGetter(r);
        else if (locale.getLanguage().equals("es"))
            return new spanish.AdjectiveGetter(r);
        return new international.AdjectiveGetter(r);
    }
}
