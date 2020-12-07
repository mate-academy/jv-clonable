package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine mitsubishi = new Engine();
        mitsubishi.setEfficiency(80);
        mitsubishi.setModel("Mitsubishi");
        mitsubishi.setNumberOfStroke(4);
        mitsubishi.setPower(150);
        mitsubishi.setTypeOfFuel("Gasoline");
        Car firstCar = new Car();
        firstCar.setModel("Mitsubishi");
        firstCar.setYear(2014);
        firstCar.setMaxSpeed(200);
        firstCar.setManufacturer("Japan");
        firstCar.setColor("Red");
        firstCar.setEngine(mitsubishi);
        Car carClone = firstCar.clone();
        firstCar.getEngine().setPower(190);
        System.out.println(firstCar.toString());
        System.out.println(carClone.toString());

    }
}
