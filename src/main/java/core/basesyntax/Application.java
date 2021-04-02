package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine vrSix = new Engine("VR6", 6,
                3.6, 219.5, "diesel");
        Car touareg = new Car(vrSix, "Volkswagen", "Touareg", "SUV", 5);
        Car touaregClone = touareg.clone();
        touareg.getEngine().setMaximumPower(250.0);
        System.out.println("Original - " + touareg);
        System.out.println("Clone - " + touaregClone);
    }
}
