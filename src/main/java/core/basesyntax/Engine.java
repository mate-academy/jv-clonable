package core.basesyntax;

public class Engine implements Cloneable {

    private String enginesType;
    private String fuelGrade;
    private int engineCapacity;
    private int valvesPerCylinder;
    private int power;

    public Engine(String enginesType, String fuelGrade,
                   int engineCapacity, int valvesPerCylinder, int power) {
        this.enginesType = enginesType;
        this.fuelGrade = fuelGrade;
        this.engineCapacity = engineCapacity;
        this.valvesPerCylinder = valvesPerCylinder;
        this.power = power;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(enginesType, fuelGrade, engineCapacity, valvesPerCylinder, power);
    }

}
