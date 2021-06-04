package international;

import common.IntegerHelper;
import common.Randomizer;
import common.ResourceGetter;
import common.StringHelper;

public interface NameDefiner extends common.NameDefiner {

    default String getDefinedForename(Randomizer r) {
        int type = r.getInt(Constant.GENERATED_NAME_START.length);
        return getDefinedForename(type, r);
    }

    default String getDefinedForename(int type, Randomizer r) {
        type = IntegerHelper.defaultIndex(Constant.GENERATED_NAME_START.length, type);
        return StringHelper.capitalizeFirst(ResourceGetter.with(r).getString(Constant.GENERATED_NAME_START[type]) +
                ResourceGetter.with(r).getString(Constant.GENERATED_NAME_MIDDLE[type]) +
                ResourceGetter.with(r).getString(Constant.GENERATED_NAME_ENDING[type]));
    }
}
