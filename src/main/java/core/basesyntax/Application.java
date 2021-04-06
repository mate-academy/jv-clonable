package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 8, 280, 400, 2005);
        Car car = new Car("Ferrari", "red", 1999, false, engine);
        Car carClone = car.clone();
        car.getEngine().setSpeed(300);
        System.out.println(car);
        System.out.println(carClone);
    }
}
