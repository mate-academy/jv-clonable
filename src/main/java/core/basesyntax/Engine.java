package core.basesyntax;

public class Engine implements Cloneable {
    private double cylinderDiameter;
    private double pistonStroke;
    private double volume;
    private double crankDiameter;
    private double capacity;

    public Object clone() throws CloneNotSupportedException {
        Engine engine = (Engine)super.clone();
        return engine;
    }
}
