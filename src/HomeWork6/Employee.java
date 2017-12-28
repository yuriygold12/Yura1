package HomeWork6;

import java.time.LocalDate;

public class Employee extends Person{
    private  int id;
    private double salary;
    private LocalDate hiredate;
    private String phonenumber;

    public Employee() {
        super();
        this.id = 0;
        this.salary = 0;
        this.hiredate = LocalDate.now();
        this.phonenumber = "068";
    }


    public Employee(String name, String surname, int id, double salary, LocalDate hiredate, String phonenumber) {
        super(name, surname);
        this.id = id;
        this.salary = salary;
        this.hiredate = hiredate;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void increaseSalary(int percent){
        double tempValue = getSalary()+getSalary()*percent;
        setSalary(tempValue);
    }
}
