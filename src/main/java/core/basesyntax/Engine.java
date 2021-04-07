package core.basesyntax;

public class Engine implements Cloneable {
    private int capacity;
    private String type;
    private int pistonStroke;
    private int cylinderDiameter;
    private int compressionRatio;

    private Engine(EngineBuilder builder) {
        this.capacity = builder.capacity;
        this.type = builder.type;
        this.pistonStroke = builder.pistonStroke;
        this.cylinderDiameter = builder.cylinderDiameter;
        this.compressionRatio = builder.compressionRatio;

    }

    public Engine(int capacity, String type) {
    }

    public static class EngineBuilder {
        private int capacity;
        private String type;
        private int pistonStroke;
        private int cylinderDiameter;
        private int compressionRatio;

        public EngineBuilder(int capacity, String type) {
            this.type = type;
            this.capacity = capacity;
        }

        public EngineBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public EngineBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public EngineBuilder setPistonStroke(int pistonStroke) {
            this.pistonStroke = pistonStroke;
            return this;
        }

        public EngineBuilder setCylinderDiameter(int cylinderDiameter) {
            this.cylinderDiameter = cylinderDiameter;
            return this;
        }

        public EngineBuilder setCompressionRatio(int compressionRatio) {
            this.compressionRatio = compressionRatio;
            return this;
        }

        public Engine build() {
            return new Engine(this);
        }
    }

    @Override
    public Engine clone() {
        return new Engine(capacity, type);
    }

    @Override
    public String toString() {
        return "Engine{capacity='" + capacity + '\'' + ", type='" + type + '}';
    }
}
