package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("Tesla Model S", "Tesla Model S", 10000, 2017, 51000);
        Car car = new Car(engine,"Tesla", 600000, "Tesla", 2017);
        System.out.println(car);
        Car clonedCar = car.clone();
        car.setPrice(11111);
        engine.setModel("Tesla Model 3");
        System.out.println(clonedCar);
        System.out.println(car);
    }
}
