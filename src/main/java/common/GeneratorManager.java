package common;

import java.util.Locale;

public class GeneratorManager {
    private Locale locale;
    private Long seed;
    private NameGenerator nameGenerator;
    private UsernameGenerator usernameGenerator;
    private OccupationGenerator occupationGenerator;
    private NounGenerator nounGenerator;
    private AdjectiveGenerator adjectiveGenerator;
    private DateTimeGenerator dateTimeGenerator;
    private PersonGenerator personGenerator;
    private StringGenerator stringGenerator;
    private RelationGenerator relationGenerator;
    private PhraseGenerator phraseGenerator;

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

    public UsernameGenerator getUsernameGenerator() {
        return usernameGenerator;
    }

    public OccupationGenerator getOccupationGenerator() {
        return occupationGenerator;
    }

    public NounGenerator getNounGenerator() {
        return nounGenerator;
    }

    public AdjectiveGenerator getAdjectiveGenerator() {
        return adjectiveGenerator;
    }

    public DateTimeGenerator getDateTimeGenerator() {
        return dateTimeGenerator;
    }

    public PersonGenerator getPersonGenerator() {
        return personGenerator;
    }

    public StringGenerator getStringGenerator() {
        return stringGenerator;
    }

    public RelationGenerator getRelationGenerator() {
        return relationGenerator;
    }

    public PhraseGenerator getPhraseGenerator() {
        return phraseGenerator;
    }

    private void initializeGenerators() {
        nameGenerator = new NameGenerator(locale, seed);
        usernameGenerator = new UsernameGenerator(locale, seed);
        occupationGenerator = new OccupationGenerator(locale, seed);
        nounGenerator = new NounGenerator(locale, seed);
        adjectiveGenerator = new AdjectiveGenerator(locale, seed);
        dateTimeGenerator = new DateTimeGenerator(locale, seed);
        personGenerator = new PersonGenerator(locale, seed);
        stringGenerator = new StringGenerator(locale, seed);
        relationGenerator = new RelationGenerator(locale, seed);
        phraseGenerator = new PhraseGenerator(locale, seed);
    }
}
