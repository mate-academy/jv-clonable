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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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
