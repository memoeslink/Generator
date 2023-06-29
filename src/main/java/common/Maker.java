package common;

import com.memoeslink.common.Randomizer;
import org.memoeslink.LongHelper;
import org.memoeslink.StringHelper;

public class Maker {

    public static String getColor(String s) {
        if (StringHelper.isNullOrEmpty(s))
            return String.format("#%06x", (0xFFFFFF & -7829368));
        Randomizer r = new Randomizer(LongHelper.getSeed(s));
        return String.format("#%06x", r.getInt(0xFFFFFF + 1));
    }

    public static String getDefaultColor(String s) {
        Randomizer r = new Randomizer(LongHelper.getSeed(s));
        return ResourceGetter.with(r).getString(Constant.DEFAULT_COLORS);
    }
}
