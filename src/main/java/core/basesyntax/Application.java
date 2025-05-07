package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setCoast(1000);
        engine.setIssueYear(2020);
        engine.setSpeed(300);

        Car car = new Car();
        car.setName("audi");
        car.setEngine(engine);

        System.out.println(car);
        Car clonedCar = car.clone();
        car.getEngine().setSpeed(2000);
        System.out.println(clonedCar);
        System.out.println(engine);
    }
}
