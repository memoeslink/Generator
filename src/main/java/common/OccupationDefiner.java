package common;

public interface OccupationDefiner {

    public String getOccupation();

    public String getOccupation(int id);

    public String getFemaleOccupation();

    public String getFemaleOccupation(int id);

    public String getMaleOccupation();

    public String getMaleOccupation(int id);

    public String getGenderlessOccupation();

    public String getGenderlessOccupation(int id);

    public OccupationGetter with(Randomizer r);
}
