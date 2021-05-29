package spanish;

import common.Gender;

public enum Article {
    INDEFINITE("", "", Gender.UNDEFINED, false),
    MASCULINE_SINGULAR("el", "un", Gender.MASCULINE, false),
    MASCULINE_PLURAL("los", "unos", Gender.MASCULINE, true),
    FEMININE_SINGULAR("la", "una", Gender.FEMININE, false),
    FEMININE_PLURAL("las", "unas", Gender.FEMININE, true),
    NEUTER("lo", "uno", Gender.NEUTRAL, false);

    private String article;
    private String indefiniteArticle;
    private Gender gender;
    private boolean plural;

    private Article(String article, String indefiniteArticle, Gender gender, boolean plural) {
        this.article = article;
        this.indefiniteArticle = indefiniteArticle;
        this.gender = gender != null ? gender : Gender.UNDEFINED;
        this.plural = plural;
    }

    public String getArticle() {
        return article;
    }

    public String getIndefiniteArticle() {
        return indefiniteArticle;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isPlural() {
        return plural;
    }
}
