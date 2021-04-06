package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("AD421", 250,
                "Diesel", "Germany", 6);
        Car bmw = new Car("Yellow", "BMW", 2003, 50000, true, engine);
        Car bmwClone = bmw.clone();
        System.out.println("BMW params" + "\n" + bmw + "\n");
        System.out.println("BMW clone params" + "\n" + bmwClone + "\n");
        engine.setHorsePower(150);
        System.out.println("BMW with changed params" + "\n" + bmw + "\n");
        System.out.println("BMW clone params" + "\n" + bmwClone + "\n");
    }
}
