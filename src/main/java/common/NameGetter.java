package common;

public class NameGetter extends Getter implements NameDefiner {

    public NameGetter() {
        super();
    }

    protected NameGetter(Randomizer r) {
        super(r);
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
    public String getFemaleSimpleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleSimpleName(int forenameId, int surnameId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleSimpleName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleSimpleName(int forenameId, int surnameId) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getUsername() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getCompositeUsername() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDerivedUsername() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getAnonymousName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public NameGetter with(Randomizer r) {
        return new NameGetter(r);
    }
}
