package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setFuelsType("electric");
        Car bmw = new Car();

        bmw.setColor("red");
        bmw.setSpeed(200);
        bmw.setEngine(engine);
        bmw.toString();
        System.out.println(bmw);

        Car clonedCar = bmw.clone();
        System.out.println(clonedCar);

        bmw.getEngine().setFuelsType("firewood");
        bmw.setColor("white");
        bmw.setSpeed(180);
        System.out.println(bmw);
    }
}
