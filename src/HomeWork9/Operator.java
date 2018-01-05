package HomeWork9;

import java.time.LocalDate;

public class Operator extends Employee{
    private Taxiorder[] taxiOrders;
    private int countOrder;
    private LocalDate dateofOrder;
    private int workplacenuber;

    public Operator() {
        this.taxiOrders = null;
        this.countOrder = 0;
        this.dateofOrder = LocalDate.now();
        this.workplacenuber = 6;
    }

    public Operator(String name, String surname, int id, double salary, LocalDate hiredate, String phonenumber,
                    Taxiorder[] taxiOrders, int countOrder, LocalDate dateofOrder, int workplacenuber) {
        super(name, surname, id, salary, hiredate, phonenumber);
        this.taxiOrders = taxiOrders;
        this.countOrder = countOrder;
        this.dateofOrder = dateofOrder;
        this.workplacenuber = workplacenuber;
    }


    public Taxiorder[] getTaxiOrders() {
        return taxiOrders;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public LocalDate getDateofOrder() {
        return dateofOrder;
    }

    public int getWorkplacenuber() {
        return workplacenuber;
    }

    public void setTaxiOrders(Taxiorder[] taxiOrders) {
        this.taxiOrders = taxiOrders;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setDateofOrder(LocalDate dateofOrder) {
        this.dateofOrder = dateofOrder;
    }

    public void setWorkplacenuber(int workplacenuber) {
        this.workplacenuber = workplacenuber;
    }
}
