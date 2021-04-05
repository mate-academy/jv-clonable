package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine1 = new Engine();
        engine1.setCylinderDiameter(12);
        engine1.setFuelConsumption(34);
        engine1.setGraduationYear(1989);
        engine1.setMaterial("aluminum");
        engine1.setPower(500);

        Car car1 = new Car();
        car1.setModel("audi");
        car1.setColor("red");
        car1.setYear(1990);
        car1.setHorsePowers(1600);
        car1.setEngine(engine1);

        Car cloneCar1 = car1.clone();

        System.out.println(car1);
        System.out.println(cloneCar1);

        car1.getEngine().setPower(2000);
        System.out.println("Made changes:");

        System.out.println(car1);
        System.out.println(cloneCar1);

    }
}
