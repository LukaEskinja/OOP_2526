package pckg_uml_abs;

public class Driver {
    protected String driverName;

    public Driver(String name) {
        this.driverName = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}
