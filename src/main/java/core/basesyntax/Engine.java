package core.basesyntax;

public class Engine implements Cloneable{
    private int power;
    private int weight;
    private String name;
    private int cylinders;
    private int valves;

    public Engine(int power, int weight, String name, int cylinders, int valves) {
        this.power = power;
        this.weight = weight;
        this.name = name;
        this.cylinders = cylinders;
        this.valves = valves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Engine don`t clone!" + e);
        }
    }

    @Override
    public String toString() {
        return  " power = " + power
                + ", cylindersNumber = " + cylinders
                + ", weight = " + weight
                + ", name = " + name
                + ", valves = " + valves;
    }

}
