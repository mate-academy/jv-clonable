package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String model;
    private Engine engine;
    private int year;
    private double price;

    private Car(CarBuilder builder) {
        this.color = builder.color;
        this.model = builder.model;
        this.engine = builder.engine;
        this.year = builder.year;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Car{"
                + "color='" + color + '\''
                + ", model='" + model + '\''
                + ", engine=" + engine
                + ", year=" + year
                + ", price=" + price
                + '}';
    }

    public static class CarBuilder {
        private String color;
        private String model;
        private Engine engine;
        private int year;
        private double price;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the object", e);
        }
    }
}
