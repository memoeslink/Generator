package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Database {
    public static final int DEFAULT_INDEX = -1;
    public static final String DEFAULT_VALUE = "?";
    public static final String ID_PREFIX = "ID";
    public static final String TABLE_ENGLISH_ADJECTIVES = "EnglishAdjectives";
    public static final String TABLE_ENGLISH_FEMALE_NAMES = "EnglishFemaleNames";
    public static final String TABLE_ENGLISH_MALE_NAMES = "EnglishMaleNames";
    public static final String TABLE_ENGLISH_NOUNS = "EnglishNouns";
    public static final String TABLE_ENGLISH_OCCUPATIONS = "EnglishOccupations";
    public static final String TABLE_ENGLISH_PHONETICS = "EnglishPhonetics";
    public static final String TABLE_ENGLISH_SURNAMES = "EnglishSurnames";
    public static final String TABLE_SPANISH_FEMALE_NAMES = "SpanishFemaleNames";
    public static final String TABLE_SPANISH_MALE_NAMES = "SpanishMaleNames";
    public static final String TABLE_SPANISH_NOUNS = "SpanishNouns";
    public static final String TABLE_SPANISH_OCCUPATIONS = "SpanishOccupations";
    public static final String TABLE_SPANISH_PLURAL_ADJECTIVES = "SpanishPluralAdjectives";
    public static final String TABLE_SPANISH_SINGULAR_ADJECTIVES = "SpanishSingularAdjectives";
    public static final String TABLE_SPANISH_SURNAMES = "SpanishSurnames";
    public static final String TABLE_FAMILY_NAMES = "FamilyNames";
    public static final String TABLE_NAMES = "Names";
    public static final String TABLE_NOUNS = "Nouns";
    public static final String TABLE_USERNAMES = "Usernames";
    private static HashMap<String, Integer> hashMap = new HashMap<>();
    private static Connection connection;

    static {
        connection = null;
    }

    private static int countRows(String table) {
        return countRows(table, "SELECT COUNT(*) FROM " + table);
    }

    private static int countRows(String table, String query) {
        int count = getIntValue(table);

        if (count != DEFAULT_INDEX)
            return count;
        count = Integer.parseInt(selectRow(query, 1));
        hashMap.put(table, count);
        return count;
    }

    private static int getIntValue(String key) {
        Integer value = hashMap.get(key);

        if (value != null)
            return value;
        return DEFAULT_INDEX;
    }

    private static String selectRow(String query, int column, Object... parameters) {
        if (connection == null) connection = DatabaseConnection.connect();
        PreparedStatement statement = null;
        ResultSet r = null;

        try {
            statement = connection.prepareStatement(query);

            if (parameters.length > 0) {
                int n = 1;

                for (Object parameter : parameters) {
                    if (parameter == null)
                        statement.setNull(n, 0);
                    else if (parameter instanceof Integer)
                        statement.setInt(n, (Integer) parameter);
                    else if (parameter instanceof String)
                        statement.setString(n, (String) parameter);
                    else if (parameter instanceof Boolean)
                        statement.setBoolean(n, (Boolean) parameter);
                    else
                        statement.setNull(n, 0);
                    n++;
                }
            }
            r = statement.executeQuery();
            return r.getString(column);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (r != null) r.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return DEFAULT_VALUE;
    }

    public static int countTableRows(String table) {
        return countRows(table);
    }

    public static String selectFromTable(String table, int id) {
        return selectRow("SELECT * FROM " + table + " WHERE " + table + ID_PREFIX + " = ?", 2, id);
    }

    public static int countEnglishAdjectives() {
        return countRows(TABLE_ENGLISH_ADJECTIVES);
    }

    public static String selectEnglishAdjective(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_ADJECTIVES + " WHERE " + TABLE_ENGLISH_ADJECTIVES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countEnglishFemaleNames() {
        return countRows(TABLE_ENGLISH_FEMALE_NAMES);
    }

    public static String selectEnglishFemaleName(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_FEMALE_NAMES + " WHERE " + TABLE_ENGLISH_FEMALE_NAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countEnglishMaleNames() {
        return countRows(TABLE_ENGLISH_MALE_NAMES);
    }

    public static String selectEnglishMaleName(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_MALE_NAMES + " WHERE " + TABLE_ENGLISH_MALE_NAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countEnglishNouns() {
        return countRows(TABLE_ENGLISH_NOUNS);
    }

    public static String selectEnglishNoun(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_NOUNS + " WHERE " + TABLE_ENGLISH_NOUNS + ID_PREFIX + " = ?", 2, id);
    }

    public static int countEnglishOccupations() {
        return countRows(TABLE_ENGLISH_OCCUPATIONS);
    }

    public static String selectEnglishOccupation(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_OCCUPATIONS + " WHERE " + TABLE_ENGLISH_OCCUPATIONS + ID_PREFIX + " = ?", 2, id);
    }

    public static int countEnglishPhonetics() {
        return countRows(TABLE_ENGLISH_PHONETICS);
    }

    public static String selectEnglishWord(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_PHONETICS + " WHERE " + TABLE_ENGLISH_PHONETICS + ID_PREFIX + " = ?", 2, id);
    }

    public static String selectEnglishPhoneticScript(String word) {
        return selectRow("SELECT common.Word, Phonetics FROM " + TABLE_ENGLISH_PHONETICS + " WHERE common.Word = ?", 2, word);
    }

    public static int countEnglishSurnames() {
        return countRows(TABLE_ENGLISH_SURNAMES);
    }

    public static String selectEnglishSurname(int id) {
        return selectRow("SELECT * FROM " + TABLE_ENGLISH_SURNAMES + " WHERE " + TABLE_ENGLISH_SURNAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countHispanicFemaleNames() {
        return countRows(TABLE_SPANISH_FEMALE_NAMES);
    }

    public static String selectHispanicFemaleName(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_FEMALE_NAMES + " WHERE " + TABLE_SPANISH_FEMALE_NAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countHispanicMaleNames() {
        return countRows(TABLE_SPANISH_MALE_NAMES);
    }

    public static String selectHispanicMaleName(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_MALE_NAMES + " WHERE " + TABLE_SPANISH_MALE_NAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countSpanishNouns() {
        return countRows(TABLE_SPANISH_NOUNS);
    }

    public static String selectSpanishNoun(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_NOUNS + " WHERE " + TABLE_SPANISH_NOUNS + ID_PREFIX + " = ?", 2, id);
    }

    public static int countSpanishOccupations() {
        return countRows(TABLE_SPANISH_OCCUPATIONS);
    }

    public static String selectSpanishOccupation(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_OCCUPATIONS + " WHERE " + TABLE_SPANISH_OCCUPATIONS + ID_PREFIX + " = ?", 2, id);
    }

    public static int countSpanishPluralAdjectives() {
        return countRows(TABLE_SPANISH_PLURAL_ADJECTIVES);
    }

    public static String selectSpanishPluralAdjective(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_PLURAL_ADJECTIVES + " WHERE " + TABLE_SPANISH_PLURAL_ADJECTIVES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countSpanishSingularAdjectives() {
        return countRows(TABLE_SPANISH_SINGULAR_ADJECTIVES);
    }

    public static String selectSpanishSingularAdjective(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_SINGULAR_ADJECTIVES + " WHERE " + TABLE_SPANISH_SINGULAR_ADJECTIVES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countHispanicSurnames() {
        return countRows(TABLE_SPANISH_SURNAMES);
    }

    public static String selectHispanicSurname(int id) {
        return selectRow("SELECT * FROM " + TABLE_SPANISH_SURNAMES + " WHERE " + TABLE_SPANISH_SURNAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countFamilyNames() {
        return countRows(TABLE_FAMILY_NAMES);
    }

    public static String selectFamilyName(int id) {
        return selectRow("SELECT * FROM " + TABLE_FAMILY_NAMES + " WHERE " + TABLE_FAMILY_NAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countNames() {
        return countRows(TABLE_NAMES);
    }

    public static String selectName(int id) {
        return selectRow("SELECT * FROM " + TABLE_NAMES + " WHERE " + TABLE_NAMES + ID_PREFIX + " = ?", 2, id);
    }

    public static int countCommonNouns() {
        return countRows(TABLE_NOUNS);
    }

    public static String selectCommonNoun(int id) {
        return selectRow("SELECT * FROM " + TABLE_NOUNS + " WHERE " + TABLE_NOUNS + ID_PREFIX + " = ?", 2, id);
    }

    public static int countUsernames() {
        return countRows(TABLE_USERNAMES);
    }

    public static String selectUsername(int id) {
        return selectRow("SELECT * FROM " + TABLE_USERNAMES + " WHERE " + TABLE_USERNAMES + ID_PREFIX + " = ?", 2, id);
    }
}
