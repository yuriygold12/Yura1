package HomeWork9;

import java.time.LocalDate;
import java.util.Objects;

public class Driver extends Employee {
    private Car car;
    private int howitworks;

    public Driver() {
        super();
        this.car = null;
        this.howitworks = 12;
    }

    public Driver(String name, String surname, int id, double salary, LocalDate hiredate,
                  String phonenumber, Car car, int howitworks) {
        super(name, surname, id, salary, hiredate, phonenumber);
        this.car = car;
        this.howitworks = howitworks;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setHowitworks(int howitworks) {
        this.howitworks = howitworks;
    }

    public Car getCar() {
        return car;
    }

    public int getHowitworks() {
        return howitworks;
    }

    public void getHours() {
        System.out.println("Driver works : " + howitworks);
    }


    public void showinfo()
    {
        super.showinfo();
        System.out.println("");
        car.ShowCar();
        System.out.println("Вивід авто == "+howitworks);
    }


    @Override
    public String toString() {
        return super.toString() + "  Driver{" + "car=" + car.toString() + ",  howitworks=" + howitworks + '}';
    }


   /*@Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return howitworks == driver.howitworks &&
                Objects.equals(car, driver.car);
    }

   */

    public boolean equals(Object o)
    {
       // if(this == o)return true;
        Driver ob = (Driver)o;
        if(!super.equals(o)){return false;}
        if(this.howitworks == ob.howitworks && this.car == ob.car ){return true;}
        if(this.howitworks != ob.howitworks || this.car != ob.car ){return false;}
        else { return false; }
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), car, howitworks);
    }
}
