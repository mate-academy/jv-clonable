package core.basesyntax;

import core.basesyntax.types.CarBodyStyle;
import core.basesyntax.types.CarBrand;
import core.basesyntax.types.EngineManufacturer;
import core.basesyntax.types.EngineType;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine(EngineType.ELECTRIC, 6, 50, 2000, EngineManufacturer.HONDA);
        Car car = new Car(engine, CarBodyStyle.BUGGY, CarBrand.HONDA, 2010, "Blue");
        Car carClone = car.clone();

        carClone.setYearCreate(2012);
        carClone.getEngine().setCylinders(8);

        System.out.println(car);
        System.out.println(carClone);

    }
}
