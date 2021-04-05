package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModel("Unknown");
        engine.setType("Unknown");
        engine.setIsElectrical(true);
        engine.setMaximalKilometers(450);
        engine.setHorsepower(590);

        Car audiEtronGT = new Car();
        audiEtronGT.setBrand("Audi");
        audiEtronGT.setModel("E-tron GT");
        audiEtronGT.setEngine(engine);
        audiEtronGT.setMaximumSpeed(240);
        audiEtronGT.setNumber("ZH445789");

        Car audiRsEtronGT = audiEtronGT.clone();
        audiRsEtronGT.setNumber("AH2885AK");
        System.out.println(audiEtronGT);
        System.out.println(audiRsEtronGT);

    }
}
