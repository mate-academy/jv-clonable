package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setForm("round");
        engine.setGasOrDiesel("gas");
        engine.setName("bestEngine");
        engine.setPower(350);
        engine.setVolume(200);

        Car myCar = new Car();
        myCar.setColor("red");
        myCar.setModel("BMW");
        myCar.setSeats(2);
        myCar.setSpeed(400);
        myCar.setYearOfConstruction(2020);
        myCar.setEngine(engine);

        Car clonedMyCar = myCar.clone();
        myCar.getEngine().setGasOrDiesel("diesel");

        System.out.println(clonedMyCar);
        System.out.println(myCar);
    }
}
