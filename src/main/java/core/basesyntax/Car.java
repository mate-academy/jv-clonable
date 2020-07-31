package core.basesyntax;

public class Car implements Cloneable {

    private String color;
    private String model;
    private int year;
    private int maxSpeed;
    private Engine engine;

    public Car(String color, String model, int year,
               int maxSpeed, Engine engine) {
        this.color = color;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.model = model;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {

        return new Car(color, model,year,maxSpeed,engine);
    }

}
