package common;

public class NameGetter implements NameDefiner {
    protected Randomizer r;

    public NameGetter() {
        r = new Randomizer();
    }

    protected NameGetter(Randomizer r) {
        this.r = r != null ? r : new Randomizer();
    }

    @Override
    public String getEmptyName() {
        return StringHelper.EMPTY;
    }

    @Override
    public String getDefaultName() {
        return Constant.DEFAULT_NAME;
    }

    @Override
    public String getTestName() {
        return Constant.TEST_NAME;
    }

    @Override
    public String getFemaleForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleForename(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleForename(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledFemaleForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledFemaleForename(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledMaleForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledMaleForename(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleFemaleForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleFemaleForename(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleMaleForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleMaleForename(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getSurname() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getSurname(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDualSurname() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDualSurname(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getSimpleFemaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getSimpleFemaleName(int forenameId, int surnameId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getSimpleMaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getSimpleMaleName(int forenameId, int surnameId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public NameGetter with(Randomizer r) {
        return new common.NameGetter(r);
    }
}
