package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine.EngineBuilder().setEngineCapacity(1000).build();
        Car car = new Car.CarBuilder().setModel("Mitsubishi").setColor("Blue").setDoorAmount(5)
                .setSeatsAmount(4).setYear(2008).setEngine(engine).build();
        Car secondCar = car.clone();
        System.out.println(car.toString());
        secondCar.getEngine().setEngineCapacity(500);
        System.out.println(car);
        System.out.println(secondCar);
    }
}
