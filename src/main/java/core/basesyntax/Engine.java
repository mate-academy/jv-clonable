package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int horsePower;
    private int mileage;
    private int weight;
    private int age;

    Engine(String type, int horsePower, int mileage, int weight, int age) {
        this.type = type;
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.weight = weight;
        this.age = age;
    }

    public Engine clone() {
        return new Engine(type, horsePower, mileage, weight, age);
    }
}
