package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine1 = new Engine(12, 34, 1989, "aluminum", 500);

        Car car1 = new Car("audi", "red", 1990, 1600, engine1);

        Car cloneCar1 = car1.clone();

        System.out.println(car1);
        System.out.println(cloneCar1);

        car1.getEngine().setPower(1700);
        cloneCar1.setHorsePowers(2000);
        System.out.println("Made changes:");

        System.out.println(car1);
        System.out.println(cloneCar1);
    }
}
