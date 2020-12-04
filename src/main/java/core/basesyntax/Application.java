package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("VAG", "2.0 TDI BlueMotion", "CKFC",
                "Euro4", 150, 2.0);
        Car car = new Car("Volkswagen", "Golf Variant Mk7", "Wagon",
                "Front-engine, front-wheel-drive", 216, engine);
        Car carClone = car.clone();
        car.getEngine().setToxicEmission("Euro5");
        System.out.println(car);
        System.out.println(carClone);
    }
}
