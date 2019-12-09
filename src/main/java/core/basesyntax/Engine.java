package core.basesyntax;

public class Engine implements Cloneable {
    private String brand;
    private int capacity;
    private String type;
    private String fuelType;
    private int efficiency;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public Engine(String brand, int capacity, String type, String fuelType, int efficiency) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.fuelType = fuelType;
        this.efficiency = efficiency;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(brand, capacity, type, fuelType, efficiency);
    }
}
