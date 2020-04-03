package core.basesyntax;

public class Engine implements Cloneable {
    private String power;
    private String fuelType;
    private double hourlyFuelConsumption;
    private byte cylindersCount;
    private String engineDisplacement;

    public Engine(String pow, String fuelT,
                  double hfc,
                  byte cylCount,
                  String engineDis) {
        power = pow;
        fuelType = fuelT;
        hourlyFuelConsumption = hfc;
        cylindersCount = cylCount;
        engineDisplacement = engineDis;
    }

    @Override
    public Engine clone() {
        return new Engine(power, fuelType, hourlyFuelConsumption,
                cylindersCount, engineDisplacement);
    }
}
