package english;

import com.memoeslink.common.Randomizer;
import common.PhraseDefiner;
import common.ResourceGetter;

import java.time.LocalTime;
import java.util.Locale;

public class PhraseGetter extends common.PhraseGetter implements PhraseDefiner {

    public PhraseGetter() {
        super();
    }

    public PhraseGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getAgreement() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.agreement");
    }

    @Override
    public String getAmazement() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.amazement");
    }

    @Override
    public String getApology() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.apology");
    }

    @Override
    public String getAppreciation() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.appreciation");
    }

    @Override
    public String getCongratulation() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.congratulation");
    }

    @Override
    public String getDisagreement() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.disagreement");
    }

    @Override
    public String getDoubt() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.doubt");
    }

    @Override
    public String getFarewell() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.farewell");
    }

    @Override
    public String getGreeting() {
        if (r.getBoolean()) {
            return switch (PeriodOfDay.get(LocalTime.now())) {
                case MORNING -> "Good morning.";
                case AFTERNOON -> "Good afternoon.";
                case EVENING -> "Good evening.";
                case NIGHT -> "Good night.";
            };
        } else
            return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.greeting");
    }

    @Override
    public String getPetition() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.petition");
    }

    @Override
    public String getInitiationQuestion() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.question.initiation");
    }

    @Override
    public String getInquiryQuestion() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.question.inquiry");
    }

    @Override
    public String getShortAnswer() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.short.answer");
    }

    @Override
    public String getWelcome() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.ENGLISH, "phrase.common.welcome");
    }
}
