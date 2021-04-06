package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine("audi", "diesel", 2017, 230, 600);

        Car car = new Car("yellow", "audi", 2017, 5.7, engine);
        Car carClone = car.clone();

        car.getEngine().setManufacturer("bmw");
        car.getEngine().setSpeed(540);

        System.out.println(car.toString());
        System.out.println(carClone.toString());

    }
}
