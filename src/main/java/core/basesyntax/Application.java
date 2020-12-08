package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine.EngineBuilder()
                .setModel("Yamaha")
                .setHorsepower(400)
                .setVolume(4)
                .setTorque(600)
                .setFuelType("gasoline")
                .build();
        Car car = new Car.CarBuilder()
                .setColor("Red")
                .setModel("Tesla")
                .setEngine(engine)
                .setYear(2020)
                .setPrice(200000)
                .build();
        Car clonedCar = car.clone();
        System.out.println(car);
        System.out.println(clonedCar);
        engine.setHorsepower(700);
        System.out.println(car);
        System.out.println(clonedCar);
        Engine engine1 = car.getEngine();
        Engine engine2 = clonedCar.getEngine();
        System.out.println(engine1);
        System.out.println(engine2);
    }
}
