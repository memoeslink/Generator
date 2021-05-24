package international;

import common.OccupationDefiner;
import common.Randomizer;

public final class OccupationGetter extends common.OccupationGetter implements OccupationDefiner {

    public OccupationGetter() {
        super();
    }

    private OccupationGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getOccupation() {
        return getAnyGetter().getOccupation();
    }

    @Override
    public String getOccupation(int id) {
        return getAnyGetter().getOccupation(id);
    }

    @Override
    public String getFemaleOccupation() {
        return getAnyGetter().getFemaleOccupation();
    }

    @Override
    public String getFemaleOccupation(int id) {
        return getAnyGetter().getFemaleOccupation(id);
    }

    @Override
    public String getMaleOccupation() {
        return getAnyGetter().getMaleOccupation();
    }

    @Override
    public String getMaleOccupation(int id) {
        return getAnyGetter().getMaleOccupation(id);
    }

    @Override
    public String getGenderlessOccupation() {
        return getAnyGetter().getGenderlessOccupation();
    }

    @Override
    public String getGenderlessOccupation(int id) {
        return getAnyGetter().getGenderlessOccupation(id);
    }

    @Override
    public OccupationGetter with(Randomizer r) {
        return new OccupationGetter(r);
    }

    public common.OccupationGetter getAnyGetter() {
        switch (r.getInt(2)) {
            case 0:
                return new english.OccupationGetter().with(r);
            case 1:
                return new spanish.OccupationGetter().with(r);
        }
        return new common.OccupationGetter().with(r);
    }
}
