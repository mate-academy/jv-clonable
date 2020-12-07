package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setModel("GTS");
        engine.setHorsePower(240);
        engine.setEngineValue(3.0);
        engine.setVariatorType(12);
        engine.setFuelType("gaz");

        Car car = new Car();
        car.setModel("Dodge");
        car.setEngine(engine);
        car.setEstablishYear(2019);
        car.setVehicleType("coupe");
        car.setPassengersCapacity(2);

        Car clonedCar = car.clone();
    }
}
