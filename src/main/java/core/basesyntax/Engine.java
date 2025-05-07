package core.basesyntax;

public class Engine implements Cloneable {
    private int serialNumber;
    private String type;
    private int capacity;
    private String size;
    private String fuelType;

    @Override
    public String toString() {
        return "Engine{"
                + "number=" + serialNumber
                + ", type='" + type + '\''
                + ", capacity=" + capacity
                + ", size='" + size + '\''
                + ", fuelType='" + fuelType + '\''
                + '}';
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car Clone", e);
        }
    }

    public int getNumber() {
        return serialNumber;
    }

    public void setNumber(int number) {
        this.serialNumber = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Engine setCapacity(int capacity) {
        this.capacity = capacity;
        return null;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
