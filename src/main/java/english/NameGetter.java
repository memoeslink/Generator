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
    public String getFemaleName() {
        return getFemaleName(r.getInt(1, Database.countEnglishFemaleNames()));
    }

    @Override
    public String getFemaleName(int id) {
        return Database.selectEnglishFemaleName(id);
    }

    @Override
    public String getMaleName() {
        return getMaleName(r.getInt(1, Database.countEnglishMaleNames()));
    }

    @Override
    public String getMaleName(int id) {
        return Database.selectEnglishMaleName(id);
    }

    @Override
    public String getDoubleBarrelledFemaleName() {
        return getFemaleName() + Separator.HYPHEN.getCharacter() + getFemaleName();
    }

    @Override
    public String getDoubleBarrelledFemaleName(int startId, int endId) {
        return getFemaleName(startId) + Separator.HYPHEN.getCharacter() + getFemaleName(endId);
    }

    @Override
    public String getDoubleBarrelledMaleName() {
        return getMaleName() + Separator.HYPHEN.getCharacter() + getMaleName();
    }

    @Override
    public String getDoubleBarrelledMaleName(int startId, int endId) {
        return getMaleName(startId) + Separator.HYPHEN.getCharacter() + getMaleName(endId);
    }

    @Override
    public String getDoubleFemaleName() {
        return getFemaleName() + Separator.SPACE.getCharacter() + getFemaleName();
    }

    @Override
    public String getDoubleFemaleName(int startId, int endId) {
        return getFemaleName(startId) + Separator.SPACE.getCharacter() + getFemaleName(endId);
    }

    @Override
    public String getDoubleMaleName() {
        return getMaleName() + Separator.SPACE.getCharacter() + getMaleName();
    }

    @Override
    public String getDoubleMaleName(int startId, int endId) {
        return getMaleName(startId) + Separator.SPACE.getCharacter() + getMaleName(endId);
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
    public NameGetter with(Randomizer r) {
        return new NameGetter(r);
    }

    @Override
    public String getFemaleMiddleName() {
        return getFemaleName();
    }

    @Override
    public String getFemaleMiddleName(int id) {
        return getFemaleName(id);
    }

    @Override
    public String getMaleMiddleName() {
        return getMaleName();
    }

    @Override
    public String getMaleMiddleName(int id) {
        return getMaleName(id);
    }

    @Override
    public String getMiddleNameInitial() {
        return Constant.ENGLISH_UPPERCASE_ALPHABET.charAt(0) + "" + Separator.DOT.getCharacter();
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
