package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engineAudi = new Engine("gasoline", "V8", 250, 600, 3.5);
        Car audi = new Car("audi", "white", 2020, false, engineAudi);

        Car carClone = audi.clone();
        audi.getEngine().setEngineVolume(2.7);

        System.out.println(audi);
        System.out.println(carClone);
    }
}
