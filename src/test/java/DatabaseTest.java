import common.Database;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DatabaseTest {

    @Test
    void countTableRows() {
        int count = Database.countTableRows(Database.TABLE_NAMES);
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectFromTable() {
        String value = Database.selectFromTable(Database.TABLE_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aaren", value);
    }

    @Test
    void countEnglishAdjectives() {
        int count = Database.countEnglishAdjectives();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishAdjective() {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_ADJECTIVES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("able", value);
    }

    @Test
    void countEnglishFemaleNames() {
        int count = Database.countEnglishFemaleNames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishFemaleName() {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_FEMALE_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aaron", value);
    }

    @Test
    void countEnglishMaleNames() {
        int count = Database.countEnglishMaleNames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishMaleName() {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_MALE_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aaron", value);
    }

    @Test
    void countEnglishNouns() {
        int count = Database.countEnglishNouns();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishNoun() {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_NOUNS, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("people", value);
    }

    @Test
    void countEnglishOccupations() {
        int count = Database.countEnglishOccupations();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishOccupation() {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_OCCUPATIONS, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Lawyer", value);
    }

    @Test
    void countEnglishPhonetics() {
        int count = Database.countEnglishPhonetics();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishWord() {
        String value = Database.selectEnglishWord(1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("!EXCLAMATION-POINT", value);
    }

    @Test
    void selectEnglishPhoneticScript() {
        String value = Database.selectEnglishPhoneticScript("!EXCLAMATION-POINT");
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("ˌɛkskləˈmeɪʃənˌpɔɪnt", value);
    }

    @Test
    void countEnglishSurnames() {
        int count = Database.countEnglishSurnames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectEnglishSurname() {
        String value = Database.selectFromTable(Database.TABLE_ENGLISH_SURNAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aaron", value);
    }

    @Test
    void countHispanicFemaleNames() {
        int count = Database.countHispanicFemaleNames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectHispanicFemaleName() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_FEMALE_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Abby", value);
    }

    @Test
    void countHispanicMaleNames() {
        int count = Database.countHispanicMaleNames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectHispanicMaleName() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_MALE_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aarón", value);
    }

    @Test
    void countSpanishNouns() {
        int count = Database.countSpanishNouns();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectSpanishNoun() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_NOUNS, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("el pueblo", value);
    }

    @Test
    void countSpanishOccupations() {
        int count = Database.countSpanishOccupations();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectSpanishOccupation() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_OCCUPATIONS, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Abogado[a]", value);
    }

    @Test
    void countSpanishPluralAdjectives() {
        int count = Database.countSpanishPluralAdjectives();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectSpanishPluralAdjective() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_PLURAL_ADJECTIVES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("abaciales AQ0CP0", value);
    }

    @Test
    void countSpanishSingularAdjectives() {
        int count = Database.countSpanishSingularAdjectives();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectSpanishSingularAdjective() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_SINGULAR_ADJECTIVES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("abacial AQ0CS0", value);
    }

    @Test
    void countHispanicSurnames() {
        int count = Database.countHispanicSurnames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectHispanicSurname() {
        String value = Database.selectFromTable(Database.TABLE_SPANISH_SURNAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aanda", value);
    }

    @Test
    void countFamilyNames() {
        int count = Database.countFamilyNames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectFamilyName() {
        String value = Database.selectFromTable(Database.TABLE_FAMILY_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aaberg", value);
    }

    @Test
    void countNames() {
        int count = Database.countNames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectName() {
        String value = Database.selectFromTable(Database.TABLE_NAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("Aaren", value);
    }

    @Test
    void countCommonNouns() {
        int count = Database.countCommonNouns();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectCommonNoun() {
        String value = Database.selectFromTable(Database.TABLE_NOUNS, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("aardvark", value);
    }

    @Test
    void countUsernames() {
        int count = Database.countUsernames();
        assertNotEquals(Database.DEFAULT_INDEX, count);
    }

    @Test
    void selectUsername() {
        String value = Database.selectFromTable(Database.TABLE_USERNAMES, 1);
        assertNotEquals(Database.DEFAULT_VALUE, value);
        assertEquals("!@#webmaster", value);
    }
}