package common;

public class Word {
    private String word;
    private String neutralForm;
    private String masculineForm;
    private String feminineForm;

    private boolean plural;
    private Gender gender;

    public Word() {
        this("", false, Gender.UNDEFINED);
    }

    public Word(String word) {
        this(word, false, Gender.UNDEFINED);
    }

    public Word(String word, Gender gender) {
        this(word, false, gender);
    }

    public Word(String word, boolean plural, Gender gender) {
        this.word = StringHelper.defaultIfNull("");
        this.plural = plural;
        this.gender = gender != null ? gender : Gender.UNDEFINED;
    }

    public String getWord() {
        return StringHelper.defaultIfNull(word);
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getNeutralForm() {
        return getDefaultForm(neutralForm);
    }

    public void setNeutralForm(String neutralForm) {
        this.neutralForm = neutralForm;
    }

    public String getMasculineForm() {
        return getDefaultForm(masculineForm);
    }

    public void setMasculineForm(String masculineForm) {
        this.masculineForm = masculineForm;
    }

    public String getFeminineForm() {
        return getDefaultForm(feminineForm);
    }

    public void setFeminineForm(String feminineForm) {
        this.feminineForm = feminineForm;
    }

    public Gender getGender() {
        return gender != null ? gender : Gender.UNDEFINED;
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

    public String getDefaultForm(String word) {
        return StringHelper.defaultIfNull(word, StringHelper.defaultIfNull(this.word));
    }

    public String getCombinedForm(WordCombination combination) {
        if (plural)
            return getNeutralForm();
        combination = combination != null ? combination : WordCombination.ONLY_SLASH;

        if (!StringHelper.defaultIfNull(masculineForm).isEmpty() && !StringHelper.defaultIfNull(feminineForm).isEmpty()) {
            String incompleteMasculineForm = StringHelper.removeLastChar(masculineForm);
            String incompleteFeminineForm = StringHelper.removeLastChar(feminineForm);

            if (incompleteMasculineForm.equals(incompleteFeminineForm))
                return masculineForm + combination.getStarter() + feminineForm.charAt(feminineForm.length() - 1) +
                        (combination.getFinisher() != '\0' ? combination.getFinisher() : "");
            return masculineForm + combination.getCombinator() + feminineForm;
        }
        return getNeutralForm();
    }
}
