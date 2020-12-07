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

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
