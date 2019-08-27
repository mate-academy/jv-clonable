package core.basesyntax;

public class Car implements Cloneable {

    private String modelName;
    private String type;
    private Engine engine;
    private int seats;
    private int maxSpeed;

    public Car(String modelName, String type, Engine engine, int seats, int maxSpeed) {
        this.modelName = modelName;
        this.type = type;
        this.engine = engine;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(modelName, type, engine.clone(), seats, maxSpeed);
    }
}
