package core.basesyntax;

public class Engine implements Cloneable {
    private final String type;
    private final int weight;
    private final int numberOfCylinders;
    private final boolean works;
    private final boolean broken;

    public Engine(String type, int weight, int numberOfCylinders, boolean works, boolean broken) {
        this.type = type;
        this.weight = weight;
        this.numberOfCylinders = numberOfCylinders;
        this.works = works;
        this.broken = broken;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
