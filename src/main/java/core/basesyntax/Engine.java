package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String name;
    private int age;
    private int cylinder_number;
    private int weight;

    public Engine(String manufacturer, String name, int age, int cylinder_number, int weight) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.age = age;
        this.cylinder_number = cylinder_number;
        this.weight = weight;
    }

    public Engine clone() throws CloneNotSupportedException {
        return new Engine(manufacturer, name, age, cylinder_number, weight);
    }
}
