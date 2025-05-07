package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private String manufactured;
    private int year;
    private Engine engine;

    public Car() {

    }

    public Car(String model, String color, String manufactured, int year, Engine engine) {
        this.model = model;
        this.color = color;
        this.manufactured = manufactured;
        this.year = year;
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

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
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
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", manufactured='" + manufactured + '\''
                + ", year=" + year
                + ", engine=" + engine + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Car class", e);
        }
    }
}
