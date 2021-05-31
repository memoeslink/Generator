package english;

import common.NameDefiner;
import common.*;

public final class NameGetter extends common.NameGetter implements NameDefiner, english.NameDefiner {

    public NameGetter() {
        super();
    }

    private NameGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getFemaleForename() {
        return getFemaleForename(r.getInt(1, Database.countEnglishFemaleNames()));
    }

    @Override
    public String getFemaleForename(int id) {
        return Database.selectEnglishFemaleName(id);
    }

    @Override
    public String getMaleForename() {
        return getMaleForename(r.getInt(1, Database.countEnglishMaleNames()));
    }

    @Override
    public String getMaleForename(int id) {
        return Database.selectEnglishMaleName(id);
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
        return getSurname(r.getInt(1, Database.countEnglishSurnames()));
    }

    @Override
    public String getSurname(int id) {
        return Database.selectEnglishSurname(id);
    }

    @Override
    public String getDualSurname() {
        return getDoubleBarrelledSurname();
    }

    @Override
    public String getDualSurname(int startId, int endId) {
        return getDoubleBarrelledSurname(startId, endId);
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
        switch (r.getInt(7)) {
            case 1:
                return getFemaleForename() + Separator.SPACE.getCharacter() + getDualSurname();
            case 2:
                return (getDoubleBarrelledFemaleForename() + Separator.SPACE.getCharacter() +
                        getSurname());
            case 3:
                return (getFemaleForename() + Separator.SPACE.getCharacter() +
                        getFemaleMiddleName() + Separator.SPACE.getCharacter() +
                        getSurname());
            case 4:
                return (getFemaleForename() + Separator.SPACE.getCharacter() +
                        getMiddleNameInitial() + Separator.SPACE.getCharacter() +
                        getSurname());
            case 5:
                return (getFemaleForename() + Separator.SPACE.getCharacter() +
                        getFemaleMiddleName() + Separator.SPACE.getCharacter() +
                        getDualSurname());
            case 6:
                return (getFemaleForename() + Separator.SPACE.getCharacter() +
                        getMiddleNameInitial() + Separator.SPACE.getCharacter() +
                        getDualSurname());
            case 0:
            default:
                return getFemaleSimpleName();
        }
    }

    @Override
    public String getMaleFullName() {
        switch (r.getInt(7)) {
            case 1:
                return getMaleForename() + Separator.SPACE.getCharacter() + getDualSurname();
            case 2:
                return (getDoubleBarrelledMaleForename() + Separator.SPACE.getCharacter() +
                        getSurname());
            case 3:
                return (getMaleForename() + Separator.SPACE.getCharacter() +
                        getMaleMiddleName() + Separator.SPACE.getCharacter() +
                        getSurname());
            case 4:
                return (getMaleForename() + Separator.SPACE.getCharacter() +
                        getMiddleNameInitial() + Separator.SPACE.getCharacter() +
                        getSurname());
            case 5:
                return (getMaleForename() + Separator.SPACE.getCharacter() +
                        getMaleMiddleName() + Separator.SPACE.getCharacter() +
                        getDualSurname());
            case 6:
                return (getMaleForename() + Separator.SPACE.getCharacter() +
                        getMiddleNameInitial() + Separator.SPACE.getCharacter() +
                        getDualSurname());
            case 0:
            default:
                return getFemaleSimpleName();
        }
    }

    @Override
    public String getUsername() {
        return Database.selectUsername(r.getInt(1, Database.countUsernames()));
    }

    @Override
    public String getCompositeUsername() {
        String adjective = StringHelper.removeAll(new AdjectiveGetter().with(r).getAdjective(), "[^a-zA-Z0-9\\\\s]");
        String noun = StringHelper.removeAll(new NounGetter().with(r).getNoun(), "[^a-zA-Z0-9\\\\s]");
        return getCompositeUsername(adjective, noun, r);
    }

    @Override
    public String getDerivedUsername() {
        return getDerivedUsername(Database.selectFamilyName(r.getInt(1, Database.countFamilyNames())), r);
    }

    @Override
    public NameGetter with(Randomizer r) {
        return new NameGetter(r);
    }

    @Override
    public String getFemaleMiddleName() {
        return getFemaleForename();
    }

    @Override
    public String getFemaleMiddleName(int id) {
        return getFemaleForename(id);
    }

    @Override
    public String getMaleMiddleName() {
        return getMaleForename();
    }

    @Override
    public String getMaleMiddleName(int id) {
        return getMaleForename(id);
    }

    @Override
    public String getMiddleNameInitial() {
        return Getter.with(r).getAChar(Constant.UPPERCASE_ALPHABET) + StringHelper.EMPTY + Separator.DOT.getCharacter();
    }

    @Override
    public String getDoubleBarrelledSurname() {
        return getSurname() + Separator.HYPHEN.getCharacter() + getSurname();
    }

    @Override
    public String getDoubleBarrelledSurname(int startId, int endId) {
        return getSurname(startId) + Separator.HYPHEN.getCharacter() + getSurname(endId);
    }
}
