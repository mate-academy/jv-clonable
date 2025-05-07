package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String name;
    private String type;
    private String toxicEmission;
    private int horsepower;
    private double volume;
    
    public Engine(String manufacturer, String name, String type, String toxicEmission,
                  int horsepower, double volume) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.type = type;
        this.toxicEmission = toxicEmission;
        this.horsepower = horsepower;
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "Engine{"
                + "Manufacturer='" + manufacturer + '\''
                + ", name='" + name + '\''
                + ", type='" + type + '\''
                + ", toxicEmission='" + toxicEmission + '\''
                + ", horsepower=" + horsepower
                + ", volume=" + volume
                + '}';
    }
    
    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t create engine clone", e);
        }
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getToxicEmission() {
        return toxicEmission;
    }
    
    public void setToxicEmission(String toxicEmission) {
        this.toxicEmission = toxicEmission;
    }
    
    public int getHorsepower() {
        return horsepower;
    }
    
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
