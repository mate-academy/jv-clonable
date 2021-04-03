package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String make;
    private int horsePower;
    private int manufactureYear;
    private String body;
    private Engine engine;

    public Car(Builder builder) {
        this.model = builder.model;
        this.make = builder.make;
        this.horsePower = builder.horsePower;
        this.manufactureYear = builder.manufactureYear;
        this.body = builder.body;
        this.engine = builder.engine;
    }

    public Car(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", make='" + make + '\''
                + ", horsePower=" + horsePower
                + ", manufactureYear=" + manufactureYear
                + ", body='" + body + '\''
                + ", engine=" + engine
                + '}';
    }

    public static class Builder {
        private String model;
        private String make;
        private int horsePower;
        private int manufactureYear;
        private String body;
        private Engine engine;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder setManufactureYear(int manufactureYear) {
            this.manufactureYear = manufactureYear;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    @Override
    public Car clone() {
        try {
            Car newCar = (Car) super.clone();
            newCar.setEngine(engine.clone());
            return newCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't crete User clone", e);
        }
    }
}
