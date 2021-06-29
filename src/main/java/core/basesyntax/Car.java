package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String year;
    private int speed;
    private String color;
    private Engine engine;

    public Car(String model, String year, int speed, String color, Engine engine) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Model: " + model
                + ", year: " + year
                + ", speed: " + speed + "km/h,"
                + " color: " + color
                + ", engine: (" + engine.toString() + ")";
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }
}
