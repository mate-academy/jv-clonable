package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int torque;
    private double weight;
    private String company;
    private String fuel;

    public Engine(int power, int torque, double weight, String company, String fuel) {
        this.power = power;
        this.torque = torque;
        this.weight = weight;
        this.company = company;
        this.fuel = fuel;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(this.power, this.torque, this.weight, this.company, this.fuel);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
