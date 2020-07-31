package core.basesyntax;

public class Car implements Cloneable {
    private String colour;
    private String type;
    private String model;
    private int id;
    private Engine engine;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car obj = (Car) super.clone();
        Engine engine = this.engine.clone();
        obj.setEngine(engine);
        return obj;
    }
}

