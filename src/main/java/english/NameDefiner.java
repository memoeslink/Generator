package english;

import com.memoeslink.common.Randomizer;
import common.ResourceGetter;

public interface NameDefiner extends base.NameDefiner {

    public String getFemaleMiddleName();

    public String getFemaleMiddleName(int id);

    public String getMaleMiddleName();

    public String getMaleMiddleName(int id);

    public String getMiddleNameInitial();

    public String getDoubleBarrelledSurname();

    public String getDoubleBarrelledSurname(int startId, int endId);

    default String getGenerationalSuffix(Randomizer r) {
        r = r != null ? r : new Randomizer();
        return r.getBoolean() ? ResourceGetter.with(r).getString(common.Constant.ROMAN_NUMERALS) :
                ResourceGetter.with(r).getString(english.Constant.GENERATIONAL_SUFFIX);
    }

    public String getFemaleName();

    public String getMaleName();
}
