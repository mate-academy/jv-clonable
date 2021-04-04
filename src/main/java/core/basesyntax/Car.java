package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int productionYear;
    private int guaranteeTime;
    private String modelName;
    private Engine engine;

    public Car(String name,String modelName, String color, int productionYear,
               int guaranteeTime, Engine engine) {
        this.name = name;
        this.color = color;
        this.productionYear = productionYear;
        this.guaranteeTime = guaranteeTime;
        this.modelName = modelName;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(int guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car Name is " + name + "\n"
                + "Model Name is " + modelName + "\n"
                + "Car color is " + color + "\n"
                + "Production year is " + productionYear + "\n"
                + "Guarantee Time is " + guaranteeTime + "\n"
                + engine.toString();
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone Car",e);
        }
    }
}
