package core.basesyntax;

public class Engine implements Cloneable {
    private String fuelSupplySystem;
    private int cylinders;
    private String horsePwr;
    private String mark;
    private int weight;

    public Engine(String fuelSupplySystem, int cylinders,
                   String horsePwr, String mark, int weight) {
        this.fuelSupplySystem = fuelSupplySystem;
        this.cylinders = cylinders;
        this.horsePwr = horsePwr;
        this.mark = mark;
        this.weight = weight;
    }

    @Override
    public Engine clone() {
        return new Engine(fuelSupplySystem, cylinders, horsePwr, mark, weight);
    }
}
