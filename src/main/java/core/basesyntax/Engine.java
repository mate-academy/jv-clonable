package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String typeOfFuel;
    private double capacity;
    private int power;
    private int numberOfCylinders;

    public Engine(String model, String typeOfFuel, double capacity,
                  int power, int numberOfCylinders) {
        this.model = model;
        this.typeOfFuel = typeOfFuel;
        this.capacity = capacity;
        this.power = power;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", typeOfFuel='" + typeOfFuel + '\''
                + ", capacity=" + capacity
                + ", power=" + power
                + ", numberOfCylinders=" + numberOfCylinders
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone this Engine", e);
        }
    }
}
