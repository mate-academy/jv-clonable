package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int year;
    private boolean isTruck;
    private Engine engine;

    public Car(String model, String color, int year, boolean isTruck, Engine engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.isTruck = isTruck;
        this.engine = engine;
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

    public boolean isTruck() {
        return isTruck;
    }

    public void setIsTruck(boolean isTruck) {
        this.isTruck = isTruck;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model = '" + model + "'"
                + ", color = '" + color + "'"
                + ", year = '" + year + "'"
                + ", is Truck = '" + isTruck + "'"
                + ", engine = " + engine
                + "}";
    }

    @Override
    public Car clone() {
        return new Car(model, color, year, isTruck, engine.clone());
    }
}
