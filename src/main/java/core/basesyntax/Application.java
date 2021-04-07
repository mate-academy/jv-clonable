package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine("internal combustion",
                150, 127867, 6, 83);
        Car car = new Car(" Cabriolet", "yellow",
                180, true, engine);
        Car carClone = car.clone();
        engine.setCylindersNumber(8);

        System.out.println("\n" + " Original car: " + "\n" + "\n" + car);
        System.out.println("\n" + " Cloned car: " + "\n" + "\n" + carClone);
    }
}
