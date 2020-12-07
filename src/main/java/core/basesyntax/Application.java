package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Car audi = new Car();
        audi.setModel("audi");
        audi.setYear(1999);
        Engine engineAudi = new Engine();
        engineAudi.setPower(300);
        audi.setEngine(engineAudi);
        Car cloneAudi = audi.clone();
        cloneAudi.getEngine().setPower(400);
        cloneAudi.setYear(2005);
        System.out.println(audi);
        System.out.println(cloneAudi);
    }
}
