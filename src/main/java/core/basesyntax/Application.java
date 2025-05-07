package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("V-Type", 250, 500, 400, 50);
        Car car = new Car(engine, "Koenigsegg", "red", "JH4KA8158NC002596", true, 100000);
        Car carClone = car.clone();
        car.getEngine().setSpeed(500);
        System.out.println(car);
        System.out.println(carClone);
    }
}
