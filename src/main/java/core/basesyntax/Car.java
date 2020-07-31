package core.basesyntax;

public class Car implements Cloneable{

    private String model;
    private int maxSpeed;
    private int amountOfDoors;
    private boolean isTruck;
    private Engine engine;

    Car(String model, int maxSpeed, int amountOfDoors, boolean isTruck, Engine engine) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.amountOfDoors = amountOfDoors;
        this.isTruck = isTruck;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void describe() {
        System.out.println(model + " " + maxSpeed + " " + amountOfDoors + " " + isTruck + " " + engine);
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car (model, maxSpeed, amountOfDoors, isTruck, engine.clone());
    }
}
