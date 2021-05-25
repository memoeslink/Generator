package common;

public interface NameDefiner {

    public String getEmptyName();

    public String getDefaultName();

    public String getTestName();

    public String getFemaleForename();

    public String getFemaleForename(int id);

    public String getMaleForename();

    public String getMaleForename(int id);

    public String getDoubleBarrelledFemaleForename();

    public String getDoubleBarrelledFemaleForename(int startId, int endId);

    public String getDoubleBarrelledMaleForename();

    public String getDoubleBarrelledMaleForename(int startId, int endId);

    public String getDoubleFemaleForename();

    public String getDoubleFemaleForename(int startId, int endId);

    public String getDoubleMaleForename();

    public String getDoubleMaleForename(int startId, int endId);

    public String getSurname();

    public String getSurname(int id);

    public String getDualSurname();

    public String getDualSurname(int startId, int endId);

    public String getSimpleFemaleName();

    public String getSimpleFemaleName(int forenameId, int surnameId);

    public String getSimpleMaleName();

    public String getSimpleMaleName(int forenameId, int surnameId);

    public NameGetter with(Randomizer r);
}
