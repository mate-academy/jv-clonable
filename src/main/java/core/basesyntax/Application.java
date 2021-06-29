package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine("Mercedes", "Germany",
                1.6, "Gas", "Steel");

        Car car = new Car("A Sedan", "2020", 200, "grey", engine);

        Car carClone = car.clone();

        car.getEngine().setEnginePower(2.0);

        System.out.println(car.toString());
        System.out.println(carClone.toString());
    }
}
