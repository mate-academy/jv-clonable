package core.basesyntax;

public class Engine implements Cloneable {
    private int cylinderDiameter;
    private int pistonStroke;
    private int crankRadius;
    private double engineDisplacement;
    private int enginePower;

    public Engine(int cylinderDiameter, int pistonStroke, int crankRadius,
                  double engineDisplacement, int enginePower) {
        this.cylinderDiameter = cylinderDiameter;
        this.pistonStroke = pistonStroke;
        this.crankRadius = crankRadius;
        this.engineDisplacement = engineDisplacement;
        this.enginePower = enginePower;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(cylinderDiameter, pistonStroke, crankRadius,
                engineDisplacement, enginePower);
    }
}
