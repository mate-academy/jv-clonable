package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine modelVEight = new Engine("V8", "sport car engine",
                800, 10, 8);
        Car bugattiVeron = new Car("Veron", "Bugatti",
                2015, 400, modelVEight);

        Car veronClone = bugattiVeron.clone();
        modelVEight.setType("super car");
        bugattiVeron.setMaximumSpeed(405);
        System.out.println(veronClone);
        System.out.println(bugattiVeron);
    }
}
