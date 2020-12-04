package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("predator","OHV", "Germany", "gas", 500);
        Car audi = new Car("Audi", "red", 2500, 2010);
        audi.setEngine(engine);
        Car carClone = audi.clone();
        System.out.println(carClone.toString());
        audi.getEngine().setOrigin("Italy");
        System.out.println(carClone.toString());
        System.out.println(audi.toString());
    }
}
