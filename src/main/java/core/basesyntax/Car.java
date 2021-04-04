package core.basesyntax;

public class Car implements Cloneable {
    private int doors;
    private int wheels;
    private String name;
    private String model;
    private Engine engine;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "doors="
                + doors
                + ", wheels="
                + wheels
                + ", name='"
                + name + '\''
                + ", model='"
                + model + '\''
                + ", engine="
                + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create user clone" + e);
        }
    }
}
