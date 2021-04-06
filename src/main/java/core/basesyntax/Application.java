package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setName("Audi A6");
        engine.setYear(2018);
        engine.setVolume(2.0);
        engine.setMadeFrom("USA");
        engine.setMark("DFBA");

        Car audi = new Car();
        audi.setName("Audi");
        audi.setYear(1976);
        audi.setMileAge(8);
        audi.setSpeed(180.6);
        audi.setEngine(engine);

        System.out.println(audi);
        Car clonedAudi = audi.clone();
        audi.getEngine().setMark("USGH");
        System.out.println(clonedAudi);
        System.out.println(audi);

    }
}
