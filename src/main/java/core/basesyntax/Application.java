package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(true, true,
                true,true, true);
        Car car = new Car("Audi", 1290, engine,
                "Red", 5);

        Car carClone = car.clone();
        car.getEngine().setCrankshaft(false);

        System.out.println(car.toString());
        System.out.println(carClone.toString());
    }
}
