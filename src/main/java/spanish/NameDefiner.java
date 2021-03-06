package spanish;

import common.Database;
import common.Gender;

public interface NameDefiner extends common.NameDefiner {

    default String getForename(Gender gender) {
        gender = gender != null ? gender : Gender.UNDEFINED;

        switch (gender) {
            case MASCULINE:
                return getMaleForename();
            case FEMININE:
                return getFemaleForename();
            default:
                return Database.DEFAULT_VALUE;
        }
    }

    public String getForenames(Gender gender);

    public String getFemaleForenames();

    public String getMaleForenames();

    public String getDoubleSurname();

    public String getDoubleSurname(int startId, int endId);

    public String getCompoundSurname();

    public String getCompoundSurname(int id);

    public String getSurnames();
}
