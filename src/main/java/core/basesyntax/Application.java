package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setVolume(2.0);
        engine.setWeight(500);
        engine.setSerialNumber(1999199);
        engine.setPower(250);
        engine.setManufacturer("Bayerische Motoren Werke");

        Car car = new Car();
        car.setEngineOfCar(engine);
        car.setMark("BMW");
        car.setMaxSpeed(250);
        car.setColor("Black");
        car.setWeight(2000);

        Car carClone = car.clone();
        car.getEngineOfCar().setManufacturer("Munich Motoren Werke");
        System.out.println(car + System.lineSeparator() + carClone);
    }
}
