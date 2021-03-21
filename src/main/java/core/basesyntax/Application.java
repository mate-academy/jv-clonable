package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setPower(2000);
        engine.setModel("Mustang");
        engine.setTurbineCount(16);
        engine.setWhoDevelop("Germany");
        engine.setWasRepaired(false);

        Car car = new Car();
        car.setColor("red");
        car.setModel("Lamborghini");
        car.setOwner("Vladislav");
        car.setYear(2021);
        car.setEngine(engine);

        Engine newEngine = new Engine();
        newEngine.setPower(5000);
        newEngine.setModel("Volvo");
        newEngine.setTurbineCount(8);

        Car clonedCar = car.clone();
        car.setEngine(newEngine);

        System.out.println(car);
        System.out.println(clonedCar);
    }
}
