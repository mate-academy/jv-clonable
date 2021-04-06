package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Engine engine = new Engine(1500, "BMW", 10000, 2018, true);
        Car car = new Car(engine,"red", "BMW", 10000, 2018, true);
        Car clonedCar = car.clone();
        System.out.println("car " + car);
        System.out.println("clonedCar " + clonedCar);
        car.getEngine().setPower(2500);
        System.out.println("Attention: we changed engine power!");
        System.out.println("car " + car);
        System.out.println("clonedCar " + clonedCar);
    }
}
