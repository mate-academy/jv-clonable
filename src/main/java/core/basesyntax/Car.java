package core.basesyntax;

public class Car implements Cloneable {
    private String typeOfCar;
    private String color;
    private int maximumSpeed;
    private boolean conditionNew;
    private Engine engine;

    public Car(String typeOfCar, String color, int maximumSpeed,
               boolean conditionNew, Engine engine) {
        this.typeOfCar = typeOfCar;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        this.conditionNew = conditionNew;
        this.engine = engine;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setConditionNew(boolean conditionNew) {
        this.conditionNew = conditionNew;
    }

    public boolean isConditionNew() {
        return conditionNew;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String toString() {
        return " Car's type is " + typeOfCar + "." + "\n"
                + " Color - " + color + "." + "\n"
                + " Maximum speed " + maximumSpeed + "." + "\n"
                + " The condition of the car is new: " + conditionNew + "." + "\n"
                + "\n" + " Engine: " + "\n" + "\n" + engine;
    }

    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone...", e);
        }
    }
}
