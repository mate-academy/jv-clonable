package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String typeCar;
    private int year;
    private String color;
    private int numberOfSeats;
    private int price;

    public Car(Engine engine, String typeCar, int year, String color,
               int numberOfSeats, int price) {
        this.engine = engine;
        this.typeCar = typeCar;
        this.year = year;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), typeCar, year, color, numberOfSeats, price);
    }
}

