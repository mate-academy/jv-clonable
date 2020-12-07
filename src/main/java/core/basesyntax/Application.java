package core.basesyntax;

import core.basesyntax.types.CarBodyStyles;
import core.basesyntax.types.CarBrand;
import core.basesyntax.types.EngineManufacturers;
import core.basesyntax.types.EngineTypes;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(EngineTypes.Electric, 6, 50, 2000, EngineManufacturers.Honda);
        Car car = new Car(engine, CarBodyStyles.Buggy, CarBrand.Honda, 2010, "Blue");
        Car carClone = car.clone();
        carClone.setYearCreate(2012);
        carClone.setBrand(CarBrand.BMW);
        carClone.setBodyStyle(CarBodyStyles.Minivan);
        carClone.setColor("White");
        System.out.println(car);
        System.out.println(carClone);

    }
}
