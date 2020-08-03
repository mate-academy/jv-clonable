package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private Color color;
    private double weight;
    private String model;
    private boolean isnew;

    public Car() {
        engine = new Engine();
        color = Color.BLUE;
        weight = 2500;
        model = "BMV";
        isnew = true;
    }

    public Car clone() {
        Car car = new Car();
        car.color = color;
        car.engine = engine;
        car.model = model;
        car.weight = weight;
        car.isnew = isnew;
        return car;
    }

}
