package core.basesyntax;

import core.basesyntax.types.EngineManufacturers;
import core.basesyntax.types.EngineTypes;

public class Engine {
    private EngineTypes engineTypes;
    private int cylinders;
    private double engineDisplacement;
    private int power;
    private EngineManufacturers engineManufacturers;

    public Engine(EngineTypes engineTypes, int cylinders, double engineDisplacement
            , int power, EngineManufacturers engineManufacturers) {
        this.engineTypes = engineTypes;
        this.cylinders = cylinders;
        this.engineDisplacement = engineDisplacement;
        this.power = power;
        this.engineManufacturers = engineManufacturers;
    }

    public void setEngineTypes(EngineTypes engineTypes) {
        this.engineTypes = engineTypes;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setEngineManufacturers(EngineManufacturers engineManufacturers) {
        this.engineManufacturers = engineManufacturers;
    }

    public EngineTypes getEngineTypes() {
        return engineTypes;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public int getPower() {
        return power;
    }

    public EngineManufacturers getEngineManufacturers() {
        return engineManufacturers;
    }

    @Override
    public String toString() {
        return String.format("Engine: %s, manufacture create: %s, count of cylinders: %d"
                        + ", engine power in horse power: %d hp, engine displacement: %.2f cc."
                , engineTypes, engineManufacturers, cylinders, power, engineDisplacement);

    }
}
