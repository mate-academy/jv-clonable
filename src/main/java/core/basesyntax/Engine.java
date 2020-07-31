package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int weight;
    private int numberOfCylinders;
    private boolean works;
    private boolean broken;

    public Engine(String type, int weight, int numberOfCylinders, boolean works, boolean broken) {
        this.type = type;
        this.weight = weight;
        this.numberOfCylinders = numberOfCylinders;
        this.works = works;
        this.broken = broken;
    }

    @Override
    public Engine clone() {
        return new Engine(type, weight, numberOfCylinders, works, broken);
    }
}
