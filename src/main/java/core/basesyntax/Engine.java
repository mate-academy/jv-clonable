package core.basesyntax;

public class Engine implements Cloneable {
    private String engineModel;
    private String whichFuel;
    private int horsePower;
    private int maxSpeed;
    private int torque;

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getWhichFuel() {
        return whichFuel;
    }

    public void setWhichFuel(String whichFuel) {
        this.whichFuel = whichFuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "engineModel='" + engineModel + '\''
                + ", whichFuel='" + whichFuel + '\''
                + ", horsePower=" + horsePower
                + ", maxSpeed=" + maxSpeed
                + ", torque=" + torque
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create engine clone", e);
        }
    }
}
