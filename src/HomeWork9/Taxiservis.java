package HomeWork9;

import java.util.ArrayList;

public class Taxiservis {
    private ArrayList <Driver> drivers;
    private ArrayList <Operator> operators;
    private int countDriver;
    private int countoperator;

    public Taxiservis() {
        this.drivers = new ArrayList<>();
        this.operators = new ArrayList<>();
        this.countDriver = 0;
        this.countoperator = 0;
    }

    public Taxiservis(ArrayList<Driver> drivers, ArrayList<Operator> operators, int countDriver, int countoperator) {
        this.drivers = new ArrayList<>(drivers);
        this.operators = new ArrayList<>(operators);
        this.countDriver = countDriver;
        this.countoperator = countoperator;
    }


    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Operator> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<Operator> operators) {
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

    public void showinfo()
    {
        System.out.println("Drivers : "+drivers);
        System.out.println("Operators : "+operators);
        System.out.println("count drivers: "+countDriver);
        System.out.println("countoperatoriv"+countoperator);
    }
}
