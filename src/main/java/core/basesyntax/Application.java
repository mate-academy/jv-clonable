package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(23, 12, 2019, 3000, "black");
        Car car = new Car(512, 448, 2020, "Audi", "blue", engine);
        Car clonedCar = car.clone();
        car.setYear(2017);
        System.out.println(car.toString());
        System.out.println(clonedCar.toString());
    }
}
