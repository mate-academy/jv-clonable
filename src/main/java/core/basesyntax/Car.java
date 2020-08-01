package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int weight;
    private String dateOfcreate;
    private String colore;
    private String country;
    private Engine engine;

    public Car(String model, int weight, String dateOfcreate, String colore, String country,
               Engine engine) {
        this.model = model;
        this.weight = weight;
        this.dateOfcreate = dateOfcreate;
        this.colore = colore;
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

    public String getDateOfcreate() {
        return dateOfcreate;
    }

    public void setDateOfcreate(String dateOfcreate) {
        this.dateOfcreate = dateOfcreate;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
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
                + "model='"
                + model
                + '\''
                + ", weight="
                + weight
                + ", dateOfcreate='"
                + dateOfcreate
                + '\''
                + ", colore='"
                + colore + '\''
                + ", country='"
                + country + '\''
                + ", engine="
                + engine
                + '}';
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Engine newEngine = engine.clone();
        return new Car(model, weight, dateOfcreate, colore, country, newEngine);
    }
}

