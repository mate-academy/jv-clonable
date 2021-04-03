package core.basesyntax;

public class Engine implements Cloneable {
    private float volume;
    private String typeOfEngine;
    private String typeOfFuel;
    private int minOctane;
    private int maintenanceInterval;

    public Engine(Builder builder) {
        this.volume = builder.volume;
        this.typeOfEngine = builder.typeOfEngine;
        this.typeOfFuel = builder.typeOfFuel;
        this.minOctane = builder.minOctane;
        this.maintenanceInterval = builder.maintenanceInterval;
    }

    public Engine(float volume) {
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public int getMinOctane() {
        return minOctane;
    }

    public int getMaintenanceInterval() {
        return maintenanceInterval;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setMinOctane(int minOctane) {
        this.minOctane = minOctane;
    }

    public void setMaintenanceInterval(int maintenanceInterval) {
        this.maintenanceInterval = maintenanceInterval;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "volume=" + volume
                + ", typeOfEngine='" + typeOfEngine + '\''
                + ", typeOfFuel='" + typeOfFuel + '\''
                + ", minOctane=" + minOctane
                + ", maintenanceInterval=" + maintenanceInterval
                + '}';
    }

    public static class Builder {
        private float volume;
        private String typeOfEngine;
        private String typeOfFuel;
        private int minOctane;
        private int maintenanceInterval;

        public Builder setVolume(float volume) {
            this.volume = volume;
            return this;
        }

        public Builder setTypeOfEngine(String typeOfEngine) {
            this.typeOfEngine = typeOfEngine;
            return this;
        }

        public Builder setTypeOfFuel(String typeOfFuel) {
            this.typeOfFuel = typeOfFuel;
            return this;
        }

        public Builder setMinOctane(int minOctane) {
            this.minOctane = minOctane;
            return this;
        }

        public Builder setMaintenanceInterval(int maintenanceInterval) {
            this.maintenanceInterval = maintenanceInterval;
            return this;
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
            throw new RuntimeException("Can't clone engine", e);
        }
    }
}
