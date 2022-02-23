package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String type;
    private String layout;
    private int maxSpeed;
    private Engine engine;
    
    public Car(String brand, String model, String type, String layout, int maxSpeed,
               Engine engine) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.layout = layout;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }
    
    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", type='" + type + '\''
                + ", layout='" + layout + '\''
                + ", maxSpeed=" + maxSpeed
                + ", engine=" + engine
                + '}';
    }
    
    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.engine = engine.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t create car clone", e);
        }
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getLayout() {
        return layout;
    }
    
    public void setLayout(String layout) {
        this.layout = layout;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
