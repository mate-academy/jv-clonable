package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int year;
    private int horsePowers;
    private Engine engine;

    public Car(String model, String color, int year, int horsePowers, Engine engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.horsePowers = horsePowers;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
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

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public Car clone() {
        Car cloneCar = new Car(model, color, year, horsePowers, engine);
        cloneCar.setEngine(engine.clone());
        return cloneCar;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", horsePowers=" + horsePowers
                + ", engine=" + engine + '}';
    }
}
