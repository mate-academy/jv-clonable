package core.basesyntax;

public class Engine implements Cloneable {
    private double power;
    private double capacity;
    private double fuel;
    private double oil;
    private int IdNumber ;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    public double getPower() {
        return power;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getFuel() {
        return fuel;
    }

    public double getOil() {
        return oil;
    }

    public int getIdNumber() {
        return IdNumber;
    }
}
