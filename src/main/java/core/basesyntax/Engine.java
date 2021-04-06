package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int horsePower;
    private double fuelConsuption;
    private int cilindresNumber;
    private String engineLocation;

    public Engine(String type, int horsePower, double fuelConsuption,
                  int cilindresNumber, String engineLocation) {
        this.type = type;
        this.horsePower = horsePower;
        this.fuelConsuption = fuelConsuption;
        this.cilindresNumber = cilindresNumber;
        this.engineLocation = engineLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(double fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    public int getCilindresNumber() {
        return cilindresNumber;
    }

    public void setCilindresNumber(int cilindresNumber) {
        this.cilindresNumber = cilindresNumber;
    }

    public String getEngineLocation() {
        return engineLocation;
    }

    public void setEngineLocation(String engineLocation) {
        this.engineLocation = engineLocation;
    }

    @Override
    public String toString() {
        return "Engine: { type = "
                + type + ", horsePower = "
                + horsePower + ",fuelCosuption = "
                + fuelConsuption + ", cilindresNumber = "
                + cilindresNumber + ", engineLocation = "
                + engineLocation + "}";
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }
}
