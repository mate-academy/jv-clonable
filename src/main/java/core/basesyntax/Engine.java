package core.basesyntax;

public class Engine implements Cloneable {
    private String typeEngine;
    private int efficiency;
    private int diameterCylinder;
    private int numberCylinder;
    private int engineCapacity;

    public Engine(String typeEngine, int efficiency, int diameterCylinder,
                  int numberCylinder, int engineCapacity) {
        this.typeEngine = typeEngine;
        this.efficiency = efficiency;
        this.diameterCylinder = diameterCylinder;
        this.numberCylinder = numberCylinder;
        this.engineCapacity = engineCapacity;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public int getDiameterCylinder() {
        return diameterCylinder;
    }

    public void setDiameterCylinder(int cylinderDiameter) {
        this.diameterCylinder = cylinderDiameter;
    }

    public int getNumberCylinder() {
        return numberCylinder;
    }

    public void setNumberCylinder(int numberCylinder) {
        this.numberCylinder = numberCylinder;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "type of Engine: " + typeEngine
                + "; efficiency: " + efficiency
                + "; diameter cylinder: " + diameterCylinder
                + "; number cylinders: " + numberCylinder
                + "; engine capacity: " + engineCapacity
                + "}";
    }

    @Override
    public Engine clone() {
        return new Engine(this.typeEngine, this.efficiency,
                this.diameterCylinder, this.numberCylinder, this.engineCapacity);
    }
}
