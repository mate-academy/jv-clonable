package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String model;
    private int year;
    private String colour;
    private String numbers;

    public Car(Engine engine, String model, int year, String colour, String numbers) {
        this.engine = engine;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.numbers = numbers;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", model='" + model + '\''
                + ", year=" + year
                + ", colour='" + colour + '\''
                + ", numbers='" + numbers + '\''
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Couldn`t clone Car", e);
        }
    }
}
