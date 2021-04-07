package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int age;
    private int maxSpeed;
    private Engine engine;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.age = builder.age;
        this.maxSpeed = builder.maxSpeed;
        this.engine = builder.engine;

    }

    public Car(String model, Engine clone) {
    }

    public static class CarBuilder {
        private String model;
        private String color;
        private int age;
        private int maxSpeed;
        private Engine engine;

        public CarBuilder(String model, Engine engine) {
            this.model = model;
            this.engine = engine;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setFuelEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public Car clone() {
        return new Car(model, engine.clone());
    }

    @Override
    public String toString() {
        return "Car{ model='" + model + '\'' + ", engine=" + engine + '}';
    }
}


