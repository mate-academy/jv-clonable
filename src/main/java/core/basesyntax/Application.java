package core.basesyntax;

import core.basesyntax.types.CarBodyStyle;
import core.basesyntax.types.CarBrand;
import core.basesyntax.types.EngineManufacturers;
import core.basesyntax.types.EngineType;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine(EngineType.ELECTRIC, 6, 50, 2000, EngineManufacturers.HONDA);
        Car car = new Car(engine, CarBodyStyle.BUGGY, CarBrand.HONDA, 2010, "Blue");
        Car carClone = car.clone();
        Engine engineClone = engine.clone();

        carClone.setYearCreate(2012);
        carClone.setBrand(CarBrand.BMW);
        carClone.setBodyStyle(CarBodyStyle.MINIVAN);
        carClone.setColor("White");
        carClone.setEngine(engineClone);

        engineClone.setPower(2500);
        engineClone.setEngineType(EngineType.DIESEL);
        engineClone.setEngineDisplacement(45.2);
        engineClone.setEngineManufacturers(EngineManufacturers.NISSAN);
        engineClone.setCylinders(8);

        System.out.println(car);
        System.out.println(carClone);

    }
}
