package core.basesyntax;

public class Engine implements Cloneable {
    private String basicModel;
    private int fuelType;
    private int numberOfCylinder;
    private String compressionRatio;
    private double maxPower;

    public Engine(String basicModel, int fuelType, int numberOfCylinder,
                  String compressionRatio, double maxPower) {
        this.basicModel = basicModel;
        this.fuelType = fuelType;
        this.numberOfCylinder = numberOfCylinder;
        this.compressionRatio = compressionRatio;
        this.maxPower = maxPower;
    }

    @Override
    public Engine clone() {
        return new Engine(basicModel, fuelType, numberOfCylinder, compressionRatio, maxPower);
    }
}
