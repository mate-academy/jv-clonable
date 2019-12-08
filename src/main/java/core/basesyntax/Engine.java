package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int serialNumber;
    private String brand;
    private boolean available;
    private int size;

    public Engine(int power, int serialNumber, String brand, boolean available, int size) {
        this.power = power;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.available = available;
        this.size = size;
    }

    @Override
    public Engine clone() {
        return new Engine(power, serialNumber, brand, available, size);
    }
}
