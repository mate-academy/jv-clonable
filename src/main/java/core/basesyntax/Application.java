package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("GM", "gasoline",
                6, 3.5, 250);
        Car car = new Car("Tavria", engine, "purple", 2020, 30000);
        Car clonedCar = car.clone();
        clonedCar.setName("magenta");

        System.out.println(car.toString());
        System.out.println(clonedCar.toString());
        System.out.println(car.getEngine().equals(clonedCar.getEngine()));
    }
}

