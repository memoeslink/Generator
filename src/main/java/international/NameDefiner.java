package international;

import common.*;

public interface NameDefiner extends common.NameDefiner {

    default String getDefinedForename(Randomizer r) {
        int type = r.getInt(Constant.GENERATED_NAME_START.length);
        return getDefinedForename(type, r);
    }

    default String getDefinedForename(int type, Randomizer r) {
        type = IntegerHelper.defaultIndex(type, Constant.GENERATED_NAME_START.length);
        return StringHelper.capitalizeFirst(ResourceGetter.with(r).getString(Constant.GENERATED_NAME_START[type]) +
                ResourceGetter.with(r).getString(Constant.GENERATED_NAME_MIDDLE[type]) +
                ResourceGetter.with(r).getString(Constant.GENERATED_NAME_ENDING[type]));
    }

    default String getIterativeName(int iterations, Randomizer r) {
        StringBuilder sb = new StringBuilder();
        iterations = IntegerHelper.defaultInt(iterations, 1, 100);
        float probability = r.getFloat();

        //Decide whether the name will start with vowel
        if (r.getInt(3) == 0)
            probability = 1.1F;

        //Add consonants with vowel
        for (int i = 1; i <= iterations; i++) {
            if (probability <= 0.7F || iterations == 1)
                sb.append(r.chooseOnWeight(Constant.WEIGHTED_CONSONANTS));
            else if (probability <= 0.85F && iterations > 1)
                sb.append(ResourceGetter.with(r).getString(Constant.MIDDLE_CONSONANTS));
            else if (probability <= 1.0F)
                sb.append(ResourceGetter.with(r).getString(Constant.CONSONANT_PAIRS));
            sb.append(ResourceGetter.with(r).getChar(english.Constant.LOWERCASE_VOWELS));
            probability = r.getFloat();
        }

        //Decide whether the name will end with consonant
        if (r.getInt(4) == 0)
            sb.append(ResourceGetter.with(r).getChar(Constant.LOWERCASE_ENDING_CONSONANTS));
        return StringHelper.capitalizeFirst(sb.toString());
    }

    default String getPatternName(Randomizer r) {
        String namePattern = Constant.NAME_PATTERNS[r.getInt(0, Constant.NAME_PATTERNS.length)];
        StringBuilder sb = new StringBuilder();

        if (r.getBoolean())
            namePattern = namePattern.replace('e', 'ɘ');

        if (r.getBoolean())
            namePattern = namePattern.replace('k', 'q');

        for (char c : namePattern.toCharArray()) {
            switch (c) {
                case 'c':
                    sb.append(ResourceGetter.with(r).getChar(english.Constant.LOWERCASE_CONSONANTS));
                    break;
                case 'e':
                    sb.append(ResourceGetter.with(r).getChar(Constant.LOWERCASE_ENDING_CONSONANTS));
                    break;
                case 'ɘ':
                    sb.append(ResourceGetter.with(r).getString(Constant.ENDING_CONSONANTS));
                    break;
                case 'k':
                    sb.append(ResourceGetter.with(r).getString(Constant.CONSONANT_PAIRS));
                    break;
                case 'm':
                    sb.append(ResourceGetter.with(r).getString(Constant.MIDDLE_CONSONANTS));
                    break;
                case 'q':
                    sb.append(ResourceGetter.with(r).getString(Constant.STARTING_CONSONANTS));
                    break;
                case 'v':
                    sb.append(ResourceGetter.with(r).getChar(english.Constant.LOWERCASE_VOWELS));
                    break;
                case 'w':
                    sb.append(ResourceGetter.with(r).getString(Constant.VOWEL_PAIRS));
                    break;
                case '?':
                    if (r.getBoolean())
                        sb.append(ResourceGetter.with(r).getChar(english.Constant.LOWERCASE_CONSONANTS));
                    else
                        sb.append(ResourceGetter.with(r).getChar(english.Constant.LOWERCASE_VOWELS));
                case ' ':
                    sb.append(' ');
                    break;
            }
        }
        return StringHelper.capitalize(sb.toString());
    }

    default String getFrequencyName(WeightedChar[] letters, int length, Randomizer r) {
        String s;
        StringBuilder sb = new StringBuilder();
        char previousChar = r.chooseOnWeight(letters);
        char currentChar;
        boolean sameType = false;
        boolean allowed;
        boolean equal;
        boolean vowel, anotherVowel;
        float[] approvalRate = {0.5F, 0.125F, 0.0F};
        int count = 0;

        if (letters == null || letters.length == 0)
            letters = Constant.ENGLISH_WEIGHTED_LETTERS;
        length = IntegerHelper.defaultInt(length, 1, 9999);

        for (int n = 0; n < length; n++) {
            if (sameType) {
                do {
                    currentChar = r.chooseOnWeight(letters);
                    allowed = true;

                    if (previousChar == currentChar) {
                        equal = true;
                        allowed = r.getBoolean();
                    } else
                        equal = false;
                }
                while ((vowel = CharHelper.isUnaccentedVowel(previousChar)) ^ CharHelper.isUnaccentedVowel(currentChar) ||
                        ((!vowel || n == length - 1) && CharHelper.isAccentedConsonant(currentChar)) ||
                        (equal && CharHelper.isNonClusterConsonant(currentChar)) || !allowed);
            } else {
                do {
                    currentChar = r.chooseOnWeight(letters);
                }
                while ((vowel = CharHelper.isUnaccentedVowel(previousChar)) == (anotherVowel = CharHelper.isUnaccentedVowel(currentChar)) ||
                        ((!vowel || n == length - 1) && CharHelper.isAccentedConsonant(currentChar)) ||
                        (CharHelper.isAccentedConsonant(currentChar) && !anotherVowel));
            }
            sb.append(currentChar);
            previousChar = sb.charAt(sb.length() - 1);

            if (r.getFloat() <= approvalRate[count] && !CharHelper.isAccentedConsonant(currentChar)) {
                count++;
                sameType = true;
            } else {
                count = 0;
                sameType = false;
            }
        }
        s = sb.toString();

        if (!StringHelper.hasVowel(s))
            s = getFrequencyName(letters, length, r);
        return StringHelper.capitalizeFirst(s);
    }
}
