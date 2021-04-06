package core.basesyntax;

public class Engine implements Cloneable {
    private Integer power;
    private Integer fuelConsumption;
    private String type;
    private double capacity;
    private double torque;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
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
            throw new RuntimeException("Cannot create engine's clone", e);
        }
    }

    @Override
    public String toString() {
        return "Engine {"
                + "power = " + power
                + ", fuelConsumption = " + fuelConsumption
                + ", type = '" + type + '\''
                + ", capacity = " + capacity
                + ", torque = " + torque + '}';
    }
}
