package core.basesyntax;

public class Car implements Cloneable {
    private int year;
    private String model;
    private String colour;
    private String type;
    private String tyres;
    private Engine engine;

    public Car(int year, String model, String colour, String type, String tyres) {
        this.year = year;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: Model " + model + "; Year " + year + "; Colour " + colour + "; Type " + type
                + "; Tyres " + tyres + "; " + engine;
    }

    @Override
    protected Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }
}
