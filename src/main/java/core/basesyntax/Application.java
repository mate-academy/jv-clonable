package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine("V12", "diesel", 2600, "2000", 4);
        Car car = new Car("Renault", "blue", "2001", "universal", engine);
        Car clonedCar = car.clone();
        car.getEngine().setTypeOfFuel("petrol");
        System.out.println("Car: " + car);
        System.out.println("Cloned car: " + clonedCar);
    }
}
