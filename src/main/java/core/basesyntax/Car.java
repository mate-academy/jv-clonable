package core.basesyntax;

public class Car implements Cloneable {
    private int year;
    private String model;
    private String color;
    private String type;
    private Engine engine;

    public Car(int year, String model, String color, String type, Engine engine) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.type = type;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: " + "year = " + year
                + " model = " + model
                + " color = " + color
                + " type = " + type
                + " engine = " + engine;
    }

    @Override
    public Car clone() {
        Car clonedCar = null;
        try {
            clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not clone class", e);
        }
    }
}
