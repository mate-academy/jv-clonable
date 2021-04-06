package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(300, "ferrari",
                5, 50, "12334");
        Car car = new Car(2010, "mazda",
                "white", "sedan", engine);
        Engine testEngine = new Engine();
        testEngine.setVinCode("123445");
        Car clonedCar = car.clone();
        car.setEngine(testEngine);
        System.out.println(car);
        System.out.println(clonedCar);
    }
}
