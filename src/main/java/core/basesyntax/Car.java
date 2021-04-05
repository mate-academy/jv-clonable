package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int countOfWheels;
    private String model;
    private String color;
    private String name;

    public Car(Engine engine, int countOfWheels, String model, String color, String name) {
        this.engine = engine;
        this.countOfWheels = countOfWheels;
        this.model = model;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine='"
                + engine
                + '\''
                + ", countOfWheels="
                + countOfWheels
                + ", model="
                + model
                + ", color='"
                + color
                + '\''
                + ", name='"
                + name
                + '\''
                + '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone object", e);
        }
    }
}
