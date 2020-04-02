package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int volume;
    private int power;
    private int accelerationTime;
    private int torque;

    public Engine(String name, int volume, int power, int accelerationTime, int torque) {
        this.name = name;
        this.volume = volume;
        this.power = power;
        this.accelerationTime = accelerationTime;
        this.torque = torque;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAccelerationTime(int accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public int getAccelerationTime() {
        return accelerationTime;
    }

    public int getTorque() {
        return torque;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
