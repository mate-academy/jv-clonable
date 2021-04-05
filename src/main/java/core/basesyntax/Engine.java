package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int capacity;
    private int output;
    private int torque;
    private int weight;

    public Engine(String name, int capacity, int output, int torque, int weight) {
        this.name = name;
        this.capacity = capacity;
        this.output = output;
        this.torque = torque;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Engine setName(String name) {
        this.name = name;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public Engine setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public int getOutput() {
        return output;
    }

    public Engine setOutput(int output) {
        this.output = output;
        return this;
    }

    public int getTorque() {
        return torque;
    }

    public Engine setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Engine setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Engine clone() {
        return new Engine(name, capacity, output, torque, weight);
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", capacity=" + capacity
                + ", output=" + output
                + ", torque=" + torque
                + ", weight=" + weight
                + '}';
    }
}
