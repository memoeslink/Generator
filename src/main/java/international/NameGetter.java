package international;

import common.NameDefiner;
import common.Randomizer;

public final class NameGetter extends common.NameGetter implements NameDefiner {

    public NameGetter() {
        super();
    }

    private NameGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getFemaleName() {
        return getAnyGetter().getFemaleName();
    }

    @Override
    public String getFemaleName(int id) {
        return getAnyGetter().getFemaleName(id);
    }

    @Override
    public String getMaleName() {
        return getAnyGetter().getMaleName();
    }

    @Override
    public String getMaleName(int id) {
        return getAnyGetter().getMaleName(id);
    }

    @Override
    public String getDoubleBarrelledFemaleName() {
        return getAnyGetter().getDoubleBarrelledFemaleName();
    }

    @Override
    public String getDoubleBarrelledFemaleName(int startId, int endId) {
        return getAnyGetter().getDoubleBarrelledFemaleName(startId, endId);
    }

    @Override
    public String getDoubleBarrelledMaleName() {
        return getAnyGetter().getDoubleBarrelledMaleName();
    }

    @Override
    public String getDoubleBarrelledMaleName(int startId, int endId) {
        return getAnyGetter().getDoubleBarrelledMaleName(startId, endId);
    }

    @Override
    public String getDoubleFemaleName() {
        return getAnyGetter().getDoubleFemaleName();
    }

    @Override
    public String getDoubleFemaleName(int startId, int endId) {
        return getAnyGetter().getDoubleFemaleName(startId, endId);
    }

    @Override
    public String getDoubleMaleName() {
        return getAnyGetter().getDoubleMaleName();
    }

    @Override
    public String getDoubleMaleName(int startId, int endId) {
        return getAnyGetter().getDoubleMaleName(startId, endId);
    }

    @Override
    public String getSurname() {
        return getAnyGetter().getSurname();
    }

    @Override
    public String getSurname(int id) {
        return getAnyGetter().getSurname(id);
    }

    @Override
    public String getDualSurname() {
        return getAnyGetter().getDualSurname();
    }

    @Override
    public String getDualSurname(int startId, int endId) {
        return getAnyGetter().getDualSurname(startId, endId);
    }

    @Override
    public common.NameGetter with(Randomizer r) {
        return new NameGetter(r);
    }

    public common.NameGetter getAnyGetter() {
        switch (r.getInt(2)) {
            case 0:
                return new english.NameGetter().with(r);
            case 1:
                return new spanish.NameGetter().with(r);
        }
        return new common.NameGetter().with(r);
    }
}
