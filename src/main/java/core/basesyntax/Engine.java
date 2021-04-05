package core.basesyntax;

public class Engine implements Cloneable {
    private boolean crankshaft;
    private boolean cylinderHead;
    private boolean camshaft;
    private boolean valves;
    private boolean oilPan;

    public Engine(boolean crankshaft, boolean cylinderHead,
                  boolean camshaft, boolean valves, boolean oilPan) {
        this.crankshaft = crankshaft;
        this.cylinderHead = cylinderHead;
        this.camshaft = camshaft;
        this.valves = valves;
        this.oilPan = oilPan;
    }

    public void setCrankshaft(boolean crankshaft) {
        this.crankshaft = crankshaft;
    }

    @Override
    public Engine clone() {
        return new Engine(crankshaft, cylinderHead,
                camshaft, valves, oilPan);
    }

    @Override
    public String toString() {
        return "Engine{crankshaft='" + crankshaft + '\'' + ", cylinderHead='" + cylinderHead
                + '\'' + ", camshaft='" + camshaft + '\'' + ", valves='" + valves
                + '\'' + ", oilPan='" + oilPan + '\'' + '}';
    }
}
