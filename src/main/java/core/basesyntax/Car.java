package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int year;
    private String color;
    private int seatsAmount;
    private int doorAmount;
    private Engine engine;

    public Car(CarBuilder carBuilder) {
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.color = carBuilder.color;
        this.seatsAmount = carBuilder.seatsAmount;
        this.doorAmount = carBuilder.doorAmount;
        this.engine = carBuilder.engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", year=" + year + ", color='"
                + color + '\'' + ", seatsAmount=" + seatsAmount
                + ", doorAmount=" + doorAmount + ", engine=" + engine + '}';
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (Exception e) {
            throw new RuntimeException("Can't clone Car.", e);
        }
    }

    public static class CarBuilder {
        private String model;
        private int year;
        private String color;
        private int seatsAmount;
        private int doorAmount;
        private Engine engine;

        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSeatsAmount(int seatsAmount) {
            this.seatsAmount = seatsAmount;
            return this;
        }

        public CarBuilder setDoorAmount(int doorAmount) {
            this.doorAmount = doorAmount;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
