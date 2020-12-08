package core.basesyntax;

public class Engine implements Cloneable {
    private boolean systemCooling;
    private boolean systemLubrication;
    private boolean systemSupply;
    private boolean systemIgnition;
    private boolean systemStarting;

    public boolean isSystemCooling() {
        return systemCooling;
    }

    public void setSystemCooling(boolean systemCooling) {
        this.systemCooling = systemCooling;
    }

    public boolean isSystemLubrication() {
        return systemLubrication;
    }

    public void setSystemLubrication(boolean systemLubrication) {
        this.systemLubrication = systemLubrication;
    }

    public boolean isSystemSupply() {
        return systemSupply;
    }

    public void setSystemSupply(boolean systemSupply) {
        this.systemSupply = systemSupply;
    }

    public boolean isSystemIgnition() {
        return systemIgnition;
    }

    public void setSystemIgnition(boolean systemIgnition) {
        this.systemIgnition = systemIgnition;
    }

    public boolean isSystemStarting() {
        return systemStarting;
    }

    public void setSystemStarting(boolean systemStarting) {
        this.systemStarting = systemStarting;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine ", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "systemCooling=" + systemCooling
                + ", systemLubrication=" + systemLubrication
                + ", systemSupply=" + systemSupply
                + ", systemIgnition=" + systemIgnition
                + ", systemStarting=" + systemStarting
                + '}';
    }
}
