package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String powerSystem;
    private String environmentStandarts;
    private int capacity;
    private int yearOfIssue;

    public Engine(String type, String powerSystem, String environmentStandarts,
                  int capacity, int yearOfIssue) {
        this.type = type;
        this.powerSystem = powerSystem;
        this.environmentStandarts = environmentStandarts;
        this.capacity = capacity;
        this.yearOfIssue = yearOfIssue;
    }

    protected Engine clone() {
        return new Engine(type, powerSystem, environmentStandarts, capacity, yearOfIssue);
    }
}
