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

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, volume, power, accelerationTime, torque);
    }
}
