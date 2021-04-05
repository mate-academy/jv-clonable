package core.basesyntax;

public class Application {
    private static final String CUSTOM_USED_FUEL = "Diesel";

    public static void main(String[] args) {

        Car car = new Car();
        Car clonedCar = car.clone();
        car.getEngine().setUsedFuel(CUSTOM_USED_FUEL);
        System.out.println(car.toString());
        System.out.println(clonedCar.toString());
    }
}
