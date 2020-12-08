package core.basesyntax;

public class Engine implements Cloneable {
    private int numberOfCylinders;
    private int power;
    private int maxRevolutionsPerMinute;
    private double fuelConsumption;
    private double torque;

    public Engine(int numberOfCylinders, int power, int maxRevolutionsPerMinute,
                  double fuelConsumption, double torque) {
        this.numberOfCylinders = numberOfCylinders;
        this.power = power;
        this.maxRevolutionsPerMinute = maxRevolutionsPerMinute;
        this.fuelConsumption = fuelConsumption;
        this.torque = torque;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxRevolutionsPerMinute() {
        return maxRevolutionsPerMinute;
    }

    public void setMaxRevolutionsPerMinute(int maxRevolutionsPerMinute) {
        this.maxRevolutionsPerMinute = maxRevolutionsPerMinute;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "Number of cylinders: " + this.numberOfCylinders + ", power: "
                + this.power + ", maximum revolutions per minute: "
                + this.maxRevolutionsPerMinute + ", fuel consumption: "
                + this.fuelConsumption + ", torque: " + this.torque;
    }
}
