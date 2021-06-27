package core.basesyntax;

public class Engine implements Cloneable {
    private String modelName;
    private String type;
    private int horsePower;
    private int fuelConsumption;
    private int numberOfCylinders;

    public Engine(String modelName, String type, int horsePower,
                  int fuelConsumption, int numberOfCylinders) {
        this.modelName = modelName;
        this.type = type;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "modelName='" + modelName + '\''
                + ", type='" + type + '\''
                + ", horsePower=" + horsePower
                + ", fuelConsumption=" + fuelConsumption
                + ", numberOfCylinders=" + numberOfCylinders
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create engine clone", e);
        }
    }
}
