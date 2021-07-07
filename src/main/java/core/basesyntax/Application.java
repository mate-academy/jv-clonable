package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine(150, 100001, 1500, "Maybach", 1999);
        Car tesla = new Car(engine, "Cybertruck", "black", "john", 2021);
        Car teslaClone = tesla.clone();
        tesla.getEngine().setPower(250);
        System.out.println(tesla.toString());
        System.out.println(teslaClone.toString());
    }
}
