package core.basesyntax;

public class Application implements Cloneable {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine("V-Type", 250, 500, 400, 50);
        Car car = new Car(engine, "Koenigsegg", "red", "JH4KA8158NC002596", true, 100000);
        Car carClone = car.clone();
        car.setColor("green");
        System.out.println(car);
        System.out.println(carClone);
    }
}
