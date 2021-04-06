package core.basesyntax;

public class Car implements Cloneable {
    private String mark;
    private String model;
    private int year;
    private int maxSpeed;
    private Engine engine;

    public Car(String mark, String model, int year, int maxSpeed, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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
                + "mark='" + mark + '\''
                + ", model='" + model + '\''
                + ", year=" + year
                + ", maxSpeed=" + maxSpeed
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone", e);
        }
    }
}
