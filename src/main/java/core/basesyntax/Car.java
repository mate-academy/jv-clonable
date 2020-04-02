package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String color;
    private double value;
    private Engine engine;

    public Car(String bd, String ml, String clr, double val, Engine eng) {
        brand = bd;
        model = ml;
        color = clr;
        value = val;
        engine = eng;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand, model, color, value, engine);
    }
}
