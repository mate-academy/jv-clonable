package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int horsePower;
    private int age;
    private double volume;
    private double consumption;

    public Engine(String type, int horsePover, int age, double volume, double consumption) {
        this.type = type;
        this.horsePower = horsePover;
        this.age = age;
        this.volume = volume;
        this.consumption = consumption;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(type, horsePower, age, volume, consumption);
    }
}
