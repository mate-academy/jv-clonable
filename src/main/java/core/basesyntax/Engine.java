package core.basesyntax;

public class Engine implements Cloneable {
    private static long idCounter = 0;
    private long id;
    private String fuel;
    private int productionYear;
    private String company;
    private double fuelConsumption;
    private int revolutionsPerMinute;

    public Engine(String fuel,
                  int productionYear,
                  String company,
                  double fuelConsumption,
                  int revolutionsPerMinute) {
        this.id = idCounter++;
        this.fuel = fuel;
        this.productionYear = productionYear;
        this.company = company;
        this.fuelConsumption = fuelConsumption;
        this.revolutionsPerMinute = revolutionsPerMinute;
    }

    public Engine() {
    }

    public long getId() {
        return id;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getRevolutionsPerMinute() {
        return revolutionsPerMinute;
    }

    public void setRevolutionsPerMinute(int revolutionsPerMinute) {
        this.revolutionsPerMinute = revolutionsPerMinute;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "id=" + id
                + ", fuel='" + fuel + '\''
                + ", productionYear=" + productionYear
                + ", company='" + company + '\''
                + ", fuelConsumption=" + fuelConsumption
                + ", revolutionsPerMinute=" + revolutionsPerMinute
                + '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
