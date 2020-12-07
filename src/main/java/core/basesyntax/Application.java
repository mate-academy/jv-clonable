package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setType("sport");
        engine.setCountOfCylinder(12);
        engine.setHeight("5000f");
        engine.setHorsePower(600);
        engine.setWeight("200 inch");

        Car car = new Car();
        car.setColor("red");
        car.setModel("mercedes");
        car.setMaxSpeed(1000);
        car.setYear("2018");
        car.setEngine(engine);
        System.out.println(car);

        final Car cloneCar = car.clone();
        car.getEngine().setType("reactive");
        car.getEngine().setHorsePower(900);
        car.getEngine().setCountOfCylinder(8);
        car.getEngine().setHeight("3000f");
        car.getEngine().setWeight("150 inch");

        System.out.println(cloneCar);
        System.out.println(car);
    }
}
