package common;

import java.util.Locale;

public class PhraseGenerator extends Generator {

    public PhraseGenerator() {
        super();
    }

    public PhraseGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public String getPhrase(PhraseType phraseType) {
        PhraseGetter getter = getGetter();
        phraseType = phraseType != null ? phraseType : PhraseType.ANY;

        return switch (phraseType) {
            case SIMPLE_GREETING -> getter.getSimpleGreeting();
            default -> getPhrase(r.getElement(PhraseType.values()));
        };
    }

    private PhraseGetter getGetter() {
        if (StringHelper.isNullOrEmpty(locale.getLanguage()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            return new common.PhraseGetter(r);
        else if (locale.getLanguage().equals("en"))
            return new english.PhraseGetter(r);
        else if (locale.getLanguage().equals("es"))
            return new spanish.PhraseGetter(r);
        return new international.PhraseGetter(r);
    }
}
