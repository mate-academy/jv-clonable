package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int displacement;
    private int cylinder;
    private int torque;
    private String type;

    public Engine(int power, int displacement,
                  int cylinder, int torque, String type) {
        this.power = power;
        this.displacement = displacement;
        this.cylinder = cylinder;
        this.torque = torque;
        this.type = type;
    }

    @Override
    protected Engine clone() {
        return new Engine(power, displacement, cylinder, torque, type);
    }
}
