package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Engine engine = new Engine("Diesel", 3, 1.3f, 5, 75);

        Car originalCar = new Car("Chevrolet", "Aveo", "hatchback", true, engine);

        Car clonedCar = originalCar.clone();

        originalCar.getEngine().setType("Petrol");

        System.out.println(originalCar.toString());
        System.out.println(clonedCar.toString());
    }
}
