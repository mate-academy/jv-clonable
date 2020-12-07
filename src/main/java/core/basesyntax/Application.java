package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine ferrariEngine = new Engine(21312, 350, 700, 6, 300);
        Car ferrari = new Car("Ferrari 616", ferrariEngine, 1350, "Red", 2);
        Car cloneFerrari = ferrari.clone();
        ferrariEngine.setPower(950);
        System.out.println(ferrari);
        System.out.println(cloneFerrari);
    }
}
