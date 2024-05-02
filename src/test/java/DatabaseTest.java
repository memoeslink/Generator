import common.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void countTableRows() throws Exception {
        int count = Database.countTableRows(Database.TABLE_NAMES);
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectFromTable() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aaren", value);
    }

    @Test
    public void countEnglishAdjectives() throws Exception {
        int count = Database.countEnglishAdjectives();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishAdjective() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_ADJECTIVES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("able", value);
    }

    @Test
    public void countEnglishFemaleNames() throws Exception {
        int count = Database.countEnglishFemaleNames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishFemaleName() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_FEMALE_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aaron", value);
    }

    @Test
    public void countEnglishMaleNames() throws Exception {
        int count = Database.countEnglishMaleNames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishMaleName() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_MALE_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aaron", value);
    }

    @Test
    public void countEnglishNouns() throws Exception {
        int count = Database.countEnglishNouns();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishNoun() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_NOUNS, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("people", value);
    }

    @Test
    public void countEnglishOccupations() throws Exception {
        int count = Database.countEnglishOccupations();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishOccupation() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_OCCUPATIONS, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Lawyer", value);
    }

    @Test
    public void countEnglishPhonetics() throws Exception {
        int count = Database.countEnglishPhonetics();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishWord() throws Exception {
        String value = Database.selectEnglishWord(1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("!EXCLAMATION-POINT", value);
    }

    @Test
    public void selectEnglishPhoneticScript() throws Exception {
        String value = Database.selectEnglishPhoneticScript("!EXCLAMATION-POINT");
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("ˌɛkskləˈmeɪʃənˌpɔɪnt", value);
    }

    @Test
    public void countEnglishSurnames() throws Exception {
        int count = Database.countEnglishSurnames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectEnglishSurname() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_SURNAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aaron", value);
    }

    @Test
    public void countHispanicFemaleNames() throws Exception {
        int count = Database.countHispanicFemaleNames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectHispanicFemaleName() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_FEMALE_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Abby", value);
    }

    @Test
    public void countHispanicMaleNames() throws Exception {
        int count = Database.countHispanicMaleNames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectHispanicMaleName() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_MALE_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aarón", value);
    }

    @Test
    public void countSpanishNouns() throws Exception {
        int count = Database.countSpanishNouns();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectSpanishNoun() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_NOUNS, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("el pueblo", value);
    }

    @Test
    public void countSpanishOccupations() throws Exception {
        int count = Database.countSpanishOccupations();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectSpanishOccupation() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_OCCUPATIONS, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Abogado[a]", value);
    }

    @Test
    public void countSpanishPluralAdjectives() throws Exception {
        int count = Database.countSpanishPluralAdjectives();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectSpanishPluralAdjective() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_PLURAL_ADJECTIVES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("abaciales AQ0CP0", value);
    }

    @Test
    public void countSpanishSingularAdjectives() throws Exception {
        int count = Database.countSpanishSingularAdjectives();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectSpanishSingularAdjective() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_SINGULAR_ADJECTIVES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("abacial AQ0CS0", value);
    }

    @Test
    public void countHispanicSurnames() throws Exception {
        int count = Database.countHispanicSurnames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectHispanicSurname() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_SURNAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aanda", value);
    }

    @Test
    public void countFamilyNames() throws Exception {
        int count = Database.countFamilyNames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectFamilyName() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_FAMILY_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aaberg", value);
    }

    @Test
    public void countNames() throws Exception {
        int count = Database.countNames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectName() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_NAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("Aaren", value);
    }

    @Test
    public void countCommonNouns() throws Exception {
        int count = Database.countCommonNouns();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectCommonNoun() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_NOUNS, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("aardvark", value);
    }

    @Test
    public void countUsernames() throws Exception {
        int count = Database.countUsernames();
        Assertions.assertNotEquals(-1, count);
    }

    @Test
    public void selectUsername() throws Exception {
        String value = Database.selectFromTable(Database.TABLE_USERNAMES, 1);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
        Assertions.assertEquals("!@#webmaster", value);
    }
}