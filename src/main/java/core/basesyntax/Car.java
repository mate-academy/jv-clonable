package core.basesyntax;

public class Car implements Cloneable {
    private String type;
    private String manufacturer;
    private int productionYear;
    private int speed;
    private Engine engine;

    public Car(String type, String manufacturer, int productionYear, int speed, Engine engine) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(type, manufacturer, productionYear, speed, engine);
    }
}
