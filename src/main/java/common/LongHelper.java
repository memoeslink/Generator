package common;

public class LongHelper {

    public Long getSeed(String s) {
        if (StringHelper.isNullOrEmpty(s))
            return null;
        long hash = 0;

        for (char c : s.toCharArray()) {
            hash = 31L * hash + c;
        }
        return hash;
    }
}
