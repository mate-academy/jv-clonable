package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(true, 2.6, 325, "V", 6);
        Car porsche = new Car("Panamera", 2021, "Germany", 90000, engine);
        Car clonedCar = porsche.clone();
        System.out.println(porsche);
        System.out.println(clonedCar);
        porsche.getEngine().setHorsePower(400);
        porsche.getEngine().setTurbocharged(false);
        System.out.println(porsche);
    }
}
