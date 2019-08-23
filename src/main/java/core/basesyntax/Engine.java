package core.basesyntax;

public class Engine implements Cloneable {
    private double power;
    private double capacity;
    private double fuelConsumption;
    private double oilConsumption;
    private int numberOfValves;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getOilConsumption() {
        return oilConsumption;
    }

    public void setOilConsumption(double oilConsumption) {
        this.oilConsumption = oilConsumption;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
