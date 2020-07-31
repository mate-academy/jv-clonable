package core.basesyntax;

public class Engine implements Cloneable {

    private int id;
    private int horsepower;
    private double weight;
    private double volume;
    private String guarantee;

    public Engine(int id, int horsepower, double weight, double volume, String guarantee) {
        this.id = id;
        this.horsepower = horsepower;
        this.weight = weight;
        this.volume = volume;
        this.guarantee = guarantee;
    }

    public void setId() {
        this.id = id;
    }

    public void setHorsepower() {
        this.horsepower = horsepower;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public void setVolume() {
        this.volume = volume;
    }

    public void setGuarantee() {
        this.guarantee = guarantee;
    }

    public int getId() {
        return id;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public String startEngine() {
        return "Engine is started";
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(id, horsepower, weight, volume, guarantee);
    }

}
