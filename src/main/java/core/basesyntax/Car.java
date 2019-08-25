package core.basesyntax;

public class Car implements Cloneable {

    private int maxSpeed;
    private String brand;
    private String model;
    private String color;
    private Engine engine;

    public Car(final int maxSpeed, final String brand,
               final String model, final String color,
               final Engine engine) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(final Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloneCar = ((Car) super.clone()); // // 'cause every field, except Engine, is primitive or immutable
        cloneCar.setEngine((Engine)engine.clone()); 
        return cloneCar;
    }
}
