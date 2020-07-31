package core.basesyntax;

import java.time.LocalDate;

public class Engine implements Cloneable {
    private int rpm;
    private LocalDate engineHours;
    private int coolantTemperature;
    private int actualTorque;
    private int turboPressure;
    private String idleAnalysis;

    public Engine(int rpm, LocalDate engineHours, int coolantTemperature,
                  int actualTorque, int turboPressure, String idleAnalysis) {
        this.rpm = rpm;
        this.engineHours = engineHours;
        this.coolantTemperature = coolantTemperature;
        this.actualTorque = actualTorque;
        this.turboPressure = turboPressure;
        this.idleAnalysis = idleAnalysis;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public LocalDate getEngineHours() {
        return engineHours;
    }

    public void setEngineHours(LocalDate engineHours) {
        this.engineHours = engineHours;
    }

    public int getCoolantTemperature() {
        return coolantTemperature;
    }

    public void setCoolantTemperature(int coolantTemperature) {
        this.coolantTemperature = coolantTemperature;
    }

    public int getActualTorque() {
        return actualTorque;
    }

    public void setActualTorque(int actualTorque) {
        this.actualTorque = actualTorque;
    }

    public int getTurboPressure() {
        return turboPressure;
    }

    public void setTurboPressure(int turboPressure) {
        this.turboPressure = turboPressure;
    }

    public String getIdleAnalysis() {
        return idleAnalysis;
    }

    public void setIdleAnalysis(String idleAnalysis) {
        this.idleAnalysis = idleAnalysis;
    }

    @Override
    public Engine clone() {
        return new Engine(rpm, engineHours, coolantTemperature,
                actualTorque, turboPressure, idleAnalysis);
    }
}

