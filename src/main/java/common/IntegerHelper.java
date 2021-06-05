package common;

public class IntegerHelper {
    public static final int DEFAULT_INDEX = -1;
    public static final int INITIAL_INDEX = 0;

    public static boolean isBetween(int n, int min, int max) {
        return min <= n && n <= max;
    }

    public static int defaultIndex(int length, int position) {
        if (length < 0 || position < 0)
            return DEFAULT_INDEX;

        if (position <= length - 1)
            return position;
        return INITIAL_INDEX;
    }

    public static int defaultMinInt(int n, int min) {
        if (min == Integer.MIN_VALUE || n < min)
            return min;
        return n;
    }

    public static int defaultMaxInt(int n, int max) {
        if (max == Integer.MAX_VALUE || n > max)
            return max;
        return n;
    }

    public static int defaultInt(int n, int min, int max) {
        if (min > max)
            return INITIAL_INDEX;

        if (isBetween(n, min, max))
            return n;
        return n < min ? min : max;
    }
}
