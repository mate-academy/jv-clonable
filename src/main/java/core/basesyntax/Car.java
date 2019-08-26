package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String type;
    private int topSpeed;
    private int mileage;
    private Engine engine;

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = new Car();
        car.name = this.name;
        car.color = this.color;
        car.type = this.type;
        car.topSpeed = this.topSpeed;
        car.mileage = this.mileage;
        return car;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean startEngine(Engine engine) {
        return true;
    }
}
