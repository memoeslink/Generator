package international;

import common.NameDefiner;
import common.*;

public final class NameGetter extends common.NameGetter implements NameDefiner, international.NameDefiner {

    public NameGetter() {
        super();
    }

    public NameGetter(Randomizer r) {
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
        type = IntegerHelper.defaultIndex(type, Constant.GENERATED_FAMILY_NAME_SUFFIX.length);
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
        return r.getBoolean() ? getMaleDefinedFullName() : getFemaleDefinedFullName();
    }

    @Override
    public String getFemaleIterativeForename() {
        return TextProcessor.feminize(getIterativeName(r.getInt(1, 5), r));
    }

    @Override
    public String getMaleIterativeForename() {
        return getIterativeName(r.getInt(1, 5), r);
    }

    @Override
    public String getIterativeFamilyName() {
        return getIterativeName(r.getInt(1, 3), r);
    }

    @Override
    public String getFemaleIterativeFullName() {
        return getFemaleIterativeForename() + Separator.SPACE.getCharacter() + getIterativeFamilyName();
    }

    @Override
    public String getMaleIterativeFullName() {
        return getMaleIterativeForename() + Separator.SPACE.getCharacter() + getIterativeFamilyName();
    }

    @Override
    public String getIterativeFullName() {
        return r.getBoolean() ? getMaleIterativeFullName() : getFemaleIterativeFullName();
    }

    @Override
    public String getFemalePatternForename() {
        return TextProcessor.feminize(getPatternName(r), "ia");
    }

    @Override
    public String getMalePatternForename() {
        return getPatternName(r);
    }

    @Override
    public String getPatternFamilyName() {
        return StringHelper.weld(getPatternName(r), ResourceGetter.with(r).getString(Constant.FAMILY_NAME_SUFFIX));
    }

    @Override
    public String getFemalePatternFullName() {
        return getFemalePatternForename() + Separator.SPACE.getCharacter() + getPatternFamilyName();
    }

    @Override
    public String getMalePatternFullName() {
        return getMalePatternForename() + Separator.SPACE.getCharacter() + getPatternFamilyName();
    }

    @Override
    public String getPatternFullName() {
        return r.getBoolean() ? getMalePatternFullName() : getFemalePatternFullName();
    }

    @Override
    public String getFemaleFrequencyForename() {
        return TextProcessor.feminize(getMaleFrequencyForename());
    }

    @Override
    public String getFemaleFrequencyForename(int type) {
        return TextProcessor.feminize(getMaleFrequencyForename(type));
    }

    @Override
    public String getMaleFrequencyForename() {
        int type = r.getInt(Constant.WEIGHTED_LETTERS.length);
        return getMaleFrequencyForename(type);
    }

    @Override
    public String getMaleFrequencyForename(int type) {
        return getFrequencyName(Constant.WEIGHTED_LETTERS[type], r.getInt(3, 8), r);
    }

    @Override
    public String getFrequencyFamilyName() {
        int type = r.getInt(Constant.WEIGHTED_LETTERS.length);
        return getFrequencyFamilyName(type);
    }

    @Override
    public String getFrequencyFamilyName(int type) {
        return getFrequencyName(Constant.WEIGHTED_LETTERS[type], r.getInt(2, 11), r);
    }

    @Override
    public String getFemaleFrequencyFullName() {
        int type = r.getInt(Constant.WEIGHTED_LETTERS.length);
        return getFemaleFrequencyForename(type) + Separator.SPACE.getCharacter() + getFrequencyFamilyName(type);
    }

    @Override
    public String getMaleFrequencyFullName() {
        int type = r.getInt(Constant.WEIGHTED_LETTERS.length);
        return getMaleFrequencyForename(type) + Separator.SPACE.getCharacter() + getFrequencyFamilyName(type);
    }

    @Override
    public String getFrequencyFullName() {
        return r.getBoolean() ? getMaleFrequencyFullName() : getFemaleFrequencyFullName();
    }

    @Override
    public String getFemalePredefinedForename() {
        return null;
    }

    @Override
    public String getFemalePredefinedForename(Shaper shaper) {
        return null;
    }

    @Override
    public String getMalePredefinedForename() {
        Shaper shaper = Shaper.values()[r.getInt(Shaper.values().length)];
        return getMalePredefinedForename(shaper);
    }

    @Override
    public String getMalePredefinedForename(Shaper shaper) {
        shaper = shaper != null ? shaper : Shaper.SPANISH;
        return getPredefinedName(shaper.getShape(), r.getInt(3, 8), r);
    }

    @Override
    public String getPredefinedFamilyName() {
        return null;
    }

    @Override
    public String getPredefinedFamilyName(Shaper shaper) {
        return null;
    }

    @Override
    public String getFemalePredefinedFullName() {
        return null;
    }

    @Override
    public String getMalePredefinedFullName() {
        return null;
    }

    @Override
    public String getPredefinedFullName() {
        return null;
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

    public common.NameGetter getAnyGetter() {
        switch (r.getInt(2)) {
            case 0:
                return new english.NameGetter(r);
            case 1:
                return new spanish.NameGetter(r);
        }
        return new common.NameGetter(r);
    }
}
