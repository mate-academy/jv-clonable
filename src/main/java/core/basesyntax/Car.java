package core.basesyntax;

public class Car implements Cloneable {
    private String modelName;
    private String color;
    private String dateOfProduction;
    private String bodyType;
    private Engine engine;

    public Car(String modelName, String color, String dateOfProduction,
               String bodyType, Engine engine) {
        this.modelName = modelName;
        this.color = color;
        this.dateOfProduction = dateOfProduction;
        this.bodyType = bodyType;
        this.engine = engine;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car", e);
        }

    }

    @Override
    public String toString() {
        return "Car {"
                + " model name: " + modelName
                + ", color: " + color
                + ", date Of Production: " + dateOfProduction
                + ", body type: " + bodyType
                + ", engine: " + engine
                + " }";
    }
}
