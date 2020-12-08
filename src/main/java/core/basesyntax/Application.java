package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setCapacity(3);
        engine.setFuelType("Gasoline");
        engine.setNumber(15262367);
        engine.setType("V8");
        engine.setSize("Monstro");

        Car car = new Car();
        car.setColor("Black");
        car.setCountry("Germany");
        car.setEngine(engine);
        car.setYearMade(2015);
        car.setName("AUDI");

        System.out.println(car);
        System.out.println(engine);

        Car clonedCar = car.clone();
        clonedCar.getEngine().setCapacity(4);
        System.out.println(clonedCar);
    }
}
