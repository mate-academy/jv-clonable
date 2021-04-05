package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("KO122", "Gas", 10,
                200, false);
        Car car = new Car(engine, "Audi 5", "White",
                2020, 0.0, true);
        Car clonedCar = car.clone();
        car.getEngine().setGasOrDieselType("Diesel");
        System.out.println("car: " + car.toString());
        System.out.println("clonedCar: " + clonedCar.toString());
    }
}
