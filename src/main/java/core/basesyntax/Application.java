package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine modificationForVolga = new Engine("ZMZ 2401 (A-76)", "USSR", 1970, 135, 2445);
        Car scaldiaVolga = new Car("genosse Erich Honecker", "DDR", "GAZ-24", "USSR", 1973, modificationForVolga);

        Car volga = scaldiaVolga.clone();
        scaldiaVolga.getEngineModel().setModel("Indenor XDP 4.90");

        System.out.println(scaldiaVolga.toString());
        System.out.println(volga.toString());


    }
}
