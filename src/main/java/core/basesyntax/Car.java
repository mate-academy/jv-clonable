package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String type;
    private int year;
    private int horsePower;
    private Engine engine = new Engine();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
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
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
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
