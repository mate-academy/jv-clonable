package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private int weight;
    private int number;
    private int power;
    private String manufacturer;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cant clone engine");
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", weight=" + weight +
                ", number=" + number +
                ", power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
