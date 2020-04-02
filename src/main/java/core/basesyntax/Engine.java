package core.basesyntax;

public class Engine implements Cloneable {
    private String configuration;
    private String serialNumber;
    private int power;
    private int volume;
    private int numberOfCylinders;

    public Engine(String configuration, String s, int power, int volume, int numberOfCylinders) {
        this.configuration = configuration;
        serialNumber = s;
        this.power = power;
        this.volume = volume;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(configuration,serialNumber,power,volume,numberOfCylinders);
    }

}
