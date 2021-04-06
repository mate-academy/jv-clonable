package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int year;
    private boolean isWorks;
    private Engine engine;

    public Car(String name, String color, int year, boolean isWorks, Engine engine) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.isWorks = isWorks;
        this.engine = engine;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isWorks() {
        return isWorks;
    }

    public void setWorks(boolean works) {
        this.isWorks = works;
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
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", isWorks=" + isWorks
                + ", engine=" + engine
                + '}';
    }
}
