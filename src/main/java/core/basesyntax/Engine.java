package core.basesyntax;

public class Engine implements Cloneable {
    private String producer;
    private String producerCountry;
    private double enginePower;
    private String fuelType;
    private String material;

    public Engine(String producer, String producerCountry,
                  double enginePower, String fuelType, String material) {
        this.producer = producer;
        this.producerCountry = producerCountry;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
        this.material = material;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Producer: " + producer
                + ", producerCountry: " + producerCountry
                + ", enginePower: " + enginePower
                + ", fuelType: " + fuelType
                + ", material: " + material + ".";
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine", e);
        }
    }
}
