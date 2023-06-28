package russian;

import common.CharHelper;
import common.Gender;
import common.StringHelper;

public interface NameDefiner extends base.NameDefiner {

    default String getPatronymic(String name, Gender gender) {
        gender = gender != null ? gender : Gender.UNDEFINED;

        if (StringHelper.isNullOrEmpty(name))
            return name;
        String[] suffixes;

        if (gender == Gender.MASCULINE)
            suffixes = Constant.MALE_PATRONYMIC_SUFFIXES;
        else if (gender == Gender.FEMININE)
            suffixes = Constant.FEMALE_PATRONYMIC_SUFFIXES;
        else
            return name;
        char lastChar = StringHelper.getLastChar(name);

        if (lastChar == 'a')
            return StringHelper.removeLastChar(name) + suffixes[0];
        else if (lastChar == 'e')
            return StringHelper.removeLastChar(name) + suffixes[1];
        else if (CharHelper.isVowel(lastChar) || lastChar == 'j')
            return name + suffixes[1];
        else if (CharHelper.isConsonant(lastChar))
            return name + suffixes[2];
        return name;
    }
}
