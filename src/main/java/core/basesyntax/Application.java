package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("Diesel", 2000, 185, 450, 6);

        Car car = new Car("BMW", "Black", 2015, 25000, engine);

        Car carClone = car.clone();
        car.getEngine().setFuel("Gasoline");

        System.out.println(car.toString());
        System.out.println(carClone.toString());
    }
}
