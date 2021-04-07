package core.basesyntax;

public class Engine implements Cloneable {
    private int volume;
    private int horsePower;
    private int consumption;
    private int numberOfCylinders;
    private String name;

    public Engine(int volume1, int i1, int i, int volume, String v8) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "volume=" + volume
                + ", horsePower=" + horsePower
                + ", consumption=" + consumption
                + ", numberOfCylinders=" + numberOfCylinders
                + ", name='" + name + '\''
                + '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Engine cannot be cloned ", e);
        }
    }
}
