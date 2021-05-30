package spanish;

public interface NounDefiner extends common.NounDefiner {

    public String getNounWithArticle();

    public String getNounWithIndefiniteArticle();

    public String getFemaleNounWithArticle();

    public String getFemaleNounWithIndefiniteArticle();

    public String getMaleNounWithArticle();

    public String getMaleNounWithIndefiniteArticle();

    public Noun getRefinedNoun();
}