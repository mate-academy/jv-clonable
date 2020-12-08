package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int horsePower;
    private int weight;
    private double fuelConsumption;
    private double safetyRating;

    public Engine(String model, int horsePower, int weight,
                  double fuelConsumption, int safetyRating) {
        this.model = model;
        this.horsePower = horsePower;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
        this.safetyRating = safetyRating;
    }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(double safetyRating) {
        this.safetyRating = safetyRating;
    }

    @Override
    public String toString() {
        return "Model:" + model + "\n"
                + "Horse Power:" + horsePower + "\n"
                + "Weight:" + weight + "\n"
                + "Fuel Consumption:" + fuelConsumption + "\n"
                + "Safety Rating:" + safetyRating + "\n";
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }
}
