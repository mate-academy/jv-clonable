package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private String type;
    private boolean isElectricCar;

    public Car(String name, Engine engine, String color, String type, boolean isElectricCar) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.type = type;
        this.isElectricCar = isElectricCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isElectricCar() {
        return isElectricCar;
    }

    public void setElectricCar(boolean electricCar) {
        isElectricCar = electricCar;
    }

    @Override
    public Car clone() {
        return new Car(name, engine.clone(), color, type, isElectricCar);
    }
}
