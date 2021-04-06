package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine audiV6 = new Engine("Petrol", 340, 15.0, 6,
                "longitudinal");
        Car audi = new Car("Audi", "A7", 2015,
                 "automatic", audiV6);
        Car carClone = audi.clone();
        audiV6.setType("diesel");
        carClone.setTransmission("manual");
        System.out.println(audi);
        System.out.println(carClone);

    }
}
