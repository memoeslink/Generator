package common;

public class ResourceGetter extends Getter {

    public ResourceGetter() {
        super();
    }

    private ResourceGetter(Randomizer r) {
        super(r);
    }

    public char getAChar(String s) {
        if (StringHelper.isNotNullOrEmpty(s))
            return s.charAt(r.getInt(s.length()));
        return CharHelper.NULL_CHAR;
    }

    public ResourceGetter with(Randomizer r) {
        return new ResourceGetter(r);
    }
}
