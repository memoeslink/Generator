package english;

import common.Database;
import common.Randomizer;
import common.ResourceGetter;

public interface NameDefiner extends common.NameDefiner {

    public String getFemaleMiddleName();

    public String getFemaleMiddleName(int id);

    public String getMaleMiddleName();

    public String getMaleMiddleName(int id);

    public String getMiddleNameInitial();

    public String getDoubleBarrelledSurname();

    public String getDoubleBarrelledSurname(int startId, int endId);

    default String getGenerationalSuffix(Randomizer r) {
        switch (r.getInt(2)) {
            case 0:
                return ResourceGetter.with(r).getString(common.Constant.ROMAN_NUMERALS);
            case 1:
                return ResourceGetter.with(r).getString(english.Constant.GENERATIONAL_SUFFIX);
            default:
                return Database.DEFAULT_VALUE;
        }
    }

    public String getFemaleName();

    public String getMaleName();
}
