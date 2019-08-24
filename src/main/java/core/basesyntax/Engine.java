package core.basesyntax;

public class Engine implements Cloneable{
    private String name;
    private String fuelUsed;
    private String type;
    private int capacity;
    private int power;

    public Engine(String name, String fuel, String type, int capacity, int power) {
        this.name = name;
        this.fuelUsed = fuel;
        this.type = type;
        this.capacity = capacity;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelUsed(String fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
