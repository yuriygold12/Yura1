package HomeWork9;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person{
    private static int nextID = 1;
    private int id;
    private double salary;
    private LocalDate hiredate;
    private String phonenumber;

    public Employee() {
        super();
        setId();
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

    public Employee(String name, String surname, String phonenumber) {
        super(name, surname);
        setId();
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

    public void setId()
    {
        this.id = nextID;
        nextID++;
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


    public void showinfo()
    {
        super.showinfo();
        System.out.println("id: "+ id);
        System.out.println("salery" + salary );
        System.out.println("hiredate" + hiredate);
        System.out.println("phone number" + phonenumber);
    }

    @Override
    public String toString() {
        return super.toString()+"  Employee{" + "id=" + id + ", salary=" + salary + ", hiredate="
                + hiredate + ", phonenumber='" + phonenumber + '\'' + '}';
    }


   /* @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(hiredate, employee.hiredate) &&
                Objects.equals(phonenumber, employee.phonenumber);
    }
*/

    public boolean equals(Object o)
    {
      //  if(this == o){return true;}
        Employee emp = (Employee)o;
        if(!super.equals(o)){return false;}
        if(this.id == emp.id && this.salary == emp.salary && this.hiredate == emp.hiredate
                && this.phonenumber == emp.phonenumber){return true;}
        if(this.id != emp.id || this.salary != emp.salary || this.hiredate != emp.hiredate
                || this.phonenumber != emp.phonenumber){return false;}
                else{return false;}
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, salary, hiredate, phonenumber);
    }
}
