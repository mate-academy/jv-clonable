package core.basesyntax;

public class Engine implements Cloneable {
    private double power;
    private double capacity;
    private double fuel;
    private double oil;
    private int idNumber;

    public Engine(double power, double capacity, double fuel, double oil, int idNumber) {
        this.power = power;
        this.capacity = capacity;
        this.fuel = fuel;
        this.oil = oil;
        this.idNumber = idNumber;
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

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(power, capacity, fuel, oil, idNumber);
    }
}
