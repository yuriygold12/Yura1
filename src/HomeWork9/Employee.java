package HomeWork9;

import java.time.LocalDate;

public class Employee extends Person{
    private int id;
    private double salary;
    private LocalDate hiredate;
    private String phonenumber;

    public Employee() {
        super();
        this.id = 0;
        this.salary = 12;
        this.hiredate = LocalDate.now();
        this.phonenumber = "0636345831";
    }


    public Employee(String name, String surname, int id, double salary, LocalDate hiredate, String phonenumber)
    {
        super(name, surname);
        this.id = id;
        this.salary = salary;
        this.hiredate = hiredate;
        this.phonenumber = phonenumber;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
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

    public void incrisesalary(int procent)
    {
        double tmpsalsasry = getSalary() + getSalary() * procent;
        setSalary(tmpsalsasry);
    }


    public void EmployyeShow()
    {
        System.out.println("Name: "+ getName());
        System.out.println("Surname : "+ getSurname());
        System.out.println("id: "+ id);
        System.out.println("salery" + salary );
        System.out.println("hiredate" + hiredate);
        System.out.println("phone number" + phonenumber);
    }
}
