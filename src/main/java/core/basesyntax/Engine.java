package core.basesyntax;

public class Engine implements Cloneable {
    private String winCode;
    private String model;
    private int weight;
    private int engineSpeed;
    private int engineVolume;

    public Engine(String winCode, String model, int weight, int engineSpeed, int engineVolume) {
        this.winCode = winCode;
        this.model = model;
        this.weight = weight;
        this.engineSpeed = engineSpeed;
        this.engineVolume = engineVolume;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(winCode, model, weight, engineSpeed, engineVolume);
    }
}
