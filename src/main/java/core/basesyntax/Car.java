package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private int maxSpeed;
    private String transmission;
    private int trunkVolume;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='"
                + name + '\'' + ", engine=" + engine
                + ", maxSpeed=" + maxSpeed
                + ", transmission='" + transmission + '\''
                + ", trunkVolume=" + trunkVolume
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car", e);
        }
    }
}
