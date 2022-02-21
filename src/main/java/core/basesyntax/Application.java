package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(450, 2010, "Horse", 8, "Black");
        Car car = new Car(2011, 450, "Red","BMW", engine);
        Car clonedCar = car.clone();
        car.setPower(500);
        System.out.println(car);
        System.out.println(clonedCar);
    }
}
