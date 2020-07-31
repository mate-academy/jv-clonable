package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String model;
    private String manufactureYear;
    private int maxSpeed;
    private Engine engine;

    public Car(String name, String color, String model,
               String manufactureYear, int maxSpeed, Engine engine) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Engine newEngine = this.getEngine().clone();
        newCar.setEngine(newEngine);
        return newCar;
    }
}
