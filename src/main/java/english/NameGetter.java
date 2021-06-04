package english;

import common.NameDefiner;
import common.*;

public final class NameGetter extends common.NameGetter implements NameDefiner, english.NameDefiner {
    private final NounGetter nounGetter;
    private final AdjectiveGetter adjectiveGetter;

    public NameGetter() {
        super();
        nounGetter = new NounGetter();
        adjectiveGetter = new AdjectiveGetter();
    }

    private NameGetter(Randomizer r) {
        super(r);
        nounGetter = new NounGetter().with(r);
        adjectiveGetter = new AdjectiveGetter().with(r);
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
        switch (r.getInt(8)) {
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
            case 7:
                return getFemaleName();
            case 0:
            default:
                return getFemaleSimpleName();
        }
    }

    @Override
    public String getMaleFullName() {
        switch (r.getInt(8)) {
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
            case 7:
                return getMaleName();
            case 0:
            default:
                return getFemaleSimpleName();
        }
    }

    @Override
    public String getFullName() {
        switch (r.getInt(2)) {
            case 0:
                return getFemaleFullName();
            case 1:
                return getMaleFullName();
            default:
                return Database.DEFAULT_VALUE;
        }
    }

    @Override
    public String getFemaleDefinedForename() {
        return new international.NameGetter().with(r).getFemaleDefinedForename();
    }

    @Override
    public String getFemaleDefinedForename(int type) {
        return new international.NameGetter().with(r).getFemaleDefinedForename(type);
    }

    @Override
    public String getMaleDefinedForename() {
        return new international.NameGetter().with(r).getMaleDefinedForename();
    }

    @Override
    public String getMaleDefinedForename(int type) {
        return new international.NameGetter().with(r).getMaleDefinedForename(type);
    }

    @Override
    public String getDefinedFamilyName() {
        return new international.NameGetter().with(r).getDefinedFamilyName();
    }

    @Override
    public String getDefinedFamilyName(int type) {
        return new international.NameGetter().with(r).getDefinedFamilyName(type);
    }

    @Override
    public String getFemaleDefinedFullName() {
        return new international.NameGetter().with(r).getFemaleDefinedFullName();
    }

    @Override
    public String getMaleDefinedFullName() {
        return new international.NameGetter().with(r).getMaleDefinedFullName();
    }

    @Override
    public String getDefinedFullName() {
        return new international.NameGetter().with(r).getDefinedFullName();
    }

    @Override
    public String getUsername() {
        return Database.selectUsername(r.getInt(1, Database.countUsernames()));
    }

    @Override
    public String getCompositeUsername() {
        String adjective = StringHelper.removeAll(adjectiveGetter.getAdjective(), "[^a-zA-Z0-9\\\\s]");
        String noun = StringHelper.removeAll(nounGetter.getNoun(), "[^a-zA-Z0-9\\\\s]");
        return getCompositeUsername(adjective, noun, r);
    }

    @Override
    public String getDerivedUsername() {
        return getDerivedUsername(Database.selectFamilyName(r.getInt(1, Database.countFamilyNames())), r);
    }

    @Override
    public String getAnonymousName() {
        String adjective = StringHelper.removeAll(adjectiveGetter.getAdjective(), "[^a-zA-Z0-9\\\\s]");
        String noun = StringHelper.removeAll(nounGetter.getNoun(), "[^a-zA-Z0-9\\\\s]");
        return StringHelper.joinWithSpace(adjective, noun);
    }

    @Override
    public String getAnonymousAnimal() {
        return "Anonymous" + Separator.SPACE.getCharacter() +
                StringHelper.capitalize(ResourceGetter.with(r).getString(Constant.ANONYMOUS_ANIMALS));
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
        return ResourceGetter.with(r).getUpperCase() + StringHelper.EMPTY +
                Separator.DOT.getCharacter();
    }

    @Override
    public String getDoubleBarrelledSurname() {
        return getSurname() + Separator.HYPHEN.getCharacter() + getSurname();
    }

    @Override
    public String getDoubleBarrelledSurname(int startId, int endId) {
        return getSurname(startId) + Separator.HYPHEN.getCharacter() + getSurname(endId);
    }

    @Override
    public String getFemaleName() {
        return getFemaleFullName() + Separator.SPACE.getCharacter() + getGenerationalSuffix(r);
    }

    @Override
    public String getMaleName() {
        return getMaleFullName() + Separator.SPACE.getCharacter() + getGenerationalSuffix(r);
    }
}
