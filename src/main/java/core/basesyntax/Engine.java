package core.basesyntax;

public class Engine implements Cloneable {
    private int numberOfCylinders;
    private int horsesPowers;
    private double weight;
    private double length;
    private String metal;

    public Engine(int numberOfCylinders, int horsesPowers, double weight,
                  double length, String metal) {
        this.numberOfCylinders = numberOfCylinders;
        this.horsesPowers = horsesPowers;
        this.weight = weight;
        this.length = length;
        this.metal = metal;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getHorsesPowers() {
        return horsesPowers;
    }

    public void setHorsesPowers(int horsesPowers) {
        this.horsesPowers = horsesPowers;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "numberOfCylinders=" + numberOfCylinders
                + ", horsesPowers=" + horsesPowers
                + ", weight=" + weight
                + ", length=" + length
                + ", metal='" + metal + '\''
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("We can't clone an engine", e);
        }
    }
}
