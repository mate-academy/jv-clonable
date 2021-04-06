package core.basesyntax;

public class Car implements Cloneable {
    private int weight;
    private String name;
    private int length;
    private int height;
    private Engine engine;

    public Car(int weight, String name, int length, int height, Engine engine) {
        this.weight = weight;
        this.name = name;
        this.length = length;
        this.height = height;
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
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
            throw new RuntimeException("Car don`t clone" + e);
        }
    }

    @Override
    public String toString() {
        return  " name = " + name
                + ", length = " + length
                + ", weight = " + weight
                + ", height = " + height
                + ", engine = " + engine.getName();
    }
}
