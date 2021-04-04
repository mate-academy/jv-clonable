package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("A1", "pure3", 4, 15.0, 22.0);
        Car car = new Car("BMW", "white", "4x4", 22500.0, engine);
        Car carClone = car.clone();
        car.getEngine().setNumberOfCylinders(6);
        System.out.println("Car: " + car);
        System.out.println("Cloned car: " + carClone);
    }
}
