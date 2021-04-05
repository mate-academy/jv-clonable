package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String producer;
    private String fuelType;
    private int yearOfProduction;
    private int enginePower;

    public Engine(String model, String producer, String fuelType,
                  int yearOfProduction, int enginePower) {
        this.model = model;
        this.producer = producer;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getFuelType(String gasoline) {
        return fuelType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", producer='" + producer + '\''
                + ", fuelType='" + fuelType + '\''
                + ", yearOfProduction'" + yearOfProduction + '\''
                + ", enginePower='" + enginePower + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone object", e);
        }
    }
}
