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
        Car newCar = new Car(name, type, wheels.clone(), engine.clone(), color.clone());
        return newCar;
    }
}

