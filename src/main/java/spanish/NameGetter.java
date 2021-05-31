package spanish;

import common.NameDefiner;
import common.*;

public final class NameGetter extends common.NameGetter implements NameDefiner, spanish.NameDefiner {

    public NameGetter() {
        super();
    }

    private NameGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getFemaleForename() {
        return getFemaleForename(r.getInt(1, Database.countHispanicFemaleNames()));
    }

    @Override
    public String getFemaleForename(int id) {
        return Database.selectHispanicFemaleName(id);
    }

    @Override
    public String getMaleForename() {
        return getMaleForename(r.getInt(1, Database.countHispanicMaleNames()));
    }

    @Override
    public String getMaleForename(int id) {
        return Database.selectHispanicMaleName(id);
    }

    @Override
    public String getDoubleBarrelledFemaleForename() {
        return getFemaleForename() + Separator.HYPHEN.getCharacter() + getFemaleForename();
    }

    @Override
    public String getDoubleBarrelledFemaleForename(int startId, int endId) {
        return getFemaleForename(startId) + Separator.HYPHEN.getCharacter() + getFemaleForename(endId);
    }

    @Override
    public String getDoubleBarrelledMaleForename() {
        return getMaleForename() + Separator.HYPHEN.getCharacter() + getMaleForename();
    }

    @Override
    public String getDoubleBarrelledMaleForename(int startId, int endId) {
        return getMaleForename(startId) + Separator.HYPHEN.getCharacter() + getMaleForename(endId);
    }

    @Override
    public String getDoubleFemaleForename() {
        return getFemaleForename() + Separator.SPACE.getCharacter() + getFemaleForename();
    }

    @Override
    public String getDoubleFemaleForename(int startId, int endId) {
        return getFemaleForename(startId) + Separator.SPACE.getCharacter() + getFemaleForename(endId);
    }

    @Override
    public String getDoubleMaleForename() {
        return getMaleForename() + Separator.SPACE.getCharacter() + getMaleForename();
    }

    @Override
    public String getDoubleMaleForename(int startId, int endId) {
        return getMaleForename(startId) + Separator.SPACE.getCharacter() + getMaleForename(endId);
    }

    @Override
    public String getSurname() {
        return getSurname(r.getInt(1, Database.countHispanicSurnames()));
    }

    @Override
    public String getSurname(int id) {
        return Database.selectHispanicSurname(id);
    }

    @Override
    public String getDualSurname() {
        return getDoubleSurname();
    }

    @Override
    public String getDualSurname(int startId, int endId) {
        return getDoubleSurname(startId, endId);
    }

    @Override
    public String getFemaleSimpleName() {
        return getFemaleForename() + Separator.SPACE.getCharacter() + getSurname();
    }

    @Override
    public String getFemaleSimpleName(int forenameId, int surnameId) {
        return getFemaleForename(forenameId) + Separator.SPACE.getCharacter() + getSurname(surnameId);
    }

    @Override
    public String getMaleSimpleName() {
        return getMaleForename() + Separator.SPACE.getCharacter() + getSurname();
    }

    @Override
    public String getMaleSimpleName(int forenameId, int surnameId) {
        return getMaleForename(forenameId) + Separator.SPACE.getCharacter() + getSurname(surnameId);
    }

    @Override
    public String getFemaleFullName() {
        switch (r.getInt(4)) {
            case 1:
                return getFemaleForename() + Separator.SPACE.getCharacter() + getSurnames();
            case 2:
                return getDoubleFemaleForename() + Separator.SPACE.getCharacter() + getSurnames();
            case 3:
                return getFemaleForenames() + Separator.SPACE.getCharacter() + getSurnames();
            case 0:
            default:
                return getFemaleSimpleName();
        }
    }

    @Override
    public String getMaleFullName() {
        switch (r.getInt(4)) {
            case 1:
                return getMaleForename() + Separator.SPACE.getCharacter() + getSurnames();
            case 2:
                return getDoubleMaleForename() + Separator.SPACE.getCharacter() + getSurnames();
            case 3:
                return getMaleForenames() + Separator.SPACE.getCharacter() + getSurnames();
            case 0:
            default:
                return getMaleSimpleName();
        }
    }

    @Override
    public String getUsername() {
        return Database.selectUsername(r.getInt(1, Database.countUsernames()));
    }

    @Override
    public String getCompositeUsername() {
        String adjective;
        String noun;

        switch (r.getInt(6)) {
            case 0:
                adjective = new AdjectiveGetter().with(r).getAdjective();
                noun = new NounGetter().with(r).getNoun();
                break;
            case 1:
                adjective = new AdjectiveGetter().with(r).getPluralAdjective();
                noun = new NounGetter().with(r).getPluralNoun();
                break;
            case 2:
                adjective = new AdjectiveGetter().with(r).getFemaleAdjective();
                noun = new NounGetter().with(r).getFemaleNoun();
                break;
            case 3:
                adjective = new AdjectiveGetter().with(r).getPluralFemaleAdjective();
                noun = new NounGetter().with(r).getPluralFemaleNoun();
                break;
            case 4:
                adjective = new AdjectiveGetter().with(r).getMaleAdjective();
                noun = new NounGetter().with(r).getMaleNoun();
                break;
            case 5:
                adjective = new AdjectiveGetter().with(r).getPluralMaleAdjective();
                noun = new NounGetter().with(r).getPluralMaleNoun();
                break;
            default:
                adjective = Database.DEFAULT_VALUE;
                noun = Database.DEFAULT_VALUE;
                break;
        }
        return getCompositeUsername(noun, adjective, r);
    }

    @Override
    public NameGetter with(Randomizer r) {
        return new NameGetter(r);
    }

    @Override
    public String getForenames(Gender gender) {
        StringBuilder sb = new StringBuilder();
        float[] probabilities = {1.0F, 0.8F, 0.125F, 0.05F, 0.0125F};

        for (float probability : probabilities) {
            if (probability >= r.getFloat()) {
                if (sb.length() > 0)
                    sb.append(Separator.SPACE.getCharacter());
                sb.append(getForename(gender));
            } else
                break;
        }
        return sb.toString();
    }

    @Override
    public String getFemaleForenames() {
        return getForenames(Gender.FEMININE);
    }

    @Override
    public String getMaleForenames() {
        return getForenames(Gender.MASCULINE);
    }

    @Override
    public String getDoubleSurname() {
        return getSurname() + Separator.SPACE.getCharacter() + getSurname();
    }

    @Override
    public String getDoubleSurname(int startId, int endId) {
        return getSurname(startId) + Separator.SPACE.getCharacter() + getSurname(endId);
    }

    @Override
    public String getCompoundSurname() {
        return getCompoundSurname(r.getInt(1, Database.countHispanicCompoundSurnames()));
    }

    @Override
    public String getCompoundSurname(int id) {
        return Database.selectHispanicCompoundSurname(id);
    }

    @Override
    public String getSurnames() {
        switch (r.getInt(100)) {
            case 0:
                return getCompoundSurname() + Separator.SPACE.getCharacter() + getSurname();
            case 1:
                return getSurname() + Separator.SPACE.getCharacter() + getCompoundSurname();
            default:
                return getDualSurname();
        }
    }
}
