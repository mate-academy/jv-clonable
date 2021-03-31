package core.basesyntax;

public class Engine implements Cloneable {
    private String factoryNumber;
    private String model;
    private double mileage;
    private double engineVolume;
    private int horsePower;

    public Engine() {

    }

    public Engine(String factoryNumber, String model, double mileage,
                  double engineVolume, int horsePower) {
        this.factoryNumber = factoryNumber;
        this.model = model;
        this.mileage = mileage;
        this.engineVolume = engineVolume;
        this.horsePower = horsePower;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "factoryNumber='" + factoryNumber + '\''
                + ", model='" + model + '\''
                + ", mileage=" + mileage
                + ", engineVolume=" + engineVolume
                + ", horsePower=" + horsePower + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine class", e);
        }
    }
}
