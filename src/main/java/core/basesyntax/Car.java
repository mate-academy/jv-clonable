package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String transmission;
    private String type;
    private String wheels;
    private int seats;

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.setEngine(this.engine.clone());
        return clonedCar;
    }

    public Car(Engine engine, String transmission, String type, String wheels, int seats) {
        this.engine = engine;
        this.transmission = transmission;
        this.type = type;
        this.wheels = wheels;
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeels() {
        return wheels;
    }

    public void setWeels(String weels) {
        this.wheels = weels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
