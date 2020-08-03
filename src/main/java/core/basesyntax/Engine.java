package core.basesyntax;

public class Engine implements Cloneable {
    private int numberOfCylinders;
    private double displacement;
    private int horsePower;
    private int torque;
    private String engineType;

    public Engine(int numberOfCylinders, double displacement, int horsePower,
                  int torque, String engineType) {
        this.numberOfCylinders = numberOfCylinders;
        this.displacement = displacement;
        this.horsePower = horsePower;
        this.torque = torque;
        this.engineType = engineType;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(numberOfCylinders, displacement, horsePower, torque, engineType);
    }
}
