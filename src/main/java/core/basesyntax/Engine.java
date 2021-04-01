package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private double thrust;
    private double torque;
    private double power;
    private double efficiency;

    public Engine(String type, double thrust, double torque, double power, double efficiency) {
        this.type = type;
        this.thrust = thrust;
        this.torque = torque;
        this.power = power;
        this.efficiency = efficiency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Couldn't clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "type='" + type + '\''
                + ", thrust=" + thrust
                + ", torque=" + torque
                + ", power=" + power
                + ", efficiency=" + efficiency
                + '}';
    }
}
