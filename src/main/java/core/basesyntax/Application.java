package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setColor("gold");
        engine.setKindMotor("engine petrol");
        engine.setNumberOfCylinders(12);
        engine.setNumberOfKeys(11);
        engine.setTypeOfFuel("petrol");
        Car audi = new Car();
        audi.setAgeModel(2017);
        audi.setColor("black");
        audi.setPrice(814540);
        audi.setModel("A6");
        audi.setEngine(engine);
        audi.getEngine().setColor("black");
        Car cloneAudi = audi.clone();
    }
}
