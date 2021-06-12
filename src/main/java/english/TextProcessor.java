package english;

import common.Database;
import common.StringHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor extends common.TextProcessor {
    private static final String INDEFINITE_ARTICLE_REGEX = "(\\b[Aa]/an\\b)(\\s+)(\\b\\p{L}+\\b)";
    private static final Pattern INDEFINITE_ARTICLE_PATTERN = Pattern.compile(INDEFINITE_ARTICLE_REGEX);

    public String adjustIndefiniteArticles(String s) {
        if (StringHelper.isNotNullOrBlank(s)) {
            Matcher matcher = INDEFINITE_ARTICLE_PATTERN.matcher(s);
            StringBuffer sb = new StringBuffer();

            while (matcher.find()) {
                String word = matcher.group(3);
                String article = "a/an";
                String script = Database.selectEnglishPhoneticScript(word.toUpperCase());

                if (StringHelper.isNotNullOrBlank(script) && !script.equals(Database.DEFAULT_VALUE)) {
                    for (char c : script.toCharArray()) {
                        if (c == 'ˌ' || c == 'ˈ')
                            continue;

                        if ("æɑɒʌɛɪiɔʊuəɚɜɝ".indexOf(c) >= 0)
                            article = "an";
                        else
                            article = "a";
                        break;
                    }
                } else
                    article = IndefiniteArticle.get(word);

                if (matcher.group(1).charAt(0) == 'A')
                    article = "A";
                matcher.appendReplacement(sb, article + matcher.group(2) + matcher.group(3));
            }
            matcher.appendTail(sb);
            s = sb.toString();
        }
        return s;
    }
}
