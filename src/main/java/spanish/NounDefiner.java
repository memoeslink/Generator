package spanish;

public interface NounDefiner extends common.NounDefiner {

    public Noun getRefinedNoun();

    public Noun getRefinedPluralNoun();

    public Noun getRefinedFemaleNoun();

    public Noun getRefinedPluralFemaleNoun();

    public Noun getRefinedMaleNoun();

    public Noun getRefinedPluralMaleNoun();
}