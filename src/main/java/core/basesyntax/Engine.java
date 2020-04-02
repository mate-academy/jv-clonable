package core.basesyntax;

public class Engine implements Cloneable {
    private String fuel;
    private int capacity;
    private int weight;
    private int numberOfCylinders;
    private String modification;

    public Engine(String fuel, int capacity, int weight,
                  int numberOfCylinders, String modification) {
        this.fuel = fuel;
        this.capacity = capacity;
        this.weight = weight;
        this.numberOfCylinders = numberOfCylinders;
        this.modification = modification;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    @Override
    public Engine clone() {
        return new Engine(fuel, capacity, weight, numberOfCylinders, modification);
    }
}
