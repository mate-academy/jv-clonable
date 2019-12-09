package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private Engine engine;
    private int speed;
    private boolean isWork;

    public Car(String model, String color, Engine engine, int speed, boolean isWork) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.speed = speed;
        this.isWork = isWork;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWork() {
        return isWork;
    }

    @Override
    public Car clone() {
        return new Car(model, color, engine, speed, isWork);
    }

}
