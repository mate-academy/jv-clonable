package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int horsepower;
    private double volume;
    private int torque;
    private String transmission;

    public Engine(String type, int horsepower, double volume, int torque,
                  String transmission) {
        this.type = type;
        this.horsepower = horsepower;
        this.volume = volume;
        this.torque = torque;
        this.transmission = transmission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void start() {
    }

    public void stop() {
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(this.type, this.horsepower, this.volume, this.torque, this.transmission);
    }
}
