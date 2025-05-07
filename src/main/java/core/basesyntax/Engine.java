package core.basesyntax;

public class Engine implements Cloneable {
    private String fuelType;
    private double engineVolume;
    private String cylindersConfiguration;
    private int cylindersQuantity;
    private int horsePower;

    public Engine(String fuelType, double engineVolume, String cylindersConfiguration,
                  int cylindersQuantity, int horsePower) {
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
        this.cylindersConfiguration = cylindersConfiguration;
        this.cylindersQuantity = cylindersQuantity;
        this.horsePower = horsePower;
    }

    public Engine(Engine originalEngine) {
        this.fuelType = originalEngine.getFuelType();
        this.engineVolume = originalEngine.getEngineVolume();
        this.cylindersConfiguration = originalEngine.getCylindersConfiguration();
        this.cylindersQuantity = originalEngine.getCylindersQuantity();
        this.horsePower = originalEngine.getHorsePower();
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCylindersConfiguration() {
        return cylindersConfiguration;
    }

    public void setCylindersConfiguration(String cylindersConfiguration) {
        this.cylindersConfiguration = cylindersConfiguration;
    }

    public int getCylindersQuantity() {
        return cylindersQuantity;
    }

    public void setCylindersQuantity(int cylindersQuantity) {
        this.cylindersQuantity = cylindersQuantity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine [fuelType=" + fuelType
                + ", engineVolume=" + engineVolume
                + ", cylindersConfiguration=" + cylindersConfiguration
                + ", cylindersQuantity=" + cylindersQuantity
                + ", horsePower=" + horsePower + "]";
    }

    @Override
    protected Engine clone() {
        return new Engine(this);
    }
}
