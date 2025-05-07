package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("name", "V8", 1200, "forward", "4x4");
        Car audi = new Car("Audi", "A8", 2020, 300, engine);
        Car cloneAudi = audi.clone();
        cloneAudi.getEngine().setModelOfEngine("newModelEngine");
        System.out.println(audi);
        System.out.println(cloneAudi);
    }
}
