package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("OriginalEngineType", 1, 2, 3, 4);
        Car car = new Car("Audi", "A6", 2007, 70, engine);
        Car clonedCar = car.clone();
        car.getEngine().setType("NewEngineType");
        System.out.println(car);
        System.out.println(clonedCar);
    }
}
