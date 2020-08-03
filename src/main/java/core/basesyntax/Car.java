package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int weight;
    private String dateOfCreate;
    private String color;
    private String country;
    private Engine engine;

    public Car(String model, int weight, String dateOfCreate, String color, String country) {
        this.model = model;
        this.weight = weight;
        this.dateOfCreate = dateOfCreate;
        this.color = color;
        this.country = country;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\'' + ", weight=" + weight
                + ", dateOfcreate='" + dateOfCreate + '\''
                + ", colore='" + color + '\''
                + ", country='" + country + '\''
                + ", engine=" + engine + '}';
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(model, weight, dateOfCreate, color, country);
    }
}

