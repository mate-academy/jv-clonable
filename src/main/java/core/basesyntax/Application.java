package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine v8 = new Engine(800, 3000, 25, 8, "v8");
        Car zaporozhets = new Car("Zaporozhets", v8, 320, "ZAZ", 1999);

        Car carClone = zaporozhets.clone();
        v8.setConsumption(25);
        v8.setHorsePower(3000);
        System.out.println(carClone);
        System.out.println(zaporozhets);
    }
}
