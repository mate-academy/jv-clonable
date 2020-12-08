package core.basesyntax;

import core.basesyntax.types.EngineManufacturer;
import core.basesyntax.types.EngineType;

public class Engine implements Cloneable {
    private EngineType engineType;
    private int cylinders;
    private double engineDisplacement;
    private int power;
    private EngineManufacturer engineManufacture;

    public Engine(EngineType engineType, int cylinders, double engineDisplacement,
                  int power, EngineManufacturer engineManufacture) {
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.engineDisplacement = engineDisplacement;
        this.power = power;
        this.engineManufacture = engineManufacture;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
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

    public void setEngineManufacturers(EngineManufacturer engineManufacture) {
        this.engineManufacture = engineManufacture;
    }

    public EngineType getEngineType() {
        return engineType;
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

    public EngineManufacturer getEngineManufacture() {
        return engineManufacture;
    }

    @Override
    public String toString() {
        return String.format("Engine: %s, manufacture create: %s, count of cylinders: %d"
                        + ", engine power in horse power: %d hp, engine displacement: %.2f cc.",
                engineType, engineManufacture, cylinders, power, engineDisplacement);

    }

    @Override
    public Engine clone() {
        try {
            Engine clone = (Engine) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }

    }
}
