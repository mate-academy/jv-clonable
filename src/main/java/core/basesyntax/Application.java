package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine myCarEngine = new Engine("MultiJet", 1300, 59, 120, 100);
        Car myCar = new Car("Fiat", "Fiorino", myCarEngine, "white", (short) 2009);
        Car carClone = myCar.clone();
        myCarEngine.setCapacity(1250);
        System.out.println("myCar: " + myCar.toString());
        System.out.println("carClone: " + carClone.toString());
    }
}
