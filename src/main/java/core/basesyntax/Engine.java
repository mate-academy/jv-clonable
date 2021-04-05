package core.basesyntax;

public class Engine implements Cloneable {
    private String engineType;
    private int speed;
    private int thrust;
    private int torque;
    private int soundLevel;

    public Engine(String engineType, int speed, int thrust, int torque, int soundLevel) {
        this.engineType = engineType;
        this.speed = speed;
        this.thrust = thrust;
        this.torque = torque;
        this.soundLevel = soundLevel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
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
        return "Engine{"
                + "engineType='" + engineType + '\''
                + ", speed=" + speed
                + ", thrust=" + thrust
                + ", torque=" + torque
                + ", soundLevel=" + soundLevel + '}';
    }
}
