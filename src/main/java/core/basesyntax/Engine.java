package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int combustionChambersVolume;
    private int power;
    private int torque;
    private int fuelConsumption;

    public Engine(String name, int combustionChambersVolume,
                  int power, int torque, int fuelConsumption) {
        name = name;
        combustionChambersVolume = combustionChambersVolume;
        power = power;
        torque = torque;
        fuelConsumption = fuelConsumption;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
