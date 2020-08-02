package core.basesyntax;

public class Engine implements Cloneable {
    private double capacity;
    private String fuelType;
    private int power;
    private double pistonStroke;
    private int numberOfCylinders;

    public Engine(double capacity, String fuelType, int power, double pistonStroke,
                   int numberOfCylinders) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.power = power;
        this.pistonStroke = pistonStroke;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(capacity, fuelType, power, pistonStroke, numberOfCylinders);
    }
}
