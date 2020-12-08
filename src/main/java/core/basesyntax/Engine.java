package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int horsepower;
    private int volume;
    private int torque;
    private String fuelType;

    private Engine(EngineBuilder builder) {
        this.model = builder.model;
        this.horsepower = builder.horsepower;
        this.volume = builder.volume;
        this.torque = builder.torque;
        this.fuelType = builder.fuelType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", horsepower=" + horsepower
                + ", volume=" + volume
                + ", torque=" + torque
                + ", fuelType='" + fuelType + '\'' + '}';
    }

    public static class EngineBuilder {
        private String model;
        private int horsepower;
        private int volume;
        private int torque;
        private String fuelType;

        public EngineBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public EngineBuilder setHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public EngineBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public EngineBuilder setTorque(int torque) {
            this.torque = torque;
            return this;
        }

        public EngineBuilder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public String getModel() {
            return model;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public int getVolume() {
            return volume;
        }

        public int getTorque() {
            return torque;
        }

        public String getFuelType() {
            return fuelType;
        }

        public Engine build() {
            return new Engine(this);
        }
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the object", e);
        }
    }
}
