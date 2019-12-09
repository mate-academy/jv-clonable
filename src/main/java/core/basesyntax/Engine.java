package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private String cylinders;
    private int torqueMoment;
    private int rotationSpeed;
    private int sd;

    public Engine(int power, String cylinders, int torqueMoment, int rotationSpeed, int sd) {
        this.power = power;
        this.cylinders = cylinders;
        this.torqueMoment = torqueMoment;
        this.rotationSpeed = rotationSpeed;
        this.sd = sd;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Engine(power, cylinders, torqueMoment, rotationSpeed, sd);
    }
}
