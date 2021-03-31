package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(
                "№123456789",
                "model", 1000,
                3.5,
                250);
        Car car = new Car(
                "Mercedes",
                "Black",
                "Benz&Cie",
                2000, engine);

        Engine newEngine = new Engine();
        newEngine.setEngineVolume(4);
        newEngine.setHorsePower(300);
        newEngine.setMileage(500);

        Car clonedCar = car.clone();
        car.setEngine(newEngine);

        System.out.println(car);
        System.out.println(clonedCar);
    }
}
