package common;

import com.memoeslink.common.Randomizer;

public class Maker {

    public static String getColor(String s) {
        if (StringHelper.isNullOrEmpty(s))
            return String.format("#%06x", (0xFFFFFF & -7829368));
        StringGenerator stringGenerator = new StringGenerator(null, LongHelper.getSeed(s));
        return stringGenerator.getStrColor();
    }

    public static String getDefaultColor(String s) {
        Randomizer r = new Randomizer(LongHelper.getSeed(s));
        return ResourceGetter.with(r).getString(Constant.DEFAULT_COLORS);
    }
}
