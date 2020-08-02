package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int horsePover;
    private int age;
    private double volume;
    private double consumption;

    public Engine(String type, int horsePover, int age, double volume, double consumption) {
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        Engine engine1 = new Engine(type, horsePover, age, volume, consumption);
        return engine1;
    }
}
