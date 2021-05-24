package common;

public interface NameDefiner {

    public String getEmptyName();

    public String getDefaultName();

    public String getTestName();

    public String getFemaleName();

    public String getFemaleName(int id);

    public String getMaleName();

    public String getMaleName(int id);

    public String getDoubleBarrelledFemaleName();

    public String getDoubleBarrelledFemaleName(int startId, int endId);

    public String getDoubleBarrelledMaleName();

    public String getDoubleBarrelledMaleName(int startId, int endId);

    public String getDoubleFemaleName();

    public String getDoubleFemaleName(int startId, int endId);

    public String getDoubleMaleName();

    public String getDoubleMaleName(int startId, int endId);

    public String getSurname();

    public String getSurname(int id);

    public String getDualSurname();

    public String getDualSurname(int startId, int endId);

    public NameGetter with(Randomizer r);
}
