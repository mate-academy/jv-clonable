package core.basesyntax;

public class Engine implements Cloneable {
    private double cylinderDiameter;
    private double pistonStroke;
    private double volume;
    private double crankDiameter;
    private double capacity;

    public Engine(double cylinderDiameter, double pistonStroke, double volume,
                  double crankDiameter, double capacity) {
        this.cylinderDiameter = cylinderDiameter;
        this.pistonStroke = pistonStroke;
        this.volume = volume;
        this.crankDiameter = crankDiameter;
        this.capacity = capacity;
    }

    public Engine clone() throws CloneNotSupportedException {
        return new Engine(cylinderDiameter, pistonStroke, volume, crankDiameter, capacity);
    }
}
