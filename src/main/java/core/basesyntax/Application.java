package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine.EngineBuilder(4,"4554").build();
        Car car = new Car.CarBuilder("5",engine).build();

        Car carClone = car.clone();

        System.out.println(car.toString());
        System.out.println(carClone.toString());

    }
}
