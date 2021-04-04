package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine();
        engine.setType("Single cylinder");
        engine.setCR(17);
        engine.setDisplacement(661);
        engine.setBore(87);
        engine.setStroke(110);

        Car car = new Car("Audi", "red", 200, 4, 5);
        car.setEngine(engine);

        System.out.println(car);
        Car carClone = car.clone();
        engine.setType("Radial");

        System.out.println(carClone);
        System.out.println(car);
    }
}
