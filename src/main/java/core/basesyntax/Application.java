package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setName("Audi98");
        audi.setColor("Black");
        audi.setYear(1998);
        audi.getEngine().setNumberCylinder(4);

        Car carClone = audi.clone();

        audi.getEngine().setNumberCylinder(6);
    }
}
