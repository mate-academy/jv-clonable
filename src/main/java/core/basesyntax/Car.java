package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not clone car.", e);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
