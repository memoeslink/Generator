package english;

public interface NameDefiner extends common.NameDefiner {

    public String getFemaleMiddleName();

    public String getFemaleMiddleName(int id);

    public String getMaleMiddleName();

    public String getMaleMiddleName(int id);

    public String getMiddleNameInitial();

    public String getDoubleBarrelledSurname();

    public String getDoubleBarrelledSurname(int startId, int endId);
}
