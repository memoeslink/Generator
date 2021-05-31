package common;

public interface NameDefiner {

    public String getEmptyName();

    public String getDefaultName();

    public String getTestName();

    public String getFemaleForename();

    public String getFemaleForename(int id);

    public String getMaleForename();

    public String getMaleForename(int id);

    public String getDoubleBarrelledFemaleForename();

    public String getDoubleBarrelledFemaleForename(int startId, int endId);

    public String getDoubleBarrelledMaleForename();

    public String getDoubleBarrelledMaleForename(int startId, int endId);

    public String getDoubleFemaleForename();

    public String getDoubleFemaleForename(int startId, int endId);

    public String getDoubleMaleForename();

    public String getDoubleMaleForename(int startId, int endId);

    public String getSurname();

    public String getSurname(int id);

    public String getDualSurname();

    public String getDualSurname(int startId, int endId);

    public String getFemaleSimpleName();

    public String getFemaleSimpleName(int forenameId, int surnameId);

    public String getMaleSimpleName();

    public String getMaleSimpleName(int forenameId, int surnameId);

    public String getFemaleFullName();

    public String getMaleFullName();

    public String getUsername();

    public String getCompositeUsername();

    default String getCompositeUsername(String a, String b, Randomizer r) {
        String username = (a + Separator.SPACE.getCharacter() + b).trim();
        username = StringHelper.normalize(username);
        r = r != null ? r : new Randomizer();
        int index = -1;

        //Separate words with characters or using camel case
        if (StringHelper.isNullOrBlank(username)) {
        } else if (r.getBoolean()) {
            username = StringHelper.capitalize(username);
            username = StringHelper.remove(username, String.valueOf(Separator.SPACE.getCharacter()));
        } else {
            index = r.getInt(Separator.values().length - 2);
            username = username.replace(String.valueOf(Separator.SPACE.getCharacter()), String.valueOf(Separator.values()[index].getCharacter()));
        }

        //Append number, if required
        if (StringHelper.isNullOrBlank(username)) {
        } else if (r.getBoolean()) {
            username = username + (index >= 0 ? Separator.values()[index].getCharacter() : StringHelper.EMPTY);
            float probability = r.getFloat();

            if (probability <= 0.45F) {
                int number = r.getInt(0, 1000);
                username = username + (r.getBoolean() ? String.format("%03d", number) : number);
            } else if (probability <= 0.9F) {
                int year = 2000;
                int difference = r.getInt(0, 201);

                if (difference < 0)
                    year = year - difference;
                else
                    year = year + difference;

                if (year < 1)
                    year = 2000;
                username = username + year;
            } else {
                String[] numbers = {"0", "002", "007", "2", "69", "69", "69", "666", "777", "420", "420", "420", "911", "999"};
                username += numbers[r.getInt(0, numbers.length)];
            }
        }
        return username;
    }

    public NameGetter with(Randomizer r);
}
