package international;

import common.NameDefiner;
import common.*;

public final class NameGetter extends common.NameGetter implements NameDefiner, international.NameDefiner {

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
    public String getFullName() {
        switch (r.getInt(3)) {
            case 1:
                return getFemaleFullName();
            case 2:
                return getMaleFullName();
            case 0:
            default:
                return Database.selectName(r.getInt(1, Database.countNames())) + Separator.SPACE.getCharacter() +
                        Database.selectFamilyName(r.getInt(1, Database.countFamilyNames()));
        }
    }

    @Override
    public String getFemaleDefinedForename() {
        return TextProcessor.feminize(getDefinedForename(r));
    }

    @Override
    public String getFemaleDefinedForename(int type) {
        return TextProcessor.feminize(getDefinedForename(type, r));
    }

    @Override
    public String getMaleDefinedForename() {
        return getDefinedForename(r);
    }

    @Override
    public String getMaleDefinedForename(int type) {
        return getDefinedForename(type, r);
    }

    @Override
    public String getDefinedFamilyName() {
        int type = r.getInt(Constant.GENERATED_FAMILY_NAME_SUFFIX.length);
        return getDefinedFamilyName(type);
    }

    @Override
    public String getDefinedFamilyName(int type) {
        type = IntegerHelper.defaultIndex(Constant.GENERATED_FAMILY_NAME_SUFFIX.length, type);
        return StringHelper.capitalizeFirst(ResourceGetter.with(r).getString(Constant.GENERATED_NAME_START[type]) +
                ResourceGetter.with(r).getString(Constant.GENERATED_NAME_MIDDLE[type]) +
                ResourceGetter.with(r).getString(Constant.GENERATED_FAMILY_NAME_SUFFIX[type]));
    }

    @Override
    public String getFemaleDefinedFullName() {
        int type = r.getInt(Constant.GENERATED_FAMILY_NAME_SUFFIX.length);
        return getFemaleDefinedForename(type) + Separator.SPACE.getCharacter() + getDefinedFamilyName(type);
    }

    @Override
    public String getMaleDefinedFullName() {
        int type = r.getInt(Constant.GENERATED_FAMILY_NAME_SUFFIX.length);
        return getMaleDefinedForename(type) + Separator.SPACE.getCharacter() + getDefinedFamilyName(type);
    }

    @Override
    public String getDefinedFullName() {
        switch (r.getInt(2)) {
            case 0:
                return getFemaleDefinedFullName();
            case 1:
                return getMaleDefinedFullName();
            default:
                return Database.DEFAULT_VALUE;
        }
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
        return getAnyGetter().getDerivedUsername();
    }

    @Override
    public String getAnonymousName() {
        return getAnyGetter().getAnonymousName();
    }

    @Override
    public String getAnonymousAnimal() {
        return getAnyGetter().getAnonymousAnimal();
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
