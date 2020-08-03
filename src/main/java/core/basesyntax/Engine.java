package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String fuelType;
    private int cylinderCount;
    private int fuelConsumption;
    private int horsePower;

    public Engine(String name, String fuelType, int cylinderCount,
                  int fuelConsumption, int horsePower) {
        this.name = name;
        this.fuelType = fuelType;
        this.cylinderCount = cylinderCount;
        this.fuelConsumption = fuelConsumption;
        this.horsePower = horsePower;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, fuelType, cylinderCount, fuelConsumption, horsePower);
    }
}
