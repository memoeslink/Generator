package common;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private static final String WORD_REGEX = "\\p{L}+";
    private static final String COMBINED_WORDS_REGEX = "(\\p{L}+)(\\[(\\p{L})\\]|\\((\\p{L})\\)|[\\|\\/\\-](\\p{L}+))?";
    private static final Pattern COMBINED_WORDS_PATTERN = Pattern.compile(COMBINED_WORDS_REGEX);

    public static Word getFirstSeveredWord(String s) {
        List<Word> words = severWords(s, 1);
        return words.size() == 1 ? words.get(0) : new Word();
    }

    public static List<Word> getSeveredWords(String s) {
        return severWords(s, Integer.MAX_VALUE);
    }

    private static List<Word> severWords(String s, int amount) {
        s = StringHelper.defaultIfBlank(s);
        List<Word> words = new ArrayList<>();
        Matcher m = COMBINED_WORDS_PATTERN.matcher(s);
        int n = 1;

        while (m.find()) {
            Word word = new Word();
            word.setWord(m.group(1));
            word.setMasculineForm(m.group(1));

            assignation:
            {
                if (m.group(2) == null) {
                    word.setNeutralForm(m.group(1));
                    break assignation;
                }
                String ending = StringHelper.defaultIfNull(m.group(3), StringHelper.defaultIfNull(m.group(4)));

                if (!ending.isEmpty()) {
                    word.setFeminineForm(feminize(m.group(1), ending));
                    break assignation;
                }
                word.setFeminineForm(m.group(5));
            }
            word.setGender(Gender.NEUTRAL);
            words.add(word);

            if (n >= amount)
                break;
            n++;
        }
        return words;
    }

    public static String joinWords(List<Word> words, Gender gender) {
        if (words == null || words.size() == 0)
            return StringHelper.EMPTY;
        StringBuilder sb = new StringBuilder();
        gender = gender != null ? gender : Gender.UNDEFINED;

        for (Word word : words) {
            if (sb.length() > 0)
                sb.append(Separator.SPACE.getCharacter());

            switch (gender) {
                case MASCULINE:
                    sb.append(word.getMasculineForm());
                case FEMININE:
                    sb.append(word.getFeminineForm());
                case NEUTRAL:
                    sb.append(word.getNeutralForm());
                case UNDEFINED:
                default:
                    sb.append(word.getWord());
            }
        }
        return sb.toString();
    }

    public static String feminize(String s) {
        return feminize(s, "a");
    }

    public static String feminize(String s, String ending) {
        if (StringHelper.isNotOnlyLetters(s) || StringHelper.isNotOnlyLetters(ending))
            return s;

        if (StringHelper.endsWith(s, ending))
            return s;

        if (StringHelper.endsWithAny(s, english.Constant.VOWELS.toCharArray()))
            return StringHelper.join(StringHelper.removeLastChar(s), ending);
        return StringHelper.join(s, ending);
    }

    public static String feminizeOnVowelEnd(String s) {
        return feminizeOnVowelEnd(s, "a");
    }

    public static String feminizeOnVowelEnd(String s, String ending) {
        if (StringHelper.isNotOnlyLetters(s) || StringHelper.isNotOnlyLetters(ending))
            return s;

        if (StringHelper.endsWith(s, ending))
            return s;

        if (StringHelper.endsWithAny(s, english.Constant.VOWELS.toCharArray()))
            return StringHelper.join(StringHelper.removeLastChar(s), ending);
        return s;
    }

    public static String feminizeWithDefaultWhen(String s, String... occurrences) {
        return feminizeWhen(s, "a", occurrences);
    }

    public static String feminizeWhen(String s, String ending, String... occurrences) {
        if (StringHelper.isNotOnlyLetters(s) || StringHelper.isNotOnlyLetters(ending))
            return s;

        if (StringHelper.endsWith(s, ending))
            return s;

        for (String occurrence : occurrences) {
            if (StringHelper.endsWith(s, occurrence))
                return StringHelper.removeEnd(s, occurrence) + ending;
        }
        return s;
    }

    public static String genderify(String s, Gender gender) {
        return genderify(s, gender, WordCombination.ONLY_SLASH);
    }

    public static String genderify(String s, Gender gender, WordCombination combination) {
        if (StringHelper.isNullOrBlank(s))
            return s;
        StringBuilder sb = new StringBuilder();
        gender = gender != null ? gender : Gender.UNDEFINED;
        combination = combination != null ? combination : WordCombination.SLASH_AND_SQUARE_BRACKETS;
        Matcher m = COMBINED_WORDS_PATTERN.matcher(s);

        while (m.find()) {
            switch (gender) {
                case MASCULINE:
                    m.appendReplacement(sb, m.group(1));
                    break;
                case FEMININE:
                    String ending = StringHelper.defaultIfNull(m.group(3), StringHelper.defaultIfNull(m.group(4)));

                    if (!ending.isEmpty())
                        m.appendReplacement(sb, feminize(m.group(1), ending));
                    else
                        m.appendReplacement(sb, m.group(5));
                    break;
                case NEUTRAL:
                    m.appendReplacement(sb, getFirstSeveredWord(m.group(0)).getNeutralForm());
                    break;
                case UNDEFINED:
                default:
                    if (combination == WordCombination.SLASH_AND_SQUARE_BRACKETS)
                        m.appendReplacement(sb, m.group(0));
                    else
                        m.appendReplacement(sb, getFirstSeveredWord(m.group(0)).getCombinedForm(combination));
                    break;
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
