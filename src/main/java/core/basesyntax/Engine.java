package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private String serialNumber;
    private int fuelConsumption;
    private int size;
    private String company;

    public Engine(int power, String serialNumber, int fuelConsumption, int size, String company) {
        this.power = power;
        this.serialNumber = serialNumber;
        this.fuelConsumption = fuelConsumption;
        this.size = size;
        this.company = company;
    }

    @Override
    public Engine clone() {
        return new Engine(this.power, this.serialNumber,
                this.fuelConsumption, this.size, this.company);
    }

}
