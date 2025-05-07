package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private int coast;
    private int doors;
    private boolean autoTransmission = false;

    Car(Engine engine, String model, int coast, String color) {
        this.engine = engine;
        this.model = model;
        this.coast = coast;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isAutoTransmission() {
        return autoTransmission;
    }

    public void setAutoTransmission(boolean autoTransmission) {
        this.autoTransmission = autoTransmission;
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

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public Car clone() {
        Car clonedCar = null;
        try {
            clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create cat clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car model is " + getModel()
                + "! It would be cost less "
                + coast + "$ just for you buddy. "
                + " Car has " + engine.toString();
    }
}
