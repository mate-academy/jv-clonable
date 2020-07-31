package core.basesyntax;

public class Engine implements Cloneable {
    private int horsesPower;
    private String model;
    private String code;
    private int numbersOfCylinders;
    private int volume;

    public Engine(int horsesPower, String model, String code, int numbersOfCylinders, int volume) {
        this.horsesPower = horsesPower;
        this.model = model;
        this.code = code;
        this.numbersOfCylinders = numbersOfCylinders;
        this.volume = volume;
    }

    @Override
    public Engine clone() {
        return new Engine(horsesPower, model, code, numbersOfCylinders, volume);
    }
}
