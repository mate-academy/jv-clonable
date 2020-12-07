package core.basesyntax;

public class Engine implements Cloneable {
    private String typeEngine;
    private String stroke;
    private int diameterCylinder;
    private int numberCylinder;
    private int engineCapacity;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
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
                + "; stroke: " + stroke
                + "; diameter cylinder: " + diameterCylinder
                + "; number cylinders: " + numberCylinder
                + "; engine capacity: " + engineCapacity
                + "}";
    }
}
