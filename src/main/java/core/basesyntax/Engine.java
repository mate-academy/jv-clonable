package core.basesyntax;

public class Engine implements Cloneable {

    private String type;
    private String fuel;
    private int capacity;
    private int cylinders;
    private int serialNumber;

    public Engine(String type, String fuel, int capacity, int cylinders, int serialNumber) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
        this.cylinders = cylinders;
        this.serialNumber = serialNumber;
    }

    @Override
    public Engine clone() {
        return new Engine(type, fuel, capacity, cylinders, serialNumber);
    }

}
