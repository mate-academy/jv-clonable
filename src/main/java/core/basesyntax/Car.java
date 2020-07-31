package core.basesyntax;

public class Car implements Cloneable {
    private String glass;
    private String headlights;
    private String tank;
    private String wheel;
    private Engine engine;

    public Car(String glass, String headlights, String tank, String wheel, Engine engine) {
        this.glass = glass;
        this.headlights = headlights;
        this.tank = tank;
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car car = new Car(glass, headlights, tank, wheel, engine.clone());
        return car;

    }

}



