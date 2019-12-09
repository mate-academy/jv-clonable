package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String colour;
    private int seats;
    private int doors;
    private Engine engine;

    public Car(
            String model,
            String colour,
            int seats,
            int doors,
            Engine engine
    ) {
        this.model = model;
        this.colour = colour;
        this.seats = seats;
        this.doors = doors;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        Engine engine = this.getEngine().clone();
        car.setEngine(engine);
        return car;
    }
}



