package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setPower(200);

        Car car = new Car();
        car.setModel("audi");
        car.setColor("red");
        car.setEngine(engine);

        System.out.println(car);

        Car carClone = car.clone();
        car.getEngine().setPower(300);

        System.out.println(carClone);
        System.out.println(car);
    }
}
