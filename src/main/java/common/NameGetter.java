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
    public String getFemaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleName(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleName(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledFemaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledFemaleName(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledMaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleBarrelledMaleName(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleFemaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleFemaleName(int startId, int endId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleMaleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDoubleMaleName(int startId, int endId) {
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
    public NameGetter with(Randomizer r) {
        return new common.NameGetter(r);
    }
}
