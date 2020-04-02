package core.basesyntax;

public class Engine implements Cloneable {
    private int age;
    private String manufacturer;
    private String model;
    private int width;
    private int length;

    public Engine(int age, String manufacturer, String model, int width, int length) {
        this.age = age;
        this.manufacturer = manufacturer;
        this.model = model;
        this.width = width;
        this.length = length;
    }

    public Engine clone() {
        return new Engine(age, manufacturer, model, width, length);
    }
}
