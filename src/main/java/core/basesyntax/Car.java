package core.basesyntax;

public class Car implements Cloneable {

    private String colour;
    private String name;
    private int year;
    private int speed;
    private Engine engine1;

    public Car(String colour, String name, int year, int speed, Engine engine1) {
        this.colour = colour;
        this.name = name;
        this.year = year;
        this.speed = speed;
        this.engine1 = engine1;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(colour, name, year, speed, engine1.clone());
    }
}
