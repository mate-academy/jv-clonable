package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setDiameter(88);
        Car car = new Car("audi", "red", 1999, 220, engine);
        Car carClone = car.clone();
        System.out.println(car);
        System.out.println(carClone);
        car.getEngine().setDiameter(95);
        System.out.println(car);
        System.out.println(carClone);
    }
}
