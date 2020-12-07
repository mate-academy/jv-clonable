package core.basesyntax;

import core.basesyntax.types.CarBodyStyles;
import core.basesyntax.types.CarBrand;
import core.basesyntax.types.EngineManufacturers;
import core.basesyntax.types.EngineTypes;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(EngineTypes.Electric, 6, 50, 2000, EngineManufacturers.Honda);
        Car car = new Car(engine, CarBodyStyles.Buggy, CarBrand.Honda,2010,"Blue");
        System.out.println(car);

    }
}
