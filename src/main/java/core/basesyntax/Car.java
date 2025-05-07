package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String type;
    private int speed;
    private int price;
    private Engine engine;

    public Car(String model, String type, int speed, int price, Engine engine) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(model, type, speed, price, engine.clone());
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", type='" + type + '\''
                + ", speed=" + speed
                + ", price=" + price
                + ", engine=" + engine
                + '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
