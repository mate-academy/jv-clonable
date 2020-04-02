package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int torque;
    private int diameter;
    private String model;
    private int serialNumber;

    public Engine(Engine engine) {
        this.power = engine.power;
        this.torque = engine.torque;
        this.diameter = engine.diameter;
        this.model = engine.model;
        this.serialNumber = engine.serialNumber;
    }

    public Engine(int power, int torque, int diameter, String model, int serialNumber) {
        this.power = power;
        this.torque = torque;
        this.diameter = diameter;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(power, torque, diameter, model, serialNumber);
    }
}
