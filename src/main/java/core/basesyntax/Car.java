package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private Engine engine;
    private int weight;
    private int manufacturedYear;

    public Car(String brand, String model, Engine engine, int weight, int manufacturedYear) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(brand, model, engine, weight, manufacturedYear);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }
}
