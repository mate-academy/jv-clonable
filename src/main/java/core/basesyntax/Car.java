package core.basesyntax;

public class Car implements Cloneable {
    private String modelCare;
    private int carSpeed;
    private String carColor;
    private int weight;
    private Engine engine;

    public Car() {
    }

    public Car(String modelCare, int carSpeed, String carColor, int weight, Engine carEngine) {
        this.modelCare = modelCare;
        this.carSpeed = carSpeed;
        this.carColor = carColor;
        this.weight = weight;
        this.engine = carEngine;
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
