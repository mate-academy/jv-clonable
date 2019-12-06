package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int power;
    private int cylinders;
    private float volume;
    private String type;

    public Engine(String name, int power, int cylinders, float volume, String type) {
        this.name = name;
        this.power = power;
        this.cylinders = cylinders;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, power, cylinders, volume, type);
    }
}
