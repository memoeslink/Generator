package common;

public class IntegerHelper {
    public static final int DEFAULT_INDEX = -1;
    public static final int INITIAL_INDEX = 0;

    public static int defaultIndex(int length, int position) {
        if (length < 0 || position < 0)
            return DEFAULT_INDEX;

        if (position <= length - 1)
            return position;
        return INITIAL_INDEX;
    }
}
