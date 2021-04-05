package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int year;
    private Engine engine;
    private boolean wasInTheCarsMovie;

    public Car(String model, String color, int year, Engine engine, boolean wasInTheCarsMovie) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.wasInTheCarsMovie = wasInTheCarsMovie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isWasInTheCarsMovie() {
        return wasInTheCarsMovie;
    }

    public void setWasInTheCarsMovie(boolean wasInTheCarsMovie) {
        this.wasInTheCarsMovie = wasInTheCarsMovie;
    }

    @Override
    public String toString() {
        return " {" +
                "model = " + model +
                ", color = " + color +
                ", year = " + year +
                ", engine = " + engine +
                ", wasInTheCarsMovie = " + wasInTheCarsMovie +
                '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Car", e);
        }

    }
}
