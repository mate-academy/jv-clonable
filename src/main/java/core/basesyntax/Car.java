package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int year;
    private Engine engine;
    private String color;
    private int maxSpeed;

    public Car(String model, int year, Engine engine, String color, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This car can't be cloned", e);
        }
    }

    public String toString() {
        return "Model: " + model + "\nYear: " + year
                + "\n" + engine.toString() + "\nColor: " + color
                + "\nMax Speed: " + maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
