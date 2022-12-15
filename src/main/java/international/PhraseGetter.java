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
        switch (r.getInt(2)) {
            case 0:
                return new english.PhraseGetter(r);
            case 1:
                return new spanish.PhraseGetter(r);
        }
        return new common.PhraseGetter(r);
    }
}
