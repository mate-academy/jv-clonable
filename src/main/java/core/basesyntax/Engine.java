package core.basesyntax;

public class Engine implements Cloneable {
    private String fuel;
    private int volume;
    private int horsePower;
    private double torque;
    private int numberOfCylinders;

    public Engine(String fuel, int volume, int horsePower, double torque, int cylindersSumm) {
        this.fuel = fuel;
        this.volume = volume;
        this.horsePower = horsePower;
        this.torque = torque;
        this.numberOfCylinders = cylindersSumm;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Fuel: " + fuel
                + ", volume: " + volume
                + ", horsepower: " + horsePower
                + ", torque: " + torque
                + ", number of cylinders: " + numberOfCylinders;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine!", e);
        }
    }
}
