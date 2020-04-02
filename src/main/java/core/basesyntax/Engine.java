package core.basesyntax;

public class Engine implements Cloneable {
    private int capacity;
    private String typeFuel;
    private boolean turbine;
    private double cylinderBore;
    private double torque;

    public Engine(int capacity, String typeFuel, boolean turbine,
                  double cylinderBore, double torque) {
        this.capacity = capacity;
        this.typeFuel = typeFuel;
        this.turbine = turbine;
        this.cylinderBore = cylinderBore;
        this.torque = torque;

    }

    @Override
    public Engine clone() {
        return new Engine(capacity, typeFuel, turbine, cylinderBore, torque);
    }
}
