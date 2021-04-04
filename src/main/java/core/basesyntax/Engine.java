package core.basesyntax;

import java.util.Objects;

public class Engine implements Cloneable {
    private int powerOfEngine;
    private String engineScheme;
    private String typeOfEngine;
    private int numbersOfCylinders;
    private int maxSpeed;

    public Engine(int powerOfEngine, String engineScheme, String typeOfEngine,
                  int numbersOfCylinders, int maxSpeed) {
        this.powerOfEngine = powerOfEngine;
        this.engineScheme = engineScheme;
        this.typeOfEngine = typeOfEngine;
        this.numbersOfCylinders = numbersOfCylinders;
        this.maxSpeed = maxSpeed;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public String getEngineScheme() {
        return engineScheme;
    }

    public void setEngineScheme(String engineScheme) {
        this.engineScheme = engineScheme;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public int getNumbersOfCylinders() {
        return numbersOfCylinders;
    }

    public void setNumbersOfCylinders(int numbersOfCylinders) {
        this.numbersOfCylinders = numbersOfCylinders;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object engine) {
        if (engine == this) {
            return true;
        }
        if (engine == null) {
            return false;
        }

        if (engine.getClass().equals(Engine.class)) {
            Engine currentEngine = (Engine) engine;
            return Objects.equals(this.engineScheme, currentEngine.engineScheme)
                    && Objects.equals(this.typeOfEngine, currentEngine.typeOfEngine)
                    && this.powerOfEngine == currentEngine.powerOfEngine
                    && this.numbersOfCylinders == currentEngine.numbersOfCylinders
                    && this.maxSpeed == currentEngine.maxSpeed;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Engine characteristics: " + "\n"
                + "Engine type is " + typeOfEngine + "\n"
                + "Engine scheme is " + engineScheme + "\n"
                + "Max speed is " + maxSpeed + "\n"
                + "Power of Engine is " + powerOfEngine + "\n"
                + "Numbers of cylinder is " + numbersOfCylinders;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone Engine", e);
        }
    }
}
