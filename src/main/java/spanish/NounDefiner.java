package spanish;

public interface NounDefiner extends common.NounDefiner {

    public String getNounWithArticle();

    public String getFemaleNounWithArticle();

    public String getMaleNounWithArticle();

    public String getNounWithIndefiniteArticle();

    public String getFemaleNounWithIndefiniteArticle();

    public String getMaleNounWithIndefiniteArticle();

    public Noun getRefinedNoun();
}