package core.basesyntax;

public class Engine implements Cloneable {
    private boolean status;
    private double valume;
    private String engineType;
    private double temperature;
    private int numberOfPiston;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        Engine engine = new Engine();
        engine.status = this.status;
        engine.valume = this.valume;
        engine.engineType = this.engineType;
        engine.temperature = this.temperature;
        engine.numberOfPiston = this.numberOfPiston;
        return engine;
    }

    public double getValume() {
        return valume;
    }

    public void setValume(double valume) {
        this.valume = valume;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getNumberOfPiston() {
        return numberOfPiston;
    }

    public void setNumberOfPiston(int numberOfPiston) {
        this.numberOfPiston = numberOfPiston;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
