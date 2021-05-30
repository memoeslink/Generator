package spanish;

import common.NounDefiner;
import common.*;

public final class NounGetter extends common.NounGetter implements NounDefiner, spanish.NounDefiner {

    public NounGetter() {
        super();
    }

    private NounGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getNoun() {
        Noun noun = getRefinedNoun();
        return !noun.isPlural() ? noun.getBase() : getNoun();
    }

    @Override
    public String getPluralNoun() {
        Noun noun = getRefinedNoun();
        return noun.isPlural() ? noun.getBase() : Pluralizer.pluralize(noun).getBase();
    }

    @Override
    public String getFemaleNoun() {
        Noun noun = getRefinedNoun();
        return noun.getGender() == Gender.FEMININE && !noun.isPlural() ? noun.getBase() : getFemaleNoun();
    }

    @Override
    public String getPluralFemaleNoun() {
        Noun noun = getRefinedNoun();
        return noun.getGender() == Gender.FEMININE ? (noun.isPlural() ? noun.getBase() : Pluralizer.pluralize(noun).getBase()) : getPluralFemaleNoun();
    }

    @Override
    public String getMaleNoun() {
        Noun noun = getRefinedNoun();
        return noun.getGender() == Gender.MASCULINE && !noun.isPlural() ? noun.getBase() : getMaleNoun();
    }

    @Override
    public String getPluralMaleNoun() {
        Noun noun = getRefinedNoun();
        return noun.getGender() == Gender.MASCULINE ? (noun.isPlural() ? noun.getBase() : Pluralizer.pluralize(noun).getBase()) : getPluralMaleNoun();
    }

    @Override
    public NounGetter with(Randomizer r) {
        return new NounGetter(r);
    }

    @Override
    public String getNounWithArticle() {
        return getRefinedNoun().getBaseWithArticle();
    }

    @Override
    public String getNounWithIndefiniteArticle() {
        return getRefinedNoun().getBaseWithIndefiniteArticle();
    }

    @Override
    public String getFemaleNounWithArticle() {
        Noun noun = getRefinedNoun();
        return getRefinedNoun().getGender() == Gender.FEMININE ? noun.getBaseWithArticle() : getFemaleNounWithArticle();
    }

    @Override
    public String getFemaleNounWithIndefiniteArticle() {
        Noun noun = getRefinedNoun();
        return getRefinedNoun().getGender() == Gender.FEMININE ? noun.getBaseWithIndefiniteArticle() :
                getFemaleNounWithIndefiniteArticle();
    }

    @Override
    public String getMaleNounWithArticle() {
        Noun noun = getRefinedNoun();
        return getRefinedNoun().getGender() == Gender.MASCULINE ? noun.getBaseWithArticle() : getMaleNounWithArticle();
    }

    @Override
    public String getMaleNounWithIndefiniteArticle() {
        Noun noun = getRefinedNoun();
        return getRefinedNoun().getGender() == Gender.MASCULINE ? noun.getBaseWithIndefiniteArticle() :
                getMaleNounWithIndefiniteArticle();
    }

    @Override
    public Noun getRefinedNoun() {
        String noun = Database.selectSpanishNoun(r.getInt(1, Database.countSpanishNouns()));

        for (Article article : Article.values()) {
            if (StringHelper.startsWith(noun, article.getArticle() + Separator.SPACE.getCharacter())) {
                String temp = StringHelper.removeFirst(noun, article.getArticle() + "\\s+");
                noun = temp.trim();

                if (article.getGender() == Gender.MASCULINE && StringHelper.startsWithAny(noun, "a", "á") && StringHelper.endsWith(noun, "a"))
                    return new Noun(article, noun, Gender.FEMININE, article.isPlural());
                return new Noun(article, noun, article.getGender(), article.isPlural());
            }
        }
        return new Noun(Article.INDEFINITE, noun);
    }
}
