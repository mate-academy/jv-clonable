package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private Engine engine;
    private int weight;
    private int year;

    public Car(String name, String color, int weight, int year) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", color='" + color + '\''
                + ", engine=" + engine
                + ", weight=" + weight
                + ", year=" + year
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car car = (Car) super.clone();
            car.setEngine(engine.clone());
            return car;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone a car", e);
        }
    }
}
