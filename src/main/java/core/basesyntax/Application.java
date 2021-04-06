package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine v12 = new Engine(6.3, 12, "petrol A-98",
                "injector", 740);
        Car ferrariF12Berlinetta = new Car("F12 Berlinetta", "Ferrari",
                2012, 2, v12);
        Car carClone = ferrariF12Berlinetta.clone();
        v12.setMaximumHorsepower(780);
        System.out.println(ferrariF12Berlinetta);
        System.out.println(carClone);
    }
}
