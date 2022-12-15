package spanish;

import com.memoeslink.common.Randomizer;
import common.PhraseDefiner;

import java.time.LocalTime;

public class PhraseGetter extends common.PhraseGetter implements PhraseDefiner {

    public PhraseGetter() {
        super();
    }

    public PhraseGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getSimpleGreeting() {
        String greeting = PeriodOfDay.get(LocalTime.now()).getGreeting();
        return r.getBoolean() ? greeting : Pluralizer.pluralize(greeting);
    }
}
