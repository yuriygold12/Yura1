package HomeWork9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Operator extends Employee{
    private ArrayList <Taxiorder> taxiOrders;
    private int countOrder;
    private LocalDate dateofOrder;
    private int workplacenuber;

    public Operator() {
        this.taxiOrders = new ArrayList<>();
        this.countOrder = 0;
        this.dateofOrder = LocalDate.now();
        this.workplacenuber = 6;
    }

    public Operator(String name, String surname, int id, double salary, LocalDate hiredate, String phonenumber,
                    ArrayList <Taxiorder> taxiOrders, int countOrder, LocalDate dateofOrder, int workplacenuber) {
        super(name, surname, id, salary, hiredate, phonenumber);
        this.taxiOrders = new ArrayList<>(taxiOrders);
        this.countOrder = countOrder;
        this.dateofOrder = dateofOrder;
        this.workplacenuber = workplacenuber;
    }


    public ArrayList <Taxiorder> getTaxiOrders() {
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

    public void setTaxiOrders(ArrayList <Taxiorder> taxiOrders) {
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

    public void incrisesalary(int procent)
    {
        double tmpsalsasry = getSalary() + getSalary() * procent*1.5;
        setSalary(tmpsalsasry);
    }

    public void showinfo()
    {
        super.showinfo();
        System.out.println("Кількість замовлень рівна: "+countOrder);
        System.out.println("Дата замвлення: "+dateofOrder);
        System.out.println("Номер робочого місця:" +workplacenuber);
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString()+"Operator{" + "taxiOrders=" + taxiOrders + ", countOrder=" + countOrder +
                ", dateofOrder=" + dateofOrder + ", workplacenuber=" + workplacenuber + '}';
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Operator operator = (Operator) o;
        return countOrder == operator.countOrder &&
                workplacenuber == operator.workplacenuber &&
                Objects.equals(taxiOrders, operator.taxiOrders) &&
                Objects.equals(dateofOrder, operator.dateofOrder);
    }
    */

    public boolean equals(Object o)
    {
       // if(this  ==  o){return true;}
        Operator op = (Operator) o;
       // if(!super.equals(o)){return false;}
        if(this.taxiOrders == op.taxiOrders && this.countOrder == op.countOrder
                && this.workplacenuber == op.workplacenuber && this.dateofOrder == op.dateofOrder
                &&this.getId() == op.getId() && this.getSalary() == op.getSalary() && this.getHiredate() == op.getHiredate()
                && this.getPhonenumber() == op.getPhonenumber() && this.getName() == op.getName() && this.getSurname() == op.getSurname()){return true;}

        if(this.taxiOrders != op.taxiOrders || this.countOrder != op.countOrder || this.workplacenuber != op.workplacenuber
                || this.dateofOrder != op.dateofOrder || this.getId() != op.getId() || this.getSalary() != op.getSalary()
                || this.getHiredate() != op.getHiredate() ){return false;}
        else{return false;}
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taxiOrders, countOrder, dateofOrder, workplacenuber);
    }
}
