package core.basesyntax;

public class Engine implements Cloneable {
    private String mark;
    private String model;
    private String fuelType;
    private float volume;
    private int horsepower;

    public Engine(String mark, String model, String fuelType, float volume, int horsepower) {
        this.mark = mark;
        this.model = model;
        this.fuelType = fuelType;
        this.volume = volume;
        this.horsepower = horsepower;
    }

    public Engine(Engine otherEngine) {
        this(new String(otherEngine.getMark()),
                new String(otherEngine.getModel()),
                new String(otherEngine.getFuelType()),
                otherEngine.getVolume(),
                otherEngine.getHorsepower());
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
