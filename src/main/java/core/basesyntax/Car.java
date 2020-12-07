package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int passengers;
    private int year;
    private Engine engine;

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

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "model='"
                + model + '\''
                + ", color='" + color + '\''
                + ", passengers=" + passengers
                + ", year=" + year
                + ", engine=" + engine
                + '}';
    }
}
