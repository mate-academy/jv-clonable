package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private int age;
    private String country;

    public Car(String name, Engine engine, String color, int age, String country) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.age = age;
        this.country = country;
    }

    @Override
    protected Car clone() {
        try {
            Car carClone = (Car)(Car)(super.clone());
            carClone.engine = engine.clone();
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\''
                + ", engine=" + engine
                + ", color='" + color + '\''
                + ", age=" + age
                + ", country='" + country + '\''
                + '}';
    }
}
