package HomeWork8;

public class Taxiservis {
    private Driver[]drivers;
    private Operator[]operators;
    private int countDriver;
    private int countoperator;

    public Taxiservis() {
        this.drivers = null;
        this.operators = null;
        this.countDriver = 0;
        this.countoperator = 0;
    }

    public Taxiservis(Driver[] drivers, Operator[] operators, int countDriver, int countoperator) {
        this.drivers = drivers;
        this.operators = operators;
        this.countDriver = countDriver;
        this.countoperator = countoperator;
    }


    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    public Operator[] getOperators() {
        return operators;
    }

    public void setOperators(Operator[] operators) {
        this.operators = operators;
    }

    public int getCountDriver() {
        return countDriver;
    }

    public void setCountDriver(int countDriver) {
        this.countDriver = countDriver;
    }

    public int getCountoperator() {
        return countoperator;
    }

    public void setCountoperator(int countoperator) {
        this.countoperator = countoperator;
    }
}
