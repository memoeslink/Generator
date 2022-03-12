package russian;

import common.CharHelper;
import common.Database;
import common.StringHelper;

public interface NameDefiner extends common.NameDefiner {

    private String getPatronymicBase(String name) {
        String base = StringHelper.defaultIfEmpty(name, Database.DEFAULT_VALUE);
        return StringHelper.removeAll(base, "[eiy]$");
    }

    default String getFemalePatronymic(String name) {
        String base = getPatronymicBase(name);

        if (CharHelper.isConsonant(base.charAt(base.length() - 1)) || name.charAt(name.length() - 1) == 'a')
            return base + "ovich";
        else if (CharHelper.isVowel(base.charAt(base.length() - 1)))
            return base + "evich";
        return name;
    }

    default String getMalePatronymic(String name) {
        String base = getPatronymicBase(name);

        if (CharHelper.isConsonant(base.charAt(base.length() - 1)) || name.charAt(name.length() - 1) == 'a')
            return base + "ovna";
        else if (CharHelper.isVowel(base.charAt(base.length() - 1)))
            return base + "evna";
        return name;
    }
}