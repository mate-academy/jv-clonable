package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(200, 5020454, "P85D", "Electrcical", 0.9);
        Car car = new Car("Tesla Model S", "Sedan", 400, 60000, engine);
        Car carClone = car.clone();
        car.setPrice(80000);
        engine.setHorsePower(400);
        System.out.println(carClone.toString());
        System.out.println(car.toString());
    }
}
