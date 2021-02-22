package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setColor("red");

        Car car = new Car();
        car.setModel("MT");
        car.setColor("red");
        car.setHasEngine(true);
        car.setEngine(engine);
        System.out.println(car);

        Car cloneCar = car.clone();
        System.out.println(cloneCar);
        car.getEngine().setColor("black");
        System.out.println(cloneCar);
        System.out.println(car);

    }
}
