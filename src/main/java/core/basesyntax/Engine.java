package core.basesyntax;

public final class Engine {
    private final String cylinderDiameter;
    private final String pistonStroke;
    private final String crankRadius;
    private final String capacity;
    private final String compressionRatio;

    public Engine(String cylinderDiameter, String pistonStroke,
                  String crankRadius, String capacity, String compressionRatio) {
        this.cylinderDiameter = cylinderDiameter;
        this.pistonStroke = pistonStroke;
        this.crankRadius = crankRadius;
        this.capacity = capacity;
        this.compressionRatio = compressionRatio;
    }

    public Engine(Engine engine) {
        this.cylinderDiameter = engine.cylinderDiameter;
        this.pistonStroke = engine.pistonStroke;
        this.crankRadius = engine.crankRadius;
        this.capacity = engine.capacity;
        this.compressionRatio = engine.compressionRatio;
    }
}
