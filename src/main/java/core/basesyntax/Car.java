package core.basesyntax;

public class Car implements Cloneable {
    private String type;
    private String manufacturer;
    private int productionYear;
    private int speed;
    private Engine engine;

    @Override
    public Car clone() {
        Car car = new Car();
        car.type = type;
        car.manufacturer = manufacturer;
        car.productionYear = productionYear;
        car.speed = speed;
        car.engine = engine;
        return car;
    }
}
