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
                    word.setFeminineForm(StringHelper.removeLastChar(m.group(1)) + ending);
                    break assignation;
                }
                word.setFeminineForm(StringHelper.defaultIfBlank(m.group(5)));
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
                    break;
                case FEMININE:
                    sb.append(word.getFeminineForm());
                    break;
                case NEUTRAL:
                    sb.append(word.getCombinedForm(WordCombination.ONLY_SLASH));
                    break;
                case UNDEFINED:
                default:
                    sb.append(word.getWord());
                    break;
            }
        }
        return sb.toString();
    }

    public static String genderify(String s, Gender gender) {
        return TextProcessor.joinWords(TextProcessor.getSeveredWords(s), gender);
    }
}
