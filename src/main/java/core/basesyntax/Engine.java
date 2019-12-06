package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int power;
    private int cylinders;
    private int fuelConsumption;
    private boolean isNew;

    public Engine(String name, int power, int cylinders, int fuelConsumption, boolean isNew) {
        this.name = name;
        this.power = power;
        this.cylinders = cylinders;
        this.fuelConsumption = fuelConsumption;
        this.isNew = isNew;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, power, cylinders, fuelConsumption, isNew);
    }
}
