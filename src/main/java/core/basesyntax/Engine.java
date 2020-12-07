package core.basesyntax;

public class Engine implements Cloneable {
    private boolean systemCooling;
    private boolean systemLubrication;
    private boolean systemSupply;
    private boolean systemIgnition;
    private boolean systemStarting;

    protected boolean isSystemCooling() {
        return systemCooling;
    }

    protected void setSystemCooling(boolean systemCooling) {
        this.systemCooling = systemCooling;
    }

    protected boolean isSystemLubrication() {
        return systemLubrication;
    }

    protected void setSystemLubrication(boolean systemLubrication) {
        this.systemLubrication = systemLubrication;
    }

    protected boolean isSystemSupply() {
        return systemSupply;
    }

    protected void setSystemSupply(boolean systemSupply) {
        this.systemSupply = systemSupply;
    }

    protected boolean isSystemIgnition() {
        return systemIgnition;
    }

    protected void setSystemIgnition(boolean systemIgnition) {
        this.systemIgnition = systemIgnition;
    }

    protected boolean isSystemStarting() {
        return systemStarting;
    }

    protected void setSystemStarting(boolean systemStarting) {
        this.systemStarting = systemStarting;
    }

    @Override
    protected Engine clone() {
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
