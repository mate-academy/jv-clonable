package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String type;
    private int year;
    private int horsePower;
    private Engine engine;

    public Car(String name, String color, String type, int year, int horsePower) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.year = year;
        this.horsePower = horsePower;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        Car carClone = new Car(this.name, this.color, this.type, this.year, this.horsePower);
        carClone.engine = engine.clone();
        return carClone;
    }

    @Override
    public String toString() {
        return "Car{"
                + "name: " + name
                + "; color: " + color
                + "; type car: " + type
                + "; year of issue: " + year
                + "; horse power: " + horsePower
                + "}";
    }
}
