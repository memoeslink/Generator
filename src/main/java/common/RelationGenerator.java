package common;

import java.util.Locale;

public class RelationGenerator extends Generator {

    public RelationGenerator() {
        super();
    }

    public RelationGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public TextComponent getRelation(Person person, int type, Gender gender) {
        RelationGetter getter = getGetter();
        gender = gender != null ? gender : Gender.UNDEFINED;

        switch (gender) {
            case MASCULINE:
                return getter.getMaleRelationship(person, type);
            case FEMININE:
                return getter.getFemaleRelationship(person, type);
            case NEUTRAL:
                return getter.getRelationship(person, type);
            case UNDEFINED:
            default:
                return getRelation(person, type, Gender.values()[r.getInt(Gender.values().length)]);
        }
    }

    private RelationGetter getGetter() {
        if (StringHelper.isNullOrEmpty(locale.getLanguage()) ||
                locale.getLanguage().equals("xx") || locale.getCountry().equals("XX"))
            return new common.RelationGetter(r);
        else if (locale.getLanguage().equals("en"))
            return new english.RelationGetter(r);
        else if (locale.getLanguage().equals("es"))
            return new spanish.RelationGetter(r);
        return new international.RelationGetter(r);
    }
}