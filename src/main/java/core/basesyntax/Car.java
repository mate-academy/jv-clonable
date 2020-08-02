package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private String model;
    private int year;
    private int id;
    private boolean isNew;

    public Car(String name, String model, int year, int id, boolean isNew) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.id = id;
        this.isNew = isNew;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(name, model, year, id, isNew);
    }
}
