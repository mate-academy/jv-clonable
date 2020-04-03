package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String model;
    private int speed;
    private boolean isRunning;
    private Engine engine;

    Car(String color, String model, int speed, boolean isRunning, core.basesyntax.Engine engine) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.isRunning = isRunning;
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean getRunning() {
        return isRunning;
    }

    public void setEngine(core.basesyntax.Engine engine) {
        this.engine = engine;
    }

    public core.basesyntax.Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(color, model, speed, isRunning, engine.clone());
    }
}
