package core.basesyntax;

import java.util.Objects;

public class Car implements Cloneable {
    private int age;
    private int maxSpeed;
    private String modelName;
    private String color;
    private String manufacturer;
    private Engine engine;

    public Car(int age, int maxSpeed, String modelName, String color,
               String manufacturer, Engine engine) {
        this.age = age;
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
        this.color = color;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        super.clone();
        return new Car(this.age, this.maxSpeed, this.modelName, this.color,
                this.manufacturer, this.engine.clone());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{"
                + "age=" + age
                + ", maxSpeed=" + maxSpeed
                + ", modelName='" + modelName + '\''
                + ", color='" + color + '\''
                + ", manufacturer='" + manufacturer + '\''
                + ", engine=" + engine
                + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Car car = (Car) object;
        return getAge() == car.getAge()
                && getMaxSpeed() == car.getMaxSpeed()
                && java.util.Objects.equals(getModelName(), car.getModelName())
                && java.util.Objects.equals(getColor(), car.getColor())
                && java.util.Objects.equals(getManufacturer(), car.getManufacturer())
                && java.util.Objects.equals(getEngine(), car.getEngine());
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getAge(), getMaxSpeed(),
                getModelName(), getColor(), getManufacturer(), getEngine());
    }
}
