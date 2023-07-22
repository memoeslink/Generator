package spanish;

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
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.agreement");
    }

    @Override
    public String getAmazement() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.amazement");
    }

    @Override
    public String getApology() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.apology");
    }

    @Override
    public String getAppreciation() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.appreciation");
    }

    @Override
    public String getCongratulation() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.congratulation");
    }

    @Override
    public String getDisagreement() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.disagreement");
    }

    @Override
    public String getDoubt() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.doubt");
    }

    @Override
    public String getFarewell() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.farewell");
    }

    @Override
    public String getGreeting() {
        String greeting;

        switch (r.getInt(3)) {
            case 1 -> greeting = PeriodOfDay.get(LocalTime.now()).getGreeting();
            case 2 -> {
                greeting = PeriodOfDay.get(LocalTime.now()).getGreeting();
                greeting = Pluralizer.pluralize(greeting);
            }
            default -> greeting = ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.greeting");
        }
        return greeting;
    }

    @Override
    public String getPetition() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.petition");
    }

    @Override
    public String getInitiationQuestion() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.question.initiation");
    }

    @Override
    public String getInquiryQuestion() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.question.inquiry");
    }

    @Override
    public String getShortAnswer() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.short.answer");
    }

    @Override
    public String getWelcome() {
        return ResourceGetter.with(r).getStrFromResBundle(Locale.of("es"), "phrase.common.welcome");
    }
}
