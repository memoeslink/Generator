package common;

public abstract class Getter {
    protected Randomizer r;

    public Getter() {
        r = new Randomizer();
    }

    protected Getter(Randomizer r) {
        this.r = r != null ? r : new Randomizer();
    }
}
