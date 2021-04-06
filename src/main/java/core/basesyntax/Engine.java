package core.basesyntax;

public class Engine implements Cloneable {
    private String nameOfEngine;
    private String modelOfEngine;
    private int horsepowerOfEngine;
    private String transmission;
    private String driveUnit;

    public Engine(String nameOfEngine, String modelOfEngine,
                  int horsepowerOfEngine, String transmission, String driveUnit) {
        this.nameOfEngine = nameOfEngine;
        this.modelOfEngine = modelOfEngine;
        this.horsepowerOfEngine = horsepowerOfEngine;
        this.transmission = transmission;
        this.driveUnit = driveUnit;
    }

    public String getNameOfEngine() {
        return nameOfEngine;
    }

    public void setNameOfEngine(String nameOfEngine) {
        this.nameOfEngine = nameOfEngine;
    }

    public String getModelOfEngine() {
        return modelOfEngine;
    }

    public void setModelOfEngine(String modelOfEngine) {
        this.modelOfEngine = modelOfEngine;
    }

    public int getHorsepowerOfEngine() {
        return horsepowerOfEngine;
    }

    public void setHorsepowerOfEngine(int horsepowerOfEngine) {
        this.horsepowerOfEngine = horsepowerOfEngine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public void setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "nameOfEngine='" + nameOfEngine + '\''
                + ", modelOfEngine='" + modelOfEngine + '\''
                + ", horsepowerOfEngine=" + horsepowerOfEngine
                + ", transmission='" + transmission + '\''
                + ", driveUnit='" + driveUnit + '\''
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't created a clone", e);
        }
    }
}
