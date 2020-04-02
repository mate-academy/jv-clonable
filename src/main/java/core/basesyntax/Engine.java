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
    protected Object clone() throws CloneNotSupportedException {
        Engine newEngine = (Engine) super.clone();
        return new Engine(newEngine.getMark(),
                newEngine.getModel(),
                newEngine.getFuelType(),
                newEngine.volume,
                newEngine.horsepower);
    }
}
