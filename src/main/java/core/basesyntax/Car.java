package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private String modification;
    private String transmissionType;
    private Engine engine;
    private String color;

    public Car(String model, String modification,
               String transmissionType, Engine engine, String color) {
        this.model = model;
        this.modification = modification;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
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

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(this.getModel(),
                this.getModification(),
                this.getTransmissionType(),
                this.getEngine().clone(),
                this.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return model.equals(car.getModel())
                && modification.equals(car.getModification())
                && transmissionType.equals(car.getTransmissionType())
                && engine.equals(car.getEngine())
                && color.equals(car.getColor());
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + (model == null ? 0 : model.hashCode());
        result = prime * result + (modification == null ? 0 : modification.hashCode());
        result = prime * result + (transmissionType == null ? 0 : transmissionType.hashCode());
        result = prime * result + (engine == null ? 0 : engine.hashCode());
        result = prime * result + (color == null ? 0 : color.hashCode());
        return result;

    }

    @Override
    public String toString() {
        return "Car{"
                + "model = " + model
                + " modification = " + modification
                + " transmissionType = " + transmissionType
                + " engine = " + engine
                + " color = " + color
                + '}';
    }
}

