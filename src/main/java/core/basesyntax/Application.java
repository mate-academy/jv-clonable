package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Engine someEngine = new Engine();
        someEngine.setType("Diesel");
        someEngine.setCylinderAmount(3);
        someEngine.setDisplacement(1.3f);
        someEngine.setTransmissionCount(6);
        someEngine.setPower(75);

        Car originalCar = new Car();
        originalCar.setManufacturer("Chevrolet");
        originalCar.setModel("Aveo");
        originalCar.setCarClass("hatchback");
        originalCar.setAirbag(false);
        originalCar.setEngine(someEngine);

        Engine anotherEngine = new Engine();
        anotherEngine.setType("Petrol");
        anotherEngine.setCylinderAmount(4);
        anotherEngine.setDisplacement(1.5f);
        anotherEngine.setTransmissionCount(5);
        anotherEngine.setPower(85);

        Car clonedCar = originalCar.clone();

        originalCar.setModel("Lacetti");
        originalCar.setEngine(anotherEngine);

        System.out.println(clonedCar.toString());
        System.out.println(originalCar.toString());
    }
}
