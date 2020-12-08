package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEngineModel("ZX101");
        engine.setHorsePower(300);

        Car car = new Car();
        car.setCarName("Audi");
        car.setCarModel("A4");
        car.setCarBody("sedan");
        car.setEngine(engine);

        Car carClone = car.clone();
        car.getEngine().setEngineModel("XX303");
        car.getEngine().setHorsePower(300);
        System.out.println(carClone);
        System.out.println(car);
    }
}
