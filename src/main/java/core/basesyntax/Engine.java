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
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(mark,
                model,
                fuelType,
                volume,
                horsepower);
    }
}
