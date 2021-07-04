package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private int registrationPlate;
    private int doorsCount;
    private boolean works;

    public Car(Engine engine, String color, int registrationPlate, int doorsCount, boolean works) {
        this.engine = engine;
        this.color = color;
        this.registrationPlate = registrationPlate;
        this.doorsCount = doorsCount;
        this.works = works;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getRegistrationPlate() {
        return registrationPlate;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public boolean isWorks() {
        return works;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRegistrationPlate(int registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void setWorks(boolean works) {
        this.works = works;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.engine = engine.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car object", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", color='" + color + '\''
                + ", number=" + registrationPlate
                + ", doorsCount=" + doorsCount
                + ", works=" + works
                + '}';
    }
}
