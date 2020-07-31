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

    @Override
    public Engine clone() {
        return new Engine(rpm, engineHours, coolantTemperature,
                actualTorque, turboPressure, idleAnalysis);
    }
}

