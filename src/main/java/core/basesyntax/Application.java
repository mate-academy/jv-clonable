package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("rock", "m14", "black", 13, 4);
        Car impala = new Car(engine, "ChevroletImpala", 1967, "black", "KAZ 2Y5");
        Car carClone = impala.clone();
        impala.getEngine().setColour("pink");
        System.out.println(impala.toString());
        System.out.println(carClone.toString());
    }
}
