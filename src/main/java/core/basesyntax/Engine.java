package core.basesyntax;

public class Engine implements Cloneable {

    private int levelOfNoise;
    private int numOfCylinders;
    private int power;
    private String typeOfFuel;
    private String typeOfCooling;

    public Engine(int levelOfNoise, int numOfCylinders, int power,
                  String typeOfFuel, String typeOfCooling) {
        this.levelOfNoise = levelOfNoise;
        this.numOfCylinders = numOfCylinders;
        this.power = power;
        this.typeOfFuel = typeOfFuel;
        this.typeOfCooling = typeOfCooling;
    }

    @Override
    public Engine clone() {
        return new Engine(levelOfNoise, numOfCylinders, power, typeOfFuel, typeOfCooling);
    }
}
