package spanish;

import common.Gender;
import common.Separator;
import common.StringHelper;

public class Noun {
    private Article article;
    private String noun;
    private Gender gender;
    private boolean plural;

    public Noun() {
        this(Article.INDEFINITE, StringHelper.EMPTY, Gender.UNDEFINED, false);
    }

    public Noun(Article article, String noun) {
        this(article, noun, Gender.UNDEFINED, false);
    }

    public Noun(Article article, String noun, Gender gender, boolean plural) {
        this.article = article;
        this.noun = noun;
        this.gender = gender != null ? gender : Gender.UNDEFINED;
        this.plural = plural;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender != null ? gender : Gender.UNDEFINED;
    }

    public boolean isPlural() {
        return plural;
    }

    public void setPlural(boolean plural) {
        this.plural = plural;
    }

    public String getNounWithArticle() {
        return StringHelper.trimToEmpty(article.getArticle() + Separator.SPACE.getCharacter() + noun);
    }

    public String getNounWithIndefiniteArticle() {
        return StringHelper.trimToEmpty(article.getIndefiniteArticle() + Separator.SPACE.getCharacter() + noun);
    }
}