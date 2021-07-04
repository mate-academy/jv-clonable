package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine(true, 8, 100, true, "petrol");
        Car car = new Car(engine, "blue", 89002, 1, true);
        Car clonedCard = car.clone();
        car.getEngine().setEats("gasoline");
        System.out.println(car);
        System.out.println(clonedCard);
    }
}
