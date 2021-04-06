package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine audiEngine = new Engine();
        audiEngine.setPower(231);
        audiEngine.setType("V6");
        audiEngine.setCapacity(2967.0);
        audiEngine.setFuelConsumption(8);
        audiEngine.setTorque(500.17);

        Car audi = new Car();
        audi.setModel("audi");
        audi.setVin("KL1UF756E6B195928");
        audi.setYear(2019);
        audi.setEquipment("full");
        audi.setFuelType("diesel");
        audi.setEngine(audiEngine);
        System.out.println("origin " + audi);

        Car clonedAudi = audi.clone();
        audi.getEngine().setPower(296);
        System.out.println("orig w/c " + audi);
        System.out.println("cloned " + clonedAudi);
    }
}
