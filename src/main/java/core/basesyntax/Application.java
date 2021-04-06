package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engineForToyota = new Engine("15WF135", "135kW", "Ukraine", 2021, true);
        Car firstCar = new Car("Toyota", "Red", "Japanese", 2015, false, engineForToyota);
        Car cloneCar = firstCar.clone();
        System.out.println(cloneCar.toString());

        engineForToyota.setPower("256kW");
        engineForToyota.setCountry("Germany");
        engineForToyota.setModel("23TE256");
        System.out.println(firstCar.toString());
    }
}
