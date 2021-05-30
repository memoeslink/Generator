package spanish;

import common.Gender;
import common.StringHelper;

public interface AdjectiveDefiner extends common.AdjectiveDefiner {

    default Adjective getRefinedAdjective(String s) {
        Adjective adjective = new Adjective();

        if (s.contains("AQ0C")) {
            adjective.setGender(Gender.NEUTRAL);
        } else if (StringHelper.containsAny(s, "AQ0C", "AQ0M", "AO0M", "AQSM")) {
            adjective.setGender(Gender.MASCULINE);
        } else if (StringHelper.containsAny(s, "AQ0C", "AQ0F", "AO0F", "AQSF")) {
            adjective.setGender(Gender.FEMININE);
        } else if (StringHelper.endsWith(s, "a")) {
            s = StringHelper.substringBeforeLast(s, "a") + "o";
            adjective.setGender(Gender.MASCULINE);
        } else if (StringHelper.endsWith(s, "o")) {
            s = StringHelper.substringBeforeLast(s, "o") + "a";
            adjective.setGender(Gender.FEMININE);
        }
        s = s.replaceFirst("\\s*(A[OQ][S0][CFM][A-Z\\d]{2})", "");
        adjective.setBase(s);
        return adjective;
    }

    public Adjective getRefinedSingularAdjective();

    public Adjective getRefinedPluralAdjective();
}
