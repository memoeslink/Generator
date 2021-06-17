package common;

import java.util.Locale;

public class PersonGenerator extends Generator {
    NameGenerator nameGenerator;

    public PersonGenerator() {
        super();
        nameGenerator = new NameGenerator();
    }

    public PersonGenerator(Locale locale, Long seed) {
        super(locale, seed);
        nameGenerator = new NameGenerator(locale, seed);
    }

    public Person getPerson(Gender gender) {
        return new Person.PersonBuilder().setForename("TEST")
                .build();
    }
}
