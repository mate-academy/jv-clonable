package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String quality;
    private String fuelType;
    private float engineSize;
    private int horsePower;

    public Engine(String model, String quality, String fuelType, float engineSize, int horsePower) {
        this.model = model;
        this.quality = quality;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", quality='" + quality + '\''
                + ", fuelType='" + fuelType + '\''
                + ", engineSize=" + engineSize
                + ", horsePower=" + horsePower + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }
}
