import common.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void countTableRows_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countTableRows("sqlite_sequence"));
    }

    @Test
    public void countTableRows_returnsNegativeForNonexistentTable() {
        Assertions.assertEquals(-1, Database.countTableRows("NonexistentTable"));
    }

    @Test
    public void countTableRows_returnsNegativeForNullTable() {
        Assertions.assertEquals(-1, Database.countTableRows(null));
    }

    @Test
    public void countTableRows_returnsNegativeForEmptyTable() {
        Assertions.assertEquals(-1, Database.countTableRows(""));
    }

    @Test
    public void selectFromTable_returnsRecordForValidTable() {
        Assertions.assertNotNull(Database.selectFromTable("sqlite_sequence"));
    }

    @Test
    public void selectFromTable_returnsDefaultForNonexistentTable() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable("NonexistentTable"));
    }

    @Test
    public void selectFromTable_returnsDefaultForNullTable() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable(null));
    }

    @Test
    public void selectFromTable_returnsDefaultForEmptyTable() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable(""));
    }

    @Test
    public void selectFromTableWithId_returnsRecordForValidId() {
        Assertions.assertNotNull(Database.selectFromTable("sqlite_sequence", 1));
    }

    @Test
    public void selectFromTableWithId_returnsDefaultForInvalidId() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable("sqlite_sequence", -1));
    }

    @Test
    public void selectFromTableWithId_returnsDefaultForNonexistentTable() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable("NonexistentTable", 1));
    }

    @Test
    public void selectFromTableWithId_returnsDefaultForNullTable() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable(null, 1));
    }

    @Test
    public void selectFromTableWithId_returnsDefaultForEmptyTable() {
        Assertions.assertEquals(Database.DEFAULT_VALUE, Database.selectFromTable("", 1));
    }

    @Test
    public void countEnglishAdjectives_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishAdjectives());
    }

    @Test
    public void selectEnglishAdjective_returnsValidAdjective() {
        String value = Database.selectEnglishAdjective();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishAdjectiveWithId_returnsValidAdjective() {
        String value = Database.selectEnglishAdjective(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishFemaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishFemaleNames());
    }

    @Test
    public void selectEnglishFemaleName_returnsValidName() {
        String value = Database.selectEnglishFemaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishFemaleNameWithId_returnsValidName() {
        String value = Database.selectEnglishFemaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishMaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishMaleNames());
    }

    @Test
    public void selectEnglishMaleName_returnsValidName() {
        String value = Database.selectEnglishMaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishMaleNameWithId_returnsValidName() {
        String value = Database.selectEnglishMaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishNouns_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishNouns());
    }

    @Test
    public void selectEnglishNoun_returnsValidNoun() {
        String value = Database.selectEnglishNoun();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishNounWithId_returnsValidNoun() {
        String value = Database.selectEnglishNoun(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishOccupations_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishOccupations());
    }

    @Test
    public void selectEnglishOccupation_returnsValidOccupation() {
        String value = Database.selectEnglishOccupation();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishOccupationWithId_returnsValidOccupation() {
        String value = Database.selectEnglishOccupation(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishPhonetics_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishPhonetics());
    }

    @Test
    public void selectEnglishPhoneticWord_returnsValidWord() {
        String value = Database.selectEnglishPhoneticWord();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishPhoneticWordWithId_returnsValidWord() {
        String value = Database.selectEnglishPhoneticWord(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishPhoneticScript_returnsValidScript() {
        String value = Database.selectEnglishPhoneticScript();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishPhoneticScriptWithWord_returnsValidScript() {
        String value = Database.selectEnglishPhoneticScript("WORD");
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishSurnames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishSurnames());
    }

    @Test
    public void selectEnglishSurname_returnsValidSurname() {
        String value = Database.selectEnglishSurname();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishSurnameWithId_returnsValidSurname() {
        String value = Database.selectEnglishSurname(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEnglishWords_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEnglishWords());
    }

    @Test
    public void selectEnglishWord_returnsValidWord() {
        String value = Database.selectEnglishWord();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEnglishWordWithId_returnsValidWord() {
        String value = Database.selectEnglishWord(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectCodePoints_returnsValidCodePoints() {
        String value = Database.selectCodePoints();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectCodePointsWithId_returnsValidCodePoints() {
        String value = Database.selectCodePoints(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countFrenchFemaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countFrenchFemaleNames());
    }

    @Test
    public void selectFrenchFemaleName_returnsValidName() {
        String value = Database.selectFrenchFemaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectFrenchFemaleNameWithId_returnsValidName() {
        String value = Database.selectFrenchFemaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countFrenchMaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countFrenchMaleNames());
    }

    @Test
    public void selectFrenchMaleName_returnsValidName() {
        String value = Database.selectFrenchMaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectFrenchMaleNameWithId_returnsValidName() {
        String value = Database.selectFrenchMaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countFrenchWords_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countFrenchWords());
    }

    @Test
    public void selectFrenchWord_returnsValidWord() {
        String value = Database.selectFrenchWord();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectFrenchWordWithId_returnsValidWord() {
        String value = Database.selectFrenchWord(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countGermanWords_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countGermanWords());
    }

    @Test
    public void selectGermanWord_returnsValidWord() {
        String value = Database.selectGermanWord();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectGermanWordWithId_returnsValidWord() {
        String value = Database.selectGermanWord(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countRussianFemaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countRussianFemaleNames());
    }

    @Test
    public void selectRussianFemaleName_returnsValidName() {
        String value = Database.selectRussianFemaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectRussianFemaleNameWithId_returnsValidName() {
        String value = Database.selectRussianFemaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countRussianMaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countRussianMaleNames());
    }

    @Test
    public void selectRussianMaleName_returnsValidName() {
        String value = Database.selectRussianMaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectRussianMaleNameWithId_returnsValidName() {
        String value = Database.selectRussianMaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countHispanicCompoundSurnames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countHispanicCompoundSurnames());
    }

    @Test
    public void selectHispanicCompoundSurname_returnsValidSurname() {
        String value = Database.selectHispanicCompoundSurname();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectHispanicCompoundSurnameWithId_returnsValidSurname() {
        String value = Database.selectHispanicCompoundSurname(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countHispanicFemaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countHispanicFemaleNames());
    }

    @Test
    public void selectHispanicFemaleName_returnsValidName() {
        String value = Database.selectHispanicFemaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectHispanicFemaleNameWithId_returnsValidName() {
        String value = Database.selectHispanicFemaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countHispanicMaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countHispanicMaleNames());
    }

    @Test
    public void selectHispanicMaleName_returnsValidName() {
        String value = Database.selectHispanicMaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectHispanicMaleNameWithId_returnsValidName() {
        String value = Database.selectHispanicMaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countSpanishNouns_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countSpanishNouns());
    }

    @Test
    public void selectSpanishNoun_returnsValidNoun() {
        String value = Database.selectSpanishNoun();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectSpanishNounWithId_returnsValidNoun() {
        String value = Database.selectSpanishNoun(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countSpanishOccupations_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countSpanishOccupations());
    }

    @Test
    public void selectSpanishOccupation_returnsValidOccupation() {
        String value = Database.selectSpanishOccupation();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectSpanishOccupationWithId_returnsValidOccupation() {
        String value = Database.selectSpanishOccupation(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countSpanishPluralAdjectives_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countSpanishPluralAdjectives());
    }

    @Test
    public void selectSpanishPluralAdjective_returnsValidAdjective() {
        String value = Database.selectSpanishPluralAdjective();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectSpanishPluralAdjectiveWithId_returnsValidAdjective() {
        String value = Database.selectSpanishPluralAdjective(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countSpanishSingularAdjectives_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countSpanishSingularAdjectives());
    }

    @Test
    public void selectSpanishSingularAdjective_returnsValidAdjective() {
        String value = Database.selectSpanishSingularAdjective();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectSpanishSingularAdjectiveWithId_returnsValidAdjective() {
        String value = Database.selectSpanishSingularAdjective(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countHispanicSurnames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countHispanicSurnames());
    }

    @Test
    public void selectHispanicSurname_returnsValidSurname() {
        String value = Database.selectHispanicSurname();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectHispanicSurnameWithId_returnsValidSurname() {
        String value = Database.selectHispanicSurname(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countSpanishWords_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countSpanishWords());
    }

    @Test
    public void selectSpanishWord_returnsValidWord() {
        String value = Database.selectSpanishWord();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectSpanishWordWithId_returnsValidWord() {
        String value = Database.selectSpanishWord(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countEmojis_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countEmojis());
    }

    @Test
    public void selectEmoji_returnsValidEmoji() {
        String value = Database.selectEmoji();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectEmojiWithId_returnsValidEmoji() {
        String value = Database.selectEmoji(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countFamilyNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countFamilyNames());
    }

    @Test
    public void selectFamilyName_returnsValidName() {
        String value = Database.selectFamilyName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectFamilyNameWithId_returnsValidName() {
        String value = Database.selectFamilyName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countFemaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countFemaleNames());
    }

    @Test
    public void selectFemaleName_returnsValidName() {
        String value = Database.selectFemaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectFemaleNameWithId_returnsValidName() {
        String value = Database.selectFemaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countForenames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countForenames());
    }

    @Test
    public void selectForename_returnsValidForename() {
        String value = Database.selectForename();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectForenameWithId_returnsValidForename() {
        String value = Database.selectForename(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countMaleNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countMaleNames());
    }

    @Test
    public void selectMaleName_returnsValidName() {
        String value = Database.selectMaleName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectMaleNameWithId_returnsValidName() {
        String value = Database.selectMaleName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countNames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countNames());
    }

    @Test
    public void selectName_returnsValidName() {
        String value = Database.selectName();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectNameWithId_returnsValidName() {
        String value = Database.selectName(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countCommonNouns_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countCommonNouns());
    }

    @Test
    public void selectCommonNoun_returnsValidNoun() {
        String value = Database.selectCommonNoun();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectCommonNounWithId_returnsValidNoun() {
        String value = Database.selectCommonNoun(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countSurnames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countSurnames());
    }

    @Test
    public void selectSurname_returnsValidSurname() {
        String value = Database.selectSurname();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectSurnameWithId_returnsValidSurname() {
        String value = Database.selectSurname(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void countUsernames_returnsCorrectCount() {
        Assertions.assertNotEquals(-1, Database.countUsernames());
    }

    @Test
    public void selectUsername_returnsValidUsername() {
        String value = Database.selectUsername();
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }

    @Test
    public void selectUsernameWithId_returnsValidUsername() {
        String value = Database.selectUsername(1);
        Assertions.assertNotNull(value);
        Assertions.assertNotEquals(Database.DEFAULT_VALUE, value);
    }
}
