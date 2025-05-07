package core.basesyntax;

public class Engine implements Cloneable {
    private double capacity;
    private String type;
    private int power;
    private int pollutionLevel;
    private int horsePower;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(int pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{" + "capacity=" + capacity
                + ", type='" + type + '\''
                + ", power=" + power
                + ", pollutionLevel=" + pollutionLevel
                + ", horsePower=" + horsePower
                + '}';
    }
}
