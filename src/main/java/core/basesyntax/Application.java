package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        car.setEngine(engine);

        car.setName("BMW");
        car.setColour("black");
        car.setHorsePower(340);
        car.setYear(1996);
        car.setMileage(125000);
        engine.setEngineCapacity(1.8);
        engine.setWorkable(true);
        engine.setNumberOfCylinders(8);
        engine.setYear(1996);
        engine.setTypeOfEngine("petroleum");

        Car clonedCar = car.clone();
        clonedCar.getEngine().setWorkable(false);
        clonedCar.getEngine().setNumberOfCylinders(6);
        clonedCar.getEngine().setYear(1991);

        System.out.println(car);
        System.out.println(clonedCar);

    }
}
