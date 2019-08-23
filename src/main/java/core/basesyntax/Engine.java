package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String fuel;
    private double capacity;
    private double weight;
    private int power;

    public Engine() {

    }

    public Engine(String name, String fuel, double capacity, double weight, int power) {
        this.name = name;
        this.fuel = fuel;
        this.capacity = capacity;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        Engine engine = new Engine();
        engine.setName(this.name);
        engine.setFuel(this.fuel);
        engine.setCapacity(this.capacity);
        engine.setWeight(this.weight);
        engine.setPower(this.power);
        return engine;
    }
}
