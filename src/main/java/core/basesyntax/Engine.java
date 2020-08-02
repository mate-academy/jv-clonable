package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String name;
    private int age;
    private int cylinderNumber;
    private int weight;

    public Engine(String manufacturer, String name, int age, int cylinderNumber, int weight) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.age = age;
        this.cylinderNumber = cylinderNumber;
        this.weight = weight;
    }

    public Engine clone() throws CloneNotSupportedException {
        return new Engine(manufacturer, name, age, cylinderNumber, weight);
    }
}
