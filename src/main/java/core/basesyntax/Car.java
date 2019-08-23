package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String registrationNumber;
    private String color;
    private Engine engine;
    private int age;

    public Car(String name, String registrationNumber, String color, Engine engine, int age) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.engine = engine;
        this.age = age;
    }

    public Car clone() {
        return new Car(new String(name), new String(registrationNumber),
                new String(color), engine.clone(), age);
    }
}
