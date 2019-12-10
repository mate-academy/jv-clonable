package core.basesyntax;

public class Car implements Cloneable {
    private String body;
    private String color;
    private String mark;
    private String model;
    private Engine engine;

    public Car(String body, String color, Engine engine) {
        this.body = body;
        this.color = color;
        this.engine = engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Car clone()
            throws CloneNotSupportedException {
        return new Car(body, color, engine.clone());
    }
}

