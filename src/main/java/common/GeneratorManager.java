package common;

import java.util.Locale;

public class GeneratorManager {
    private Locale locale;
    private Long seed;
    private NameGenerator nameGenerator;
    private OccupationGenerator occupationGenerator;

    public GeneratorManager() {
        this(Locale.ENGLISH, null);
    }

    public GeneratorManager(Locale locale) {
        this(locale, null);
    }

    public GeneratorManager(Locale locale, Long seed) {
        this.locale = locale;
        this.seed = seed;
        initializeGenerators();
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
        initializeGenerators();
    }

    public Long getSeed() {
        return seed;
    }

    public void setSeed(Long seed) {
        this.seed = seed;
        initializeGenerators();
    }

    public NameGenerator getNameGenerator() {
        return nameGenerator;
    }

    public OccupationGenerator getOccupationGenerator() {
        return occupationGenerator;
    }

    private void initializeGenerators() {
        nameGenerator = new NameGenerator(locale, seed);
        occupationGenerator = new OccupationGenerator(locale, seed);
    }
}
