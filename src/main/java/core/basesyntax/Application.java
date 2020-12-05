package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModel("benzine");
        Car car = new Car();
        car.setModel("Kamaz");
        car.setEngine(engine);
        Car carClone = car.clone();
        car.setModel("cloned Kamaz becomes Tesla");
        engine.setModel("battery");
        System.out.println(carClone.toString());
        System.out.println(car.toString());

    }
}
