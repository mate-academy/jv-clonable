package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.EnergySource;
import core.basesyntax.enums.Model;
import core.basesyntax.enums.Size;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(Model.HONDA, Color.GRAY, 15, Size.MEDIUM, EnergySource.DIESEL);
        Car car = new Car(Model.HONDA, Color.BLUE, 150, Size.MEDIUM, engine);
        Car clonedCar = car.clone();
        System.out.println(car.equals(clonedCar));
        clonedCar.setEngine(new Engine(Model.ACURA, Color.RED, 20, Size.SMALL, EnergySource.GAS));
        System.out.println(car.equals(clonedCar));
    }
}
