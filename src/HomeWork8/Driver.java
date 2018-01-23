package HomeWork8;
import javax.sound.midi.Soundbank;

//import javax.xml.bind.SchemaOutputResolver;

import java.time.LocalDate;
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


    public void DriverShow() {
        System.out.println();
        EmployyeShow();
        System.out.println();
        System.out.println("Вивід Сar");
        System.out.println("Номер авто: " + car.getNumberofSteatsthecar());
        System.out.println("Марка авто: " + car.getMarka());
        System.out.println("Модель авто: " + car.getModel());
        System.out.println("Колір авто: " + car.getColor());
        System.out.println("Скільки працює" + howitworks);
    }

}
