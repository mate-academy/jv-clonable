package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEngineVolume(6.0);
        engine.setDiesel(false);
        engine.setRotary(false);
        engine.setNumberOfCylinders(12);
        engine.setYearProduce(2007);

        Car car = new Car();
        car.setDoors(4);
        car.setWheels(4);
        car.setName("Mercedes");
        car.setModel("s-600");
        car.setEngine(engine);

        Car carClone = car.clone();
        System.out.println(carClone);

        car.getEngine().setEngineVolume(0.4);
        car.getEngine().setDiesel(true);
        car.getEngine().setRotary(false);
        car.getEngine().setNumberOfCylinders(8);
        car.getEngine().setYearProduce(2019);
        System.out.println(car);
    }
}
