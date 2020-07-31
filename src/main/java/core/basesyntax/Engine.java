package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int volumeOfChamber;
    private String combustion;
    private int compression;
    private int power;

    public Engine(String name, int volumeOfChamber, String combustion, int compression, int power) {
        this.name = name;
        this.volumeOfChamber = volumeOfChamber;
        this.combustion = combustion;
        this.compression = compression;
        this.power = power;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, volumeOfChamber, combustion, compression, power);
    }
}
