package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("JZ-1",600,550,9.5,7);

        Engine engineClone = engine.clone();
        engineClone.setModel("JZ-2");

        Car toyota = new Car("Toyota","Red",engine,220,1800);

        Car clonedToyota = toyota.clone();
        clonedToyota.setEngine(engineClone);

        System.out.println(toyota.toString());
        System.out.println(clonedToyota.toString());
    }
}
