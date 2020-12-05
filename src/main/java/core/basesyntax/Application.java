package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("K-700", 1000, 10, false, true);
        Car car = new Car("Audi", "Red", 2019, 300, engine);
        Car carclone = car.clone();
        car.getEngine().setStarted(true);
        System.out.println(car);
        System.out.println(carclone);
    }
}
