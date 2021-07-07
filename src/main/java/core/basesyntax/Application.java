package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Car touareg = new Car(new Engine("VR6", 6,
                3.6, 219.5, "diesel"),
                "Volkswagen", "Touareg", "SUV", 5);
        Car touaregClone = touareg.clone();
        touareg.getEngine().setMaximumPower(250.0);
        System.out.println("Original - " + touareg);
        System.out.println("Clone - " + touaregClone);
    }
}
