package core.basesyntax;

public class Engine implements Cloneable {
    private int maxRpm;
    private int horsePower;
    private double weight;
    private String model;
    private int manufactureYear;

    public Engine(int maxRpm, int horsePower, double weight, String model, int manufactureYear) {
        this.maxRpm = maxRpm;
        this.horsePower = horsePower;
        this.weight = weight;
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public Engine clone() {
        return new Engine(this.maxRpm, this.horsePower,
                this.weight, this.model, this.manufactureYear);
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
}
