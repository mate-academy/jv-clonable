package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int weight;
    private int maxRpm;
    private String fuel;
    private String color;

    public Engine(int power, int weight, int maxRpm, String fuel, String color) {
        this.power = power;
        this.weight = weight;
        this.maxRpm = maxRpm;
        this.fuel = fuel;
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Engine clone() {
        return new Engine(
             power,
             weight,
             maxRpm,
             fuel,
             color
        );
    }
}
