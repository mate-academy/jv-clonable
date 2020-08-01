package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int capacity;
    private int power;
    private int speed;
    private int weight;

    private Engine(String type, int capacity, int power, int speed, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.power = power;
        this.speed = speed;
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(type, capacity, power, speed, weight);
    }

}
