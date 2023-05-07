package international;

import com.memoeslink.common.Randomizer;
import common.PhraseDefiner;

public class PhraseGetter extends common.PhraseGetter implements PhraseDefiner {

    public PhraseGetter() {
        super();
    }

    public PhraseGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getSimpleGreeting() {
        return getAnyGetter().getSimpleGreeting();
    }

    public common.PhraseGetter getAnyGetter() {
        return switch (r.getInt(2)) {
            case 0 -> new english.PhraseGetter(r);
            case 1 -> new spanish.PhraseGetter(r);
            default -> new common.PhraseGetter(r);
        };
    }
}
