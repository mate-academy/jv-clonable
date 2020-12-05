package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine2JZ = new Engine("2JZ-GTE", 320);
        Car toyota  = new Car(engine2JZ, "Supra", 15000, "Red");
        Car bmw = toyota.clone();
        bmw.getEngine().setModel("S85B50 V10");
        bmw.getEngine().setPower(507);
        bmw.setModel("E63 M6");
        bmw.setCoast(50000);
        System.out.println(toyota.toString());
        System.out.println(bmw.toString());
    }
}
