package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private double power;
    private double torque;
    private double fuelConsumption;
    private double oilConsumption;

    public Engine(double volume, double power, double torque,
                  double fuelConsumption, double oilConsumption) {
        this.volume = volume;
        this.power = power;
        this.torque = torque;
        this.fuelConsumption = fuelConsumption;
        this.oilConsumption = oilConsumption;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(volume, power, torque, fuelConsumption, oilConsumption);
    }
}
