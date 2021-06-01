package common;

public interface NounDefiner {

    public String getEmptyNoun();

    public String getNoun();

    public String getPluralNoun();

    public String getFemaleNoun();

    public String getPluralFemaleNoun();

    public String getMaleNoun();

    public String getPluralMaleNoun();

    public NounGetter with(Randomizer r);
}
