package core.basesyntax;

public class Car implements Cloneable {
    private String maker;
    private String model;
    private Engine engine;
    private String color;
    private int seats;

    public Car(String maker, String model, Engine engine, String color, int seats) {
        this.maker = maker;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{"
                + "maker='" + maker + '\''
                + ", model='" + model + '\''
                + ", engine=" + engine
                + ", color='" + color + '\''
                + ", seats=" + seats
                + '}';
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not create car clone", e);
        }
    }
}
