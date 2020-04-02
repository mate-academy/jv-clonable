package core.basesyntax;

public class Engine implements Cloneable {
    private int capacity;
    private String typeFuel;
    private boolean turbine;
    private double cylinderBore;
    private double torque;

    @Override
    public Engine clone() {
        Engine clonedEngine = new Engine();
        clonedEngine.capacity = this.capacity;
        clonedEngine.typeFuel = this.typeFuel;
        clonedEngine.turbine = this.turbine;
        clonedEngine.cylinderBore = this.cylinderBore;
        clonedEngine.torque = this.torque;
        return clonedEngine;
    }
}
