package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "Red", "jeep", 2015, 550);
        Engine engine = new Engine("Gasoline", 80, 5, 5, 666);
        audi.setEngine(engine);

        Car carClone = audi.clone();

        System.out.println(audi.getEngine().toString());
        System.out.println(carClone.getEngine().toString());

        audi.getEngine().setEfficiency(20);
        audi.getEngine().setTypeEngine("Diesel");

        System.out.println(audi.getEngine().toString());
        System.out.println(carClone.getEngine().toString());
    }
}
