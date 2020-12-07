package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine mazdaEngine = new Engine("mazda", "v12", "diesel", 350, 25);
        Car mazda = new Car("mazda", "cv-7", "silver", 5);
        mazda.setEngine(mazdaEngine);
        Car mazdaClone = mazda.clone();
        System.out.println(mazda);
        System.out.println(mazdaClone);
        mazdaClone.getEngine().setType("Electric");
        mazdaClone.getEngine().setHorsePower(250);
        mazdaClone.getEngine().setModel("Tesla model S engine");
        mazdaClone.getEngine().setFuelConsumption(10);
        mazdaClone.getEngine().setName("Electric trolleybus!");
        System.out.println(mazda);
        System.out.println(mazdaClone);
    }
}
