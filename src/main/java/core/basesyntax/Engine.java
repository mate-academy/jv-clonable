package core.basesyntax;

public class Engine implements Cloneable {
    private int revs;
    private int cylinders;
    private int sroke;
    private String produce;
    private String arrangement;

    public Engine(int revs, int cylinders, int sroke, String produce, String arrangement) {
        this.revs = revs;
        this.cylinders = cylinders;
        this.sroke = sroke;
        this.produce = produce;
        this.arrangement = arrangement;
    }

    @Override
    public  Engine clone() throws CloneNotSupportedException {
        return new Engine(revs, cylinders, sroke, produce, arrangement);
    }
}
