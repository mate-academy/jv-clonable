package core.basesyntax;

import java.util.HashMap;

public final class Engine implements Cloneable {
    private final String cylinderDiameter;
    private final String pistonStroke;
    private final String crankRadius;
    private final String capacity;
    private final HashMap<String, Integer> compressionRatio;

    public Engine(String cylinderDiameter, String pistonStroke,
                  String crankRadius, String capacity, HashMap<String, Integer> compressionRatio) {
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

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(this);
    }
}
