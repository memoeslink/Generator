package spanish;

import com.memoeslink.common.Randomizer;
import common.*;

public class RelationGetter extends common.RelationGetter implements RelationDefiner {

    public RelationGetter() {
        super();
    }

    public RelationGetter(Randomizer r) {
        super(r);
    }

    @Override
    public TextComponent getRelationship(Person person) {
        int type = r.getInt(2, Constant.RELATIONSHIP.length);
        return getRelationship(person, type);
    }

    @Override
    public TextComponent getRelationship(Person person, int type) {
        return getRelationship(person, type, Gender.NEUTRAL);
    }

    @Override
    public TextComponent getRelationship(Person person, int type, Gender gender) {
        String relationship;

        if (person == null)
            relationship = ResourceGetter.with(r).getString(Constant.RELATIONSHIP, 0);
        else {
            relationship = ResourceGetter.with(r).getString(Constant.RELATIONSHIP, type);
            relationship = String.format(relationship,
                    StringHelper.getFirstNonEmptyElseDefault(person.getDescription(), person.getFullName()));
        }
        return TextProcessor.genderifyStr(relationship, gender);
    }

    @Override
    public TextComponent getFemaleRelationship(Person person, int type) {
        return getRelationship(person, type, Gender.FEMININE);
    }

    @Override
    public TextComponent getMaleRelationship(Person person, int type) {
        return getRelationship(person, type, Gender.MASCULINE);
    }

    @Override
    public TextComponent getUnspecificRelationship() {
        int type = r.getInt(2, Constant.RELATIONSHIP.length);
        return getUnspecificRelationship(type);
    }

    @Override
    public TextComponent getUnspecificRelationship(int type) {
        return getUnspecificRelationship(type, Gender.NEUTRAL);
    }

    @Override
    public TextComponent getUnspecificRelationship(int type, Gender gender) {
        String relationship = ResourceGetter.with(r).getString(Constant.UNSPECIFIC_RELATIONSHIP, type);
        return TextProcessor.genderifyStr(relationship, gender);
    }

    @Override
    public TextComponent getFemaleUnspecificRelationship(int type) {
        return getUnspecificRelationship(type, Gender.FEMININE);
    }

    @Override
    public TextComponent getMaleUnspecificRelationship(int type) {
        return getUnspecificRelationship(type, Gender.MASCULINE);
    }
}
