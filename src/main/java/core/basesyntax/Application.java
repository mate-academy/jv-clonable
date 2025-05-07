package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engineAudiV6 = new Engine("Petrol", 340, 15.0, 6,
                "longitudinal");
        Car audi = new Car("Audi", "A7", 2015,
                 "automatic", engineAudiV6);
        Car carClone = audi.clone();
        engineAudiV6.setType("diesel");
        carClone.setTransmission("manual");
        System.out.println(audi);
        System.out.println(carClone);

    }
}
