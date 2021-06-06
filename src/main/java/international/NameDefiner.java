package international;

import common.IntegerHelper;
import common.Randomizer;
import common.ResourceGetter;
import common.StringHelper;

public interface NameDefiner extends common.NameDefiner {

    default String getDefinedForename(Randomizer r) {
        int type = r.getInt(Constant.GENERATED_NAME_START.length);
        return getDefinedForename(type, r);
    }

    default String getDefinedForename(int type, Randomizer r) {
        type = IntegerHelper.defaultIndex(Constant.GENERATED_NAME_START.length, type);
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
                case ' ':
                    sb.append(' ');
                    break;
            }
        }
        return StringHelper.capitalize(sb.toString());
    }
}
