package international;

import com.memoeslink.common.Randomizer;
import common.Gender;
import common.Person;
import common.RelationDefiner;
import common.TextComponent;

public final class RelationGetter extends common.RelationGetter implements RelationDefiner {

    public RelationGetter() {
        super();
    }

    public RelationGetter(Randomizer r) {
        super(r);
    }

    @Override
    public TextComponent getRelationship(Person person) {
        return getAnyGetter().getRelationship(person);
    }

    @Override
    public TextComponent getRelationship(Person person, int type) {
        return getAnyGetter().getRelationship(person, type);
    }

    @Override
    public TextComponent getRelationship(Person person, int type, Gender gender) {
        return getAnyGetter().getRelationship(person, type, gender);
    }

    @Override
    public TextComponent getFemaleRelationship(Person person, int type) {
        return getAnyGetter().getFemaleRelationship(person, type);
    }

    @Override
    public TextComponent getMaleRelationship(Person person, int type) {
        return getAnyGetter().getMaleRelationship(person, type);
    }

    @Override
    public TextComponent getUnspecificRelationship() {
        return getAnyGetter().getUnspecificRelationship();
    }

    @Override
    public TextComponent getUnspecificRelationship(int type) {
        return getAnyGetter().getUnspecificRelationship(type);
    }

    @Override
    public TextComponent getUnspecificRelationship(int type, Gender gender) {
        return getAnyGetter().getUnspecificRelationship(type, gender);
    }

    @Override
    public TextComponent getFemaleUnspecificRelationship(int type) {
        return getAnyGetter().getFemaleUnspecificRelationship(type);
    }

    @Override
    public TextComponent getMaleUnspecificRelationship(int type) {
        return getAnyGetter().getMaleUnspecificRelationship(type);
    }

    public common.RelationGetter getAnyGetter() {
        return switch (r.getInt(2)) {
            case 0 -> new english.RelationGetter(r);
            case 1 -> new spanish.RelationGetter(r);
            default -> new common.RelationGetter(r);
        };
    }
}
