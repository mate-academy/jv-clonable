package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("AAA", "gazoline", 2.0, 250, 8);
        Car car = new Car("Touarage", "Volkswagen", "Black", 280);
        car.setEngine(engine);
        Car cloneCar = car.clone();
        car.getEngine().setTypeOfFuel("diesel");
        System.out.println(car.toString());
        System.out.println(cloneCar.toString());
    }
}
