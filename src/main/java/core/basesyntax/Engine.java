package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int speed;
    private int power;
    private int torque;
    private int thrust;

    public Engine(String type, int speed, int power, int torque, int thrust) {
        this.type = type;
        this.speed = speed;
        this.power = power;
        this.torque = torque;
        this.thrust = thrust;
    }

    @Override
    public Engine clone() {
        return new Engine(type, speed, power, torque, thrust);
    }
}
