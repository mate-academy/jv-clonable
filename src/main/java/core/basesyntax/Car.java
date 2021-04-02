package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int number;
    private Engine engine;
    private String color;
    private int gasolineVolume;

    public Car(String model, int number, Engine engine, String color, int gasolineVolume) {
        this.model = model;
        this.number = number;
        this.engine = engine;
        this.color = color;
        this.gasolineVolume = gasolineVolume;
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
            throw new RuntimeException("Can't clone Car!", e);
        }
    }

    @Override
    public String toString() {
        return "Car{model='" + model + '\'' + ", number=" + number
                + ", engine=" + engine + ", color='" + color + '\''
                + ", gasolineVolume=" + gasolineVolume + '}';
    }
}
