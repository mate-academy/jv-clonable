package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setSystemCooling(true);
        engine.setSystemIgnition(true);
        engine.setSystemLubrication(true);
        engine.setSystemStarting(true);
        engine.setSystemSupply(true);
        System.out.println(engine);
        Car car = new Car();
        car.setModel("Audi");
        car.setColor("Green");
        car.setCountDoors(2);
        car.setCountWheels(4);
        car.setEngine(engine);
        Car carClone = car.clone();
        car.getEngine().setSystemSupply(false);
        System.out.println(car);
        System.out.println(carClone);
        System.out.println(car.equals(carClone));
    }
}
