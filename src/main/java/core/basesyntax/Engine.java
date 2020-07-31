package core.basesyntax;

public class Engine implements Cloneable {
    private int cylinder;
    private String model;
    private String speedTransmission;
    private int horsePower;
    private int fuelTankCapacity;

    public Engine(int cylinder, String model, String speedTransmission,
                  int horsePower, int fuelTankCapacity) {
        this.cylinder = cylinder;
        this.model = model;
        this.speedTransmission = speedTransmission;
        this.horsePower = horsePower;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(cylinder, model, speedTransmission, horsePower, fuelTankCapacity);
    }

}
