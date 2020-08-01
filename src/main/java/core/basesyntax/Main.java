package core.basesyntax;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Test
        Car zaz = new Car("zaz", "red", 1800, 200, 5);
        zaz.setEngine(6, 1800, 2000, "disel", "akpp");
        Car clonedZaz = (Car) zaz.clone();

        clonedZaz.setName("bmw");
        clonedZaz.setColor("green");
        clonedZaz.setEngine(3, 1, 200, "benzin", "mech");

        zaz.startEngine();
        zaz.stopEngine();

        clonedZaz.startEngine();
        clonedZaz.stopEngine();

        zaz.setMaxSpeed(300);

        System.out.println(zaz.toString());
        System.out.println(clonedZaz.toString());

    }
}
