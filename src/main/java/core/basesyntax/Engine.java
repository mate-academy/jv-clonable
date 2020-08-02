package core.basesyntax;

public class Engine implements Cloneable {
    private String modelName;
    private String type;
    private double displacement;
    private double maximumPowerOutput;
    private int numberOfCylinder;

    public Engine(String modelName, String type, double displacement,
                  double maximumPowerOutput, int numberOfCylinder) {
        this.modelName = modelName;
        this.type = type;
        this.displacement = displacement;
        this.maximumPowerOutput = maximumPowerOutput;
        this.numberOfCylinder = numberOfCylinder;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(modelName, type, displacement, maximumPowerOutput, numberOfCylinder);
    }
}
