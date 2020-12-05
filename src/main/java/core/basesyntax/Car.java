package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private int field3;
    private double field4;
    private boolean field5;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public double getField4() {
        return field4;
    }

    public void setField4(double field4) {
        this.field4 = field4;
    }

    public boolean isField5() {
        return field5;
    }

    public void setField5(boolean field5) {
        this.field5 = field5;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("ERROR: error occurred in 'Car' class - clone() method", e);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "\033[31m\nengine = " + engine + "\n\033[32mcarModel=" + model
                + ", carField3=" + field3 + ", carField4=" + field4
                + ", carField5=" + field5 + "}\033[0m";
    }
}
