package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int numberOfSeats;
    private int weightCapacity;
    private boolean spareTire;
    private Engine engine;

    public Car(String model, String color, int numberOfSeats, int weightCapacity,
               boolean spareTire, Engine engine) {
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.weightCapacity = weightCapacity;
        this.spareTire = spareTire;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public boolean isSpareTire() {
        return spareTire;
    }

    public void setSpareTire(boolean spareTire) {
        this.spareTire = spareTire;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        Car clonedCar =  new Car(this.getModel(), this.getColor(),
                this.getNumberOfSeats(), this.getWeightCapacity(),
                this.isSpareTire(), this.getEngine().clone());
        return clonedCar;
    }
}
