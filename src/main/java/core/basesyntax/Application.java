package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("v8", "diesel", 400, true, true);
        Car car = new Car("Ford", "white", 2018, true, engine);

        Car clonedCar = car.clone();
        car.getEngine().setName("v4");
        car.getEngine().setType("electric");
        System.out.println(clonedCar);
        System.out.println(car);
    }
}
