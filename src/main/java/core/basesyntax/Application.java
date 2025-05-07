package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine gmEngine = new Engine(100,2000,300,"GM","GF150");
        Car car = new Car(gmEngine, "green","GM",4,200);
        System.out.println(car);
        Car clonedCar = car.clone();
        System.out.println(clonedCar);
        car.getEngine().setModel("GF200");
        System.out.println(clonedCar);
        System.out.println(car);
    }
}
