package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String model;
    private String type;
    private int horsePower;
    private int fuelConsumption;

    public Engine(String name, String model, String type, int horsePower, int fuelConsumption) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", type='" + type + '\''
                + ", horsePower=" + horsePower
                + ", fuelConsumption=" + fuelConsumption + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }
}
