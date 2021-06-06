package common;

import java.text.Normalizer;

public class StringHelper {
    public static final String EMPTY = "";

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static boolean isNullOrEmpty(String[] strings) {
        return strings == null || strings.length == 0;
    }

    public static boolean isNotNullOrEmpty(String s) {
        return !isNullOrEmpty(s);
    }

    public static boolean isNotNullOrEmpty(String[] strings) {
        return !isNullOrEmpty(strings);
    }

    public static boolean isNullOrBlank(String s) {
        return s == null || s.isBlank();
    }

    public static boolean isNotNullOrBlank(String s) {
        return !isNullOrBlank(s);
    }

    public static String defaultIfNull(String s) {
        return s == null ? EMPTY : s;
    }

    public static String defaultIfNull(String s, String defaultValue) {
        if (s == null)
            return defaultValue == null ? EMPTY : defaultValue;
        return s;
    }

    public static String defaultIfEmpty(String s) {
        return defaultIfEmpty(s, EMPTY);
    }

    public static String defaultIfEmpty(String s, String defaultValue) {
        if (s == null || s.isEmpty())
            return defaultValue == null ? EMPTY : defaultValue;
        return s;
    }

    public static String defaultIfBlank(String s) {
        return defaultIfBlank(s, EMPTY);
    }

    public static String defaultIfBlank(String s, String defaultValue) {
        if (s == null || s.isBlank())
            return defaultValue == null ? EMPTY : defaultValue;
        return s;
    }

    public static String join(String a, String b) {
        return join(EMPTY, a, b);
    }

    public static String join(char c, String a, String b) {
        return join(String.valueOf(c), a, b);
    }

    public static String join(String separator, String a, String b) {
        separator = defaultIfNull(separator);
        a = defaultIfNull(a);
        b = defaultIfNull(b);

        if (isNotNullOrEmpty(a) && isNullOrEmpty(b))
            return a;

        if (isNullOrEmpty(a) && isNotNullOrEmpty(b))
            return b;
        return a + separator + b;
    }

    public static String joinWithSpace(String a, String b) {
        return join(String.valueOf(Separator.SPACE.getCharacter()), a, b);
    }

    public static String joinWithHyphen(String a, String b) {
        return join(String.valueOf(Separator.HYPHEN.getCharacter()), a, b);
    }

    public static String join(String... strings) {
        return join(EMPTY, strings);
    }

    public static String join(char c, String... strings) {
        return join(String.valueOf(c), strings);
    }

    public static String join(String separator, String... strings) {
        StringBuilder sb = new StringBuilder();
        separator = defaultIfNull(separator);

        for (String s : strings) {
            if (isNotNullOrEmpty(s)) {
                if (sb.length() > 0)
                    sb.append(separator);
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static String joinWithSpace(String... strings) {
        return join(String.valueOf(Separator.SPACE.getCharacter()), strings);
    }

    public static String joinWithHyphen(String... strings) {
        return join(String.valueOf(Separator.HYPHEN.getCharacter()), strings);
    }

    public static String weld(String a, String b) {
        if (isNullOrEmpty(a) || isNullOrEmpty(b))
            return EMPTY;
        char ending = getLastChar(a);
        char start = getFirstChar(b);
        boolean vowel = false;

        if (ending == start)
            return removeLastChar(a) + b;

        if (!Character.isLetter(ending) || !Character.isLetter(start))
            return a + b;

        if ((vowel = CharHelper.isVowel(ending)) ^ CharHelper.isVowel(start))
            return a + b;
        return vowel ? (a + removeFirstChar(b)) : (removeLastChar(a) + b);
    }

    public static String trimToEmpty(String s) {
        return s == null ? EMPTY : s.trim();
    }

    public static String normalize(String s) {
        if (isNotNullOrEmpty(s))
            return Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", EMPTY);
        return s;
    }

    public static String stripAccents(String s) {
        if (isNotNullOrEmpty(s))
            return Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", EMPTY);
        return s;
    }

    public static String capitalizeFirst(String s) {
        if (isNullOrEmpty(s))
            return s;

        if (Character.isLowerCase(s.charAt(0))) {
            char c = Character.toUpperCase(s.charAt(0));

            if (Character.isLetter(c))
                return c + s.substring(1);
        }
        return s;
    }

    public static String capitalize(String s) {
        if (isNullOrEmpty(s))
            return s;
        String[] parts = s.split("\\s+");

        for (int n = 0; n < parts.length; n++) {
            parts[n] = capitalizeFirst(parts[n]);
        }
        s = String.join(String.valueOf(Separator.SPACE.getCharacter()), parts);
        return s;
    }

    public static String remove(String s, String occurrence) {
        if (isNotNullOrEmpty(s) && isNotNullOrEmpty(occurrence))
            return s.replace(occurrence, EMPTY);
        return s;
    }

    public static String removeAll(String s, String regex) {
        if (isNotNullOrEmpty(s) && isNotNullOrEmpty(regex))
            return s.replaceAll(regex, EMPTY);
        return s;
    }

    public static String removeFirstChar(String s) {
        if (isNotNullOrEmpty(s))
            s = s.substring(1);
        return s;
    }

    public static String removeLastChar(String s) {
        if (isNotNullOrEmpty(s))
            s = s.substring(0, s.length() - 1);
        return s;
    }

    public static String removeFirst(String s, String regex) {
        if (isNotNullOrEmpty(s))
            return s.replaceFirst(regex, EMPTY);
        return s;
    }

    public static char getFirstChar(String s) {
        if (isNotNullOrEmpty(s))
            return s.charAt(0);
        return CharHelper.NULL_CHAR;
    }

    public static char getLastChar(String s) {
        if (isNotNullOrEmpty(s))
            return s.charAt(s.length() - 1);
        return CharHelper.NULL_CHAR;
    }

    public static String getStart(String s) {
        if (isNotNullOrEmpty(s))
            return String.valueOf(s.charAt(0));
        return s;
    }

    public static String getEnd(String s) {
        if (isNotNullOrEmpty(s))
            return String.valueOf(s.charAt(s.length() - 1));
        return s;
    }

    public static String left(String s, int n) {
        if (s == null || n < 0)
            return s;
        else if (s.length() <= n)
            return s;
        return s.substring(0, n);
    }

    public static String right(String s, int n) {
        if (s == null || n < 0)
            return s;
        else if (s.length() <= n)
            return s;
        return s.substring(s.length() - n);
    }

    public static String substringBeforeLast(final String s, final String separator) {
        if (isNullOrEmpty(s) || isNullOrEmpty(separator))
            return s;
        int n = s.lastIndexOf(separator);

        if (n == IntegerHelper.DEFAULT_INDEX)
            return s;
        return s.substring(0, n);
    }

    public static String substringAfterLast(final String s, final String separator) {
        if (isNullOrEmpty(s) || isNullOrEmpty(separator))
            return s;
        int n = s.lastIndexOf(separator);

        if (n == IntegerHelper.DEFAULT_INDEX || n <= s.length() - separator.length())
            return s;
        return s.substring(n + 1);
    }

    public static boolean startsWith(String s, String prefix) {
        if (s != null && prefix != null && s.length() >= prefix.length())
            return s.indexOf(prefix) == 0;
        return prefix == null;
    }

    public static boolean startsWithAny(String s, String... prefixes) {
        for (String prefix : prefixes) {
            if (startsWith(s, prefix)) return true;
        }
        return false;
    }

    public static boolean endsWith(String s, char c) {
        if (s != null && c != CharHelper.NULL_CHAR && s.length() > 0)
            return s.charAt(s.length() - 1) == c;
        return c == CharHelper.NULL_CHAR;
    }

    public static boolean endsWith(String s, String suffix) {
        if (s != null && suffix != null && s.length() >= suffix.length())
            return s.endsWith(suffix);
        return suffix == null;
    }

    public static boolean endsWithAny(String s, char... characters) {
        for (char c : characters) {
            if (endsWith(s, c)) return true;
        }
        return false;
    }

    public static boolean endsWithAny(String s, String... suffixes) {
        for (String suffix : suffixes) {
            if (endsWith(s, suffix)) return true;
        }
        return false;
    }

    public static boolean equalsAny(String s, String... occurrences) {
        if (s == null)
            return false;

        for (String occurrence : occurrences) {
            if (s.equals(occurrence)) return true;
        }
        return false;
    }

    public static boolean containsAny(String s, String... affixes) {
        for (String affix : affixes) {
            if (s != null && s.contains(affix))
                return true;
            return affix == null;
        }
        return false;
    }

    public static boolean hasAny(String s, char... chars) {
        if (isNullOrEmpty(s))
            return false;

        for (char character : chars) {
            for (char c : s.toCharArray()) {
                if (c == character) return true;
            }
        }
        return false;
    }

    public static boolean hasLetter(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (CharHelper.isLetter(c)) return true;
        }
        return false;
    }

    public static boolean hasUnaccentedVowel(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (CharHelper.isUnaccentedVowel(c)) return true;
        }
        return false;
    }

    public static boolean hasVowel(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (CharHelper.isVowel(c)) return true;
        }
        return false;
    }

    public static boolean hasRegisteredVowel(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (CharHelper.isDefaultVowel(c)) return true;
        }
        return false;
    }

    public static boolean hasConsonant(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (CharHelper.isConsonant(c)) return true;
        }
        return false;
    }

    public static boolean hasNonVowelLetter(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (!CharHelper.isVowel(c) && Character.isLetter(c)) return true;
        }
        return false;
    }

    public static boolean hasDiacritic(String s) {
        if (isNullOrBlank(s))
            return false;
        return Normalizer.normalize(s, Normalizer.Form.NFD).matches("(?s).*\\p{InCombiningDiacriticalMarks}.*");
    }

    public static boolean containsSpace(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (CharHelper.isSpace(c)) return true;
        }
        return false;
    }

    public static boolean isOnlyLetters(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) return false;
        }
        return true;
    }

    public static boolean isAllUpperCase(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c) || !Character.isUpperCase(c)) return false;
        }
        return true;
    }

    public static boolean isAllLowerCase(String s) {
        if (isNullOrBlank(s))
            return false;

        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c) || !Character.isLowerCase(c)) return false;
        }
        return true;
    }

    /**
     * Unescapes a string that contains standard Java escape sequences.
     * <ul>
     * <li><strong>&#92;b &#92;f &#92;n &#92;r &#92;t &#92;" &#92;'</strong> :
     * BS, FF, NL, CR, TAB, double and single quote.</li>
     * <li><strong>&#92;X &#92;XX &#92;XXX</strong> : Octal character
     * specification (0 - 377, 0x00 - 0xFF).</li>
     * <li><strong>&#92;uXXXX</strong> : Hexadecimal based Unicode character.</li>
     * </ul>
     *
     * @param st A string optionally containing standard java escape sequences.
     * @return The translated string.
     */
    public static String unescapeJavaString(String st) {
        if (isNullOrEmpty(st))
            return st;
        StringBuilder sb = new StringBuilder(st.length());

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch == '\\') {
                char nextChar = (i == st.length() - 1) ? '\\' : st
                        .charAt(i + 1);

                // Octal escape?
                if (nextChar >= '0' && nextChar <= '7') {
                    String code = EMPTY + nextChar;
                    i++;
                    if ((i < st.length() - 1) && st.charAt(i + 1) >= '0'
                            && st.charAt(i + 1) <= '7') {
                        code += st.charAt(i + 1);
                        i++;
                        if ((i < st.length() - 1) && st.charAt(i + 1) >= '0'
                                && st.charAt(i + 1) <= '7') {
                            code += st.charAt(i + 1);
                            i++;
                        }
                    }
                    sb.append((char) Integer.parseInt(code, 8));
                    continue;
                }

                switch (nextChar) {
                    case '\\':
                        ch = '\\';
                        break;
                    case 'b':
                        ch = '\b';
                        break;
                    case 'f':
                        ch = '\f';
                        break;
                    case 'n':
                        ch = '\n';
                        break;
                    case 'r':
                        ch = '\r';
                        break;
                    case 't':
                        ch = '\t';
                        break;
                    case '\"':
                        ch = '\"';
                        break;
                    case '\'':
                        ch = '\'';
                        break;
                    // Hex Unicode: u????
                    case 'u':
                        if (i >= st.length() - 5) {
                            ch = 'u';
                            break;
                        }

                        int code = Integer.parseInt(EMPTY + st.charAt(i + 2) + st.charAt(i + 3) +
                                st.charAt(i + 4) + st.charAt(i + 5), 16);
                        sb.append(Character.toChars(code));
                        i += 5;
                        continue;
                }
                i++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
