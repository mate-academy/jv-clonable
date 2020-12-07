package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int horsePower;
    private double engineValue;
    private int variatorType;
    private String fuelType;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

    public int getVariatorType() {
        return variatorType;
    }

    public void setVariatorType(int variatorType) {
        this.variatorType = variatorType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", horsePower=" + horsePower
                + ", engineValue=" + engineValue
                + ", variatorType=" + variatorType
                + ", fuelType='" + fuelType + '\''
                + '}';
    }
}
