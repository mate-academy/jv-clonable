package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String vendor;
    private int sizeX;
    private int sizeY;
    private int sizeZ;

    public Engine(String model, String vendor, int sizeX, int sizeY, int sizeZ) {
        this.model = model;
        this.vendor = vendor;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    @Override
    public Engine clone() {
        return new Engine(model, vendor, sizeX, sizeY, sizeZ);
    }
}
