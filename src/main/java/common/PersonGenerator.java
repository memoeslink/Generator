package common;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class PersonGenerator extends Generator {
    GeneratorManager generatorManager;

    public PersonGenerator() {
        super();
        generatorManager = new GeneratorManager(new Locale("xx"));
    }

    public PersonGenerator(Locale locale, Long seed) {
        super(locale, seed);
        generatorManager = new GeneratorManager(locale, seed);
    }

    public Person getPerson(Gender gender) {
        gender = gender != null ? gender : Gender.UNDEFINED;
        String name;

        switch (gender) {
            case MASCULINE:
                name = new GeneratorManager(new Locale("xx")).getNameGenerator().getName(NameType.MALE_FULL_NAME);
                break;
            case FEMININE:
                name = new GeneratorManager(new Locale("xx")).getNameGenerator().getName(NameType.FEMALE_FULL_NAME);
                break;
            case NEUTRAL:
            case UNDEFINED:
            default:
                name = new GeneratorManager(new Locale("xx")).getNameGenerator().getName(NameType.FULL_NAME);
                break;
        }
        String japaneseHonorific = StringHelper.EMPTY;

        if (StringHelper.endsWithAny(name, "-chan", "-kun", "-sama", "-san")) {
            List<String> parts = StringHelper.split(name, Separator.HYPHEN.getCharacter());
            name = parts.get(0);
            japaneseHonorific = parts.get(1);
        }
        Gender tempGender = gender != Gender.UNDEFINED ? gender : Gender.NEUTRAL;
        OccupationType occupationType;

        do {
            occupationType = OccupationType.values()[OccupationType.values().length];
        } while (occupationType.getGender() != tempGender);
        String occupation = generatorManager.getOccupationGenerator().getOccupation(occupationType);
        String postNominalLetters = ResourceGetter.with(r).getString(Constant.POST_NOMINAL_LETTERS);
        LocalDate birthdate = generatorManager.getDateTimeGenerator().getDate();

        switch (r.getInt(4)) {
            case 0:
                postNominalLetters = StringHelper.EMPTY;
                break;
            case 1:
                occupation = StringHelper.EMPTY;
                break;
            default:
                occupation = StringHelper.EMPTY;
                postNominalLetters = StringHelper.EMPTY;
                break;
        }

        return new Person.PersonBuilder()
                .setFullName(name)
                .setGender(gender)
                .setJapaneseHonorific(japaneseHonorific)
                .setOccupation(occupation)
                .setPostNominalLetters(postNominalLetters)
                .setBirthdate(birthdate)
                .build();
    }
}
