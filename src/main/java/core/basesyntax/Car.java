package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int year;
    private int maxSpeed;
    private boolean isNew;
    private String model;

    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public boolean isNew() {
        return isNew;
    }

    public Car setNew(boolean isNew) {
        this.isNew = isNew;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car(Engine engine, int year, int maxSpeed, boolean isNew, String model) {
        this.engine = engine;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.isNew = isNew;
        this.model = model;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        Engine cloneEngine = engine.clone();
        Car cloneCar = new Car(getEngine(), getYear(), getMaxSpeed(), isNew, getModel());
        return cloneCar;
    }
}
