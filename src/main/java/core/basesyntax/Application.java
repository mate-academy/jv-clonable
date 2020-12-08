package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine carEngine = new Engine(2.2, 2014, 150, "Toyota", true);
        Car car = new Car("Camry", 2016, carEngine, "Green", 180);
        Car carClone = car.clone();
        car.getEngine().setVolume(1.6);
        System.out.println(car.toString());
        System.out.println(carClone.toString());
    }
}
