package core.basesyntax;

public class Car implements Cloneable{
    private String brand;
    private String color;
    private int speed;
    private int doorsNum;
    private Engine carEngine;

    public Car(String brand, String color, int speed, int doorsNum, Engine carEngine) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.doorsNum = doorsNum;
        this.carEngine = carEngine;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDoorsNum() {
        return doorsNum;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Engine engine= (Engine) super.clone();
        engine = (Engine) this.carEngine.clone();
        return engine;
    }
}
