package core.basesyntax;

public class Engine implements Cloneable {
    private int powerOutput;
    private String fuelType;
    private int gears;
    private int topSpeed;
    private int size;

    public Engine(int powerOutput, String fuelType, int gears, int topSpeed, int size) {
        this.powerOutput = powerOutput;
        this.fuelType = fuelType;
        this.gears = gears;
        this.topSpeed = topSpeed;
        this.size = size;
    }

    public int getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(powerOutput, fuelType, gears, topSpeed, size);
    }
}
