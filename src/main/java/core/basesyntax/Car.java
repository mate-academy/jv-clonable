package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String name;
    private int maxSpeed;
    private int price;
    private Engine engine;

    public Car(String color, String name, int maxSpeed, int price, Engine engine) {
        this.color = color;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.engine = engine;
    }

    private Engine getEngine() {
        return engine;
    }

    private void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.setEngine(clonedCar.getEngine().clone());
        return clonedCar;
    }
}
