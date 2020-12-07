package core.basesyntax;

import core.basesyntax.types.EngineManufacturers;
import core.basesyntax.types.EngineTypes;

public class Engine implements Cloneable {
    private EngineTypes engineType;
    private int cylinders;
    private double engineDisplacement;
    private int power;
    private EngineManufacturers engineManufacture;

    public Engine(EngineTypes engineType, int cylinders, double engineDisplacement,
                  int power, EngineManufacturers engineManufacture) {
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.engineDisplacement = engineDisplacement;
        this.power = power;
        this.engineManufacture = engineManufacture;
    }

    public void setEngineType(EngineTypes engineType) {
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

    public void setEngineManufacturers(EngineManufacturers engineManufacture) {
        this.engineManufacture = engineManufacture;
    }

    public EngineTypes getEngineType() {
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

    public EngineManufacturers getEngineManufacture() {
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
        Engine clone;
        try {
            clone = (Engine) super.clone();
            clone.setCylinders(this.getCylinders());
            clone.setEngineDisplacement(this.getEngineDisplacement());
            clone.setEngineManufacturers(this.getEngineManufacture());
            clone.setEngineType(this.engineType);
            clone.setPower(getPower());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Engine cannot be clone.", e);
        }
        return clone;
    }
}
