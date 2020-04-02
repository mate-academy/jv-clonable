package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String colour;
    private int doorsCount;
    private int wheelsCount;
    private String brand;

    public Car(Engine engine, String colour, int doorsCount, int wheelsCount, String brand) {
        this.engine = engine;
        this.colour = colour;
        this.doorsCount = doorsCount;
        this.wheelsCount = wheelsCount;
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(
                engine.clone(),
                colour,
                doorsCount,
                wheelsCount,
                brand
        );
    }
}
