package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int power;
    private double galPerMile;
    private double volume;
    private double torque;

    Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public double getGalPerMile() {
        return galPerMile;
    }

    public void setGalPerMile(double galPerMile) {
        this.galPerMile = galPerMile;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "Engine model is " + model
                + ", power is " + power;
    }
}
