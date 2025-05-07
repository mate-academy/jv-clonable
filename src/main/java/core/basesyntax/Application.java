package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(10, 547,
                300.0, 100.0, "aluminum");
        Car originalCar = new Car(engine, "silver",
                "audi", 2020, 3);
        Car clonedCar = originalCar.clone();
        originalCar.getEngine().setHorsesPowers(620);
        System.out.println(clonedCar);
        System.out.println(originalCar);
    }
}
