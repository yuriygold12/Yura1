package HomeWork6;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
       /* Person person;
        Client cl = new Client();
        Operator op = new Operator();
        Driver dr = new Driver();

        person = cl;

        person = op;

        Employee[] employees = new Employee[4];

        employees[0] = op;
        employees[1] = dr;
        employees[2] = dr;
        employees[3] = op;

        for (int i = 0; i <employees.length ; i++) {
            System.out.println("Name ->"+employees[i].getName());
        }

        for(Employee staff: employees){
            System.out.println("Name ->"+staff.getName());

            if(staff instanceof Operator){
                staff.increaseSalary(20);
            }

            if(staff instanceof Driver){
                staff.increaseSalary(10);
            }


        }*/

       Employee em = new Employee("NAzar", "Mh", 1, 10000, LocalDate.now(),"068");





    }
}
