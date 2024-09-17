package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Model;
import core.basesyntax.enums.Size;

public class Car implements Cloneable {
    private Model model;
    private Color color;
    private int speed;
    private Size size;
    private Engine engine;

    public Car(Model model, Color color, int speed, Size size, Engine engine) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.size = size;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model=" + model
                + ", color=" + color
                + ", speed=" + speed
                + ", size=" + size
                + ", engine=" + engine + '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car", e);
        }
    }
}
