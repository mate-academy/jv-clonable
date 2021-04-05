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

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.engine = engine.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No clones here!", e);
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
