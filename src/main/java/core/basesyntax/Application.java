package core.basesyntax;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("diesel", 3.0,
                "opposed", 6, 320);
        Car car = new Car("Opel", "Vectra",
                "Sedan", "Black", 2000, engine, new BigDecimal(3200));
        Car carClone = new Car(car);
        car.getEngine().setFuelType("petrol");
        System.out.println(car);
        System.out.println(carClone);
    }
}
