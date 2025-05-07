package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine2015 = new Engine("Skoda", "TSI", 110, 6, 1499);
        Car fabia2015White = new Car(engine2015, "Skoda", "Fabia", "White", 6, 8499);
        Car fabia2010Red = fabia2015White.clone();
        fabia2010Red.setAge(11);
        fabia2010Red.setColor("Red");
        engine2015.setManufacturer("VW");

        System.out.println(fabia2015White);
        System.out.println(fabia2010Red);
    }
}
