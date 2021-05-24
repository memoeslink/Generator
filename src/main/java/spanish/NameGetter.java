package spanish;

import common.Database;
import common.NameDefiner;
import common.Randomizer;
import common.Separator;

public final class NameGetter extends common.NameGetter implements NameDefiner, spanish.NameDefiner {

    public NameGetter() {
        super();
    }

    private NameGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getFemaleName() {
        return getFemaleName(r.getInt(1, Database.countHispanicFemaleNames()));
    }

    @Override
    public String getFemaleName(int id) {
        return Database.selectHispanicFemaleName(id);
    }

    @Override
    public String getMaleName() {
        return getMaleName(r.getInt(1, Database.countHispanicMaleNames()));
    }

    @Override
    public String getMaleName(int id) {
        return Database.selectHispanicMaleName(id);
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
    public NameGetter with(Randomizer r) {
        return new NameGetter(r);
    }

    @Override
    public String getDoubleSurname() {
        return getSurname() + Separator.SPACE.getCharacter() + getSurname();
    }

    @Override
    public String getDoubleSurname(int startId, int endId) {
        return getSurname(startId) + Separator.SPACE.getCharacter() + getSurname(endId);
    }
}
