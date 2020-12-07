package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int horsePower;
    private int cylinderAmount;
    private String typeFuel;
    private int engineCapacity;

    public Engine(EngineBuilder engineBuilder) {
        this.name = engineBuilder.name;
        this.horsePower = engineBuilder.horsePower;
        this.cylinderAmount = engineBuilder.cylinderAmount;
        this.typeFuel = engineBuilder.typeFuel;
        this.engineCapacity = engineBuilder.engineCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine{" + "name='" + name + '\'' + ", horsePower=" + horsePower
                + ", cylinderAmount=" + cylinderAmount + ", typeFuel='"
                + typeFuel + '\'' + ", engineCapacity=" + engineCapacity + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine.", e);
        }
    }

    public static class EngineBuilder {
        private String name;
        private int horsePower;
        private int cylinderAmount;
        private String typeFuel;
        private int engineCapacity;

        public EngineBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EngineBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public EngineBuilder setCylinderAmount(int cylinderAmount) {
            this.cylinderAmount = cylinderAmount;
            return this;
        }

        public EngineBuilder setTypeFuel(String typeFuel) {
            this.typeFuel = typeFuel;
            return this;
        }

        public EngineBuilder setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Engine build() {
            return new Engine(this);
        }
    }
}
