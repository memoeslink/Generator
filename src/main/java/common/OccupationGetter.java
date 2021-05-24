package common;

public class OccupationGetter implements OccupationDefiner {
    protected Randomizer r;

    public OccupationGetter() {
        r = new Randomizer();
    }

    protected OccupationGetter(Randomizer r) {
        this.r = r != null ? r : new Randomizer();
    }

    @Override
    public String getOccupation() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getOccupation(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleOccupation() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getFemaleOccupation(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleOccupation() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getMaleOccupation(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getGenderlessOccupation() {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public String getGenderlessOccupation(int id) {
        return Database.DEFAULT_VALUE;
    }

    @Override
    public OccupationGetter with(Randomizer r) {
        return new OccupationGetter(r);
    }
}
