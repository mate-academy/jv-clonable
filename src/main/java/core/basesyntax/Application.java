package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine("WT8", "GeneralMotors", "diesel", 2016, 4);
        Car car = new Car("X5", "BMW", "white", 2018, engine);
        Car carClone = car.clone();
        engine.getFuelType("gasoline");
        System.out.println(car.toString());
        System.out.println(carClone.toString());
    }
}
