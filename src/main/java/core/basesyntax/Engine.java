package core.basesyntax;

public class Engine implements Cloneable{
    private String model;
    private String fuel;
    private String row;
    private double volume;
    private int power;

    public Engine(String model, String row, double volume, int power, String fuel) {
        this.model = model;
        this.row = row;
        this.volume = volume;
        this.power = power;
        this.fuel = fuel;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone!", e);
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public String getRow() {
        return row;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", row='" + row + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
