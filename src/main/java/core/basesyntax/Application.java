package core.basesyntax;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModel("V12");
        engine.setManufactureDate(new Date());

        Car car = new Car();
        car.setEngine(engine);

        Car carClone = car.clone();
        carClone.getEngine().setModel("V8");

        System.out.println(car);
        System.out.println(carClone);
    }
}
