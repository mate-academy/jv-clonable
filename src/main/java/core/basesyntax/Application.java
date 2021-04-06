package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("SRS", "V8-TPS", 3,4, "gasoline");
        Car car = new Car("subaru", "mechanical", 4, 2021, engine);
        Car cloneCar = car.clone();
        System.out.println(car);
        System.out.println(cloneCar);
        System.out.println(car.getEngine() == cloneCar.getEngine());
    }
}
