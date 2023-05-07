package spanish;

import common.Database;
import common.Gender;
import common.Separator;
import common.StringHelper;

public interface NameDefiner extends common.NameDefiner {

    default String getForename(Gender gender) {
        gender = gender != null ? gender : Gender.UNDEFINED;

        return switch (gender) {
            case MASCULINE -> getMaleForename();
            case FEMININE -> getFemaleForename();
            default -> Database.DEFAULT_VALUE;
        };
    }

    public String getForenames(Gender gender);

    public String getFemaleForenames();

    public String getMaleForenames();

    public String getDoubleSurname();

    public String getDoubleSurname(int startId, int endId);

    public String getCompoundSurname();

    public String getCompoundSurname(int id);

    default String getSurnameFromName() {
        String surname;

        do {
            surname = getGivenName();
        } while (StringHelper.isNullOrBlank(surname) || surname.equals(Database.DEFAULT_VALUE)
                || StringHelper.containsSpace(surname) || StringHelper.startsWithAny(surname, "de ", "del "));
        return "de" + Separator.SPACE.getCharacter() + surname;
    }

    public String getSurnames();
}
