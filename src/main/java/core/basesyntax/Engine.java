package core.basesyntax;

public class Engine implements Cloneable {
    private int temperature;
    private int volume;
    private int pressure;
    private int speed;
    private int age;

    public Engine(int temperature, int volume, int pressure, int speed, int age) {
        this.temperature = temperature;
        this.volume = volume;
        this.pressure = pressure;
        this.speed = speed;
        this.age = age;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        Engine engine = new Engine(temperature, volume, pressure, speed, age);
        return engine;
    }
}


