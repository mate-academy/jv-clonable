package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine("Munich Plant", 149,
                7800, "S54", 3246);
        Car car = new Car("BMW", 2005, "Wiesmann MF30 Roadster",
                2, true, engine);

        Car cloneCar = car.clone();
        engine.setEnginePower(7400);
        System.out.println(car);
        System.out.println(cloneCar);
    }
}
