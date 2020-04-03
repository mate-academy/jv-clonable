package core.basesyntax;

public class Car implements Cloneable {

    private String name;
    private String type;
    private Wheel wheels;
    private Engine engine;
    private Color color;

    public Car(String name, String type, Wheel wheels, Engine engine, Color color) {
        this.name = name;
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\''
                + ", type='" + type + '\''
                + ", wheels=" + wheels
                + ", engine=" + engine
                + ", color=" + color + '}';
    }

    @Override
    public Car clone() {
        return new Car(name, type, wheels.clone(), engine.clone(), color.clone());
    }
}

