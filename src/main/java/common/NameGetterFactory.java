package common;

import com.memoeslink.common.Randomizer;
import org.memoeslink.StringHelper;
import org.memoeslink.Validation;

import java.util.Locale;

public class NameGetterFactory {

    private NameGetterFactory() {
    }

    public static NameGetter getNameGetter(String locale) {
        return getNameGetter(locale, null);
    }

    public static NameGetter getNameGetter(String locale, Randomizer r) {
        if (!Validation.isLocale(locale))
            return new international.NameGetter(r);
        locale = StringHelper.replace(locale, "_", "-");

        if (!StringHelper.equalsAny(locale, Constant.SUPPORTED_LOCALES))
            return new international.NameGetter(r);
        return getNameGetter(Locale.forLanguageTag(locale), r);
    }

    public static NameGetter getNameGetter(Locale locale) {
        return getNameGetter(locale, null);
    }

    public static NameGetter getNameGetter(Locale locale, Randomizer r) {
        if (locale == null || StringHelper.isNullOrBlank(locale.getLanguage()) || locale.getLanguage().equals("xx") ||
                locale.getCountry().equals("XX"))
            return new international.NameGetter(r);

        return switch (locale.getLanguage()) {
            case "ar" -> new arabic.NameGetter(r);
            case "de" -> new german.NameGetter(r);
            case "en" -> new english.NameGetter(r);
            case "es" ->
                    locale.getCountry().equals("MX") ? new spanish.mexico.NameGetter(r) : new spanish.NameGetter(r);
            case "fr" -> new french.NameGetter(r);
            case "it" -> new italian.NameGetter(r);
            case "hi" -> new hindi.NameGetter(r);
            case "ja" -> new japanese.NameGetter(r);
            case "pt" -> new portuguese.NameGetter(r);
            case "ru" -> new russian.NameGetter(r);
            default -> new international.NameGetter(r);
        };
    }
}
