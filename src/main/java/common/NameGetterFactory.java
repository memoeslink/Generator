package common;

import org.memoeslink.StringHelper;

public class NameGetterFactory {

    private NameGetterFactory() {
    }

    public static NameGetter getNameGetter(String locale) {
        if (StringHelper.isNullOrBlank(locale))
            return new common.NameGetter();

        return switch (locale) {
            case "ar" -> new arabic.NameGetter();
            case "de" -> new german.NameGetter();
            case "en" -> new english.NameGetter();
            case "es" -> new spanish.NameGetter();
            case "es_MX" -> new spanish.mexico.NameGetter();
            case "fr" -> new french.NameGetter();
            case "it" -> new italian.NameGetter();
            case "hi" -> new hindi.NameGetter();
            case "ja" -> new japanese.NameGetter();
            case "pt" -> new portuguese.NameGetter();
            case "ru" -> new russian.NameGetter();
            default -> new common.NameGetter();
        };
    }
}
