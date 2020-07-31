package core.basesyntax;

public class Car extends Engine implements Cloneable {

    private String model;
    private String type;
    private String countryOfProduction;
    private int yearOfProduction;
    private int price;
    private Engine engine;

    public Car build() {
        Car car = new Car();
        car.model = Car.this.model;
        car.type = Car.this.type;
        car.countryOfProduction = Car.this.countryOfProduction;
        car.yearOfProduction = Car.this.yearOfProduction;
        car.price = Car.this.price;
        car.engine = Car.this.engine.build();
        return car;
    }

    @Override
    public Object clone() {
        Car car = new Car();
        car.build();
        return car;
    }
}
