package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int torque;
    private String fuel;
    private int volume;
    private String brand;

    public Engine(int power, int torque, String fuel, int volume, String brand) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
        this.brand = brand;
    }

    public String toString() {
        return "Power: " + this.power + ", Torque: " + this.torque + ", Fuel: " + this.fuel
                + ", Volume: " + this.volume + ", Brand: " + this.brand;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone engine", e);
        }
    }
}
