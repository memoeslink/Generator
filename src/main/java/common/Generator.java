package common;

import com.memoeslink.common.Randomizer;

import java.util.Locale;

public class Generator {
    protected Locale locale;
    protected Randomizer r;

    protected Generator() {
        this(null, null);
    }

    protected Generator(Long seed) {
        this(null, seed);
    }

    protected Generator(Locale locale, Long seed) {
        this.locale = locale != null ? locale : Locale.of("xx");
        this.r = new Randomizer(seed);
    }

    public Locale getLocale() {
        return locale;
    }

    public Randomizer getRandomizer() {
        return r;
    }

    public String getDefaultValue() {
        return Database.DEFAULT_VALUE;
    }
}
