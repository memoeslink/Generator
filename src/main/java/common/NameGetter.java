package common;

public class NameGetter extends Getter implements NameDefiner {

    public NameGetter() {
        super();
    }

    public NameGetter(Randomizer r) {
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
    public String getFemaleDefinedForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleDefinedForename(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleDefinedForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleDefinedForename(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDefinedFamilyName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDefinedFamilyName(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleDefinedFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleDefinedFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getDefinedFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleIterativeForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleIterativeForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getIterativeFamilyName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleIterativeFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleIterativeFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getIterativeFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMalePatternForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemalePatternForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPatternFamilyName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemalePatternFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMalePatternFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPatternFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleFrequencyForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleFrequencyForename(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleFrequencyForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleFrequencyForename(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFrequencyFamilyName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFrequencyFamilyName(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleFrequencyFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleFrequencyFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFrequencyFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMalePredefinedForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMalePredefinedForename(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemalePredefinedForename() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemalePredefinedForename(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPredefinedFamilyName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPredefinedFamilyName(int type) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemalePredefinedFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMalePredefinedFullName() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getPredefinedFullName() {
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
    public String getAnonymousAnimal() {
        return Database.DEFAULT_VALUE;
    }
}
