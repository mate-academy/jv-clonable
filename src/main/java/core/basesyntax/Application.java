package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engineAudi = new Engine();
        engineAudi.setType("gasoline");
        engineAudi.setCylindersLocation("V-shaped");
        engineAudi.setHorsePower(250);
        engineAudi.setEngineVolume(3.5);
        engineAudi.setTorque(600);

        Car audi = new Car();
        audi.setEngine(engineAudi);

        Car carClone = audi.clone();
        audi.getEngine().setEngineVolume(2.7);

        System.out.println(audi);
        System.out.println(carClone);
    }
}
