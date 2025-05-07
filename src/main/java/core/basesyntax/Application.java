package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine generalMotors = new Engine(3.0F);
        Car ford = new Car.Builder().setMake("Ford").setEngine(generalMotors).build();
        Car carClone = ford.clone();
        ford.getEngine().setVolume(1.0F);
        System.out.println(ford.toString());
        System.out.println(carClone.toString());
    }
}
