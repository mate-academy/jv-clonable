package core.basesyntax;

public class Engine implements Cloneable {
    private String fuelSupplySystem;
    private int cylinders;
    private String horsePwr;
    private String mark;
    private int weight;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Engine();
    }
}
