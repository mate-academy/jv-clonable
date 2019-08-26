package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String serialNumber;
    private String fuel;
    private int maxSpeed;
    private double capacity;

    public Engine(String model, String serialNumber,
                  String fuel, int maxSpeed, double capacity) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public Engine() {
        System.out.println("The engine has been installed");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getFuel() {
        return fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(this.getModel(), this.getSerialNumber(),
                this.getFuel(), this.getMaxSpeed(), this.getCapacity());
    }
}
