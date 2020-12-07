package core.basesyntax;

public class Engine implements Cloneable {
    private int serialNumber;
    private int weight;
    private int power;
    private int numberOfGears;
    private int maxSpeed;

    public Engine() {
    }

    public Engine(int serialNumber, int weight, int power, int numberOfGears, int maxSpeed) {
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.power = power;
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "serialNumber=" + serialNumber
                + ", weight=" + weight
                + ", power=" + power
                + ", numberOfGears=" + numberOfGears
                + ", maxSpeed=" + maxSpeed
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can' clone class Engine!", e);
        }
    }
}
