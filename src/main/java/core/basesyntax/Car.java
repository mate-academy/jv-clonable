package core.basesyntax;

public class Car implements Cloneable {
    private Engine engineOfCar;
    private String manufacturer;
    private int maxSpeed;
    private String color;
    private int weight;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngineOfCar() {
        return engineOfCar;
    }

    public void setEngineOfCar(Engine engineOfCar) {
        this.engineOfCar = engineOfCar;
    }

    public void setManufacturer(String mark) {
        this.manufacturer = manufacturer;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngineOfCar(engineOfCar.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "engineOfCar=" + engineOfCar + ", Manufacturer='" + manufacturer + '\''
                + ", maxSpeed=" + maxSpeed + ", color='" + color + '\''
                + ", weight=" + weight + '}';
    }
}
