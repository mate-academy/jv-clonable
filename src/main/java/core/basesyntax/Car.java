package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int year;
    private Engine engine;
    private String color;
    private int maxSpeed;

    public Car(String model, int year, Engine engine, String color, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This car can't be cloned", e);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Model: ");
        stringBuilder.append(model).append("\nYear: ").append(year).append("\n")
                .append(engine.toString()).append("\nColor: ").append(color)
                .append("\nMax Speed: ").append(maxSpeed);
        return stringBuilder.toString();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }
}
