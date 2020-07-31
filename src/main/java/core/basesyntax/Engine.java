package core.basesyntax;

public class Engine implements Cloneable {

    private String model;
    private String driveUnit;
    private String transmission;
    private int volume;
    private int maxPower;

    public Engine(String model, String driveUnit, String transmission,
                   int volume, int maxPower) {
        this.model = model;
        this.driveUnit = driveUnit;
        this.transmission = transmission;
        this.volume = volume;
        this.maxPower = maxPower;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(model, driveUnit, transmission, volume, maxPower);
    }
}
