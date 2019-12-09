package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int torque;
    private int weight;
    private int cylinders;
    private String cylindersPosition;

    public Engine(int power, int torque, int weight, int cylinders, String cylindersPosition) {
        this.power = power;
        this.torque = torque;
        this.weight = weight;
        this.cylinders = cylinders;
        this.cylindersPosition = cylindersPosition;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getWeight() {
        return weight;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getCylindersPosition() {
        return cylindersPosition;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setCylindersPosition(String cylindersPosition) {
        this.cylindersPosition = cylindersPosition;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(power, torque, weight, cylinders, cylindersPosition);
    }
}
