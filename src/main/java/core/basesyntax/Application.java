package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(8, 500, 120, 111.9, 120);
        Car car = new Car("toyota", "red", 1999, 20000, engine);

        Car clonedCar = car.clone();
        car.getEngine().setPower(900);
        System.out.println(car);
        System.out.println(clonedCar);
    }
}
