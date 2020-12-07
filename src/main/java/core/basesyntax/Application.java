package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine newEngine = new Engine("Daimler",
                "1F2",
                "V-type",
                2000,
                200);

        Car car = new Car("Mercedes",
                "C200",
                newEngine,
                "Blue",
                4);
        Car carClone = car.clone();
        newEngine.setType("Liner 4");

        System.out.println(car.toString());
        System.out.println(carClone.toString());

    }

}
