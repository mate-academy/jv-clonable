package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("Toyota", 200, 84, "Gasoline", 4);
        Car car = new Car("Toyota", "Red", 2017, 200, "Japan");
        car.setEngine(engine);
        Car carClone = car.clone();
        car.getEngine().setPower(190);
        System.out.println(car.toString());
        System.out.println(carClone.toString());
    }
}
