package core.basesyntax;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine(100, 4, 20, 200, 40);
        Car car1 = new Car("Volvo", 100, 4, false, engine);

        Car clonedCar = car1.clone();
        clonedCar.setModel("Citroen");

        car1.describe();
        clonedCar.describe();
    }
}
