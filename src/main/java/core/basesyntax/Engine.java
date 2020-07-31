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
        if (rpm != 0) {
            this.rpm = rpm;
        }
    }

    public LocalDate getEngineHours() {
        return engineHours;
    }

    public void setEngineHours(LocalDate engineHours) {
        if (engineHours != null) {
            this.engineHours = engineHours;
        }
    }

    public int getCoolantTemperature() {
        return coolantTemperature;
    }

    public void setCoolantTemperature(int coolantTemperature) {
        if (coolantTemperature != 0) {
            this.coolantTemperature = coolantTemperature;
        }
    }

    public int getActualTorque() {
        return actualTorque;
    }

    public void setActualTorque(int actualTorque) {
        if (actualTorque != 0) {
            this.actualTorque = actualTorque;
        }
    }

    public int getTurboPressure() {
        return turboPressure;
    }

    public void setTurboPressure(int turboPressure) {
        if (turboPressure != 0) {
            this.turboPressure = turboPressure;
        }
    }

    public String getIdleAnalysis() {
        return idleAnalysis;
    }

    public void setIdleAnalysis(String idleAnalysis) {
        if (idleAnalysis != null) {
            this.idleAnalysis = idleAnalysis;
        }
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Engine(this.getRpm(), this.getEngineHours(), this.getCoolantTemperature(),
                    this.getActualTorque(), this.getTurboPressure(), this.getIdleAnalysis());
        }
    }
}
