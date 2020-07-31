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
        if (name != null) {
            this.name = name;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        if (engine != null) {
            this.engine = engine;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        }
    }

    public boolean isElectricCar() {
        return isElectricCar;
    }

    public void setElectricCar(boolean electricCar) {
        isElectricCar = electricCar;
    }

    @Override
    public Car clone() {
        Car car;
        try {
            car = (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            car = new Car(this.getName(), this.getEngine().clone(),
                    this.getColor(), this.getType(), this.isElectricCar());
        }
        return car;
    }
}
