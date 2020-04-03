package core.basesyntax;

public class Engine implements Cloneable {
    private String fuel;
    private float capacity;
    private int power;
    private float fuelConsumption;
    private int cylinderQuantity;

    public Engine(String fuel, float capacity, int power,
                  float fuelConsumption, int cylinderQuantity) {
        this.fuel = fuel;
        this.capacity = capacity;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.cylinderQuantity = cylinderQuantity;
    }

    @Override
    public Engine clone() {
        return new Engine(fuel, capacity, power, fuelConsumption, cylinderQuantity);
    }
}
