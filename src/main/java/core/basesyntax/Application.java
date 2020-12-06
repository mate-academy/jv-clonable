package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setYear(1998);
        engine.setModel("Porsche");
        engine.setDisplacement(3.5);
        engine.setEnginePower(600);
        engine.setNumberOfCylinder(8);
        Car car = new Car(2000, "Audi", "Red", "Sedan", "Michelin");
        car.setEngine(engine);
        System.out.println(car);
        Car carClone = car.clone();
        car.getEngine().setYear(2001);
        System.out.println(carClone);
        System.out.println(car);
    }
}
