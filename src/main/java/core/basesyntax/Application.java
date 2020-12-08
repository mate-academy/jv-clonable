package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setName("M 275 E 60 AL");
        engine.setVolume(6);
        engine.setNumberOfCylinders(12);
        engine.setHorsePower(630);
        engine.setConsumption(17);

        Car car = new Car();
        car.setName("Mercedes-Benz G-Class G 65 AMG");
        car.setTrunkVolume(487);
        car.setTransmission("Automatic");
        car.setMaxSpeed(230);
        car.setEngine(engine);

        Car carClone = car.clone();
        engine.setConsumption(15);

        System.out.println(car.toString());
        System.out.println(carClone.toString());

    }
}
