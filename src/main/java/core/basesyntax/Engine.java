package core.basesyntax;

public class Engine implements Cloneable {
    private int revs;
    private int cylinders;
    private int sroke;
    private String produce;
    private String arrangement;

    public Engine(int rev, int cyl, int srok, String prod, String arrang) {
        revs = rev;
        cylinders = cyl;
        sroke = srok;
        produce = prod;
        arrangement = arrang;
    }

    @Override
    public  Engine clone() throws CloneNotSupportedException {
        return new Engine(revs, cylinders, sroke, produce, arrangement);
    }
}
