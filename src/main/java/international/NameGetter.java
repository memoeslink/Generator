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
    public String getFemaleForename() {
        return getAnyGetter().getFemaleForename();
    }

    @Override
    public String getFemaleForename(int id) {
        return getAnyGetter().getFemaleForename(id);
    }

    @Override
    public String getMaleForename() {
        return getAnyGetter().getMaleForename();
    }

    @Override
    public String getMaleForename(int id) {
        return getAnyGetter().getMaleForename(id);
    }

    @Override
    public String getDoubleBarrelledFemaleForename() {
        return getAnyGetter().getDoubleBarrelledFemaleForename();
    }

    @Override
    public String getDoubleBarrelledFemaleForename(int startId, int endId) {
        return getAnyGetter().getDoubleBarrelledFemaleForename(startId, endId);
    }

    @Override
    public String getDoubleBarrelledMaleForename() {
        return getAnyGetter().getDoubleBarrelledMaleForename();
    }

    @Override
    public String getDoubleBarrelledMaleForename(int startId, int endId) {
        return getAnyGetter().getDoubleBarrelledMaleForename(startId, endId);
    }

    @Override
    public String getDoubleFemaleForename() {
        return getAnyGetter().getDoubleFemaleForename();
    }

    @Override
    public String getDoubleFemaleForename(int startId, int endId) {
        return getAnyGetter().getDoubleFemaleForename(startId, endId);
    }

    @Override
    public String getDoubleMaleForename() {
        return getAnyGetter().getDoubleMaleForename();
    }

    @Override
    public String getDoubleMaleForename(int startId, int endId) {
        return getAnyGetter().getDoubleMaleForename(startId, endId);
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
    public String getFemaleSimpleName() {
        return getAnyGetter().getFemaleSimpleName();
    }

    @Override
    public String getFemaleSimpleName(int forenameId, int surnameId) {
        return getAnyGetter().getFemaleSimpleName(forenameId, surnameId);
    }

    @Override
    public String getMaleSimpleName() {
        return getAnyGetter().getMaleSimpleName();
    }

    @Override
    public String getMaleSimpleName(int forenameId, int surnameId) {
        return getAnyGetter().getMaleSimpleName(forenameId, surnameId);
    }

    @Override
    public String getFemaleFullName() {
        return getAnyGetter().getFemaleFullName();
    }

    @Override
    public String getMaleFullName() {
        return getAnyGetter().getMaleFullName();
    }

    @Override
    public String getUsername() {
        return getAnyGetter().getUsername();
    }

    @Override
    public String getCompositeUsername() {
        return getAnyGetter().getCompositeUsername();
    }

    @Override
    public String getDerivedUsername() {
        return getAnyGetter().getCompositeUsername();
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
