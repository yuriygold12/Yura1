package HomeWork9;

import java.time.LocalDate;
import java.util.ArrayList;

public class RunnerPolimorfism {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();


        Client cli = new Client("Olesja","olesivna",12,"Antonucja") ;

        Client cli1 = new Client("Stanja","colosok",14,"Antonucja") ;

        Client cli2 = new Client("Olesja","olesivna",12,"Antonucja") ;


        Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(), "1",

                new Car(1,"Opel","Vectra","Biluy"), 1);

        Driver tdl2 = new Driver("Tolik","Baday",1200,14,LocalDate.now(),"2",
                new Car(2,"Mersedes","Bens","yellow"),2);


        Driver tdl3 = new Driver("Vitja","bayda",2400,14, LocalDate.now(),"3",
                new Car(3,"Audi","T4","Blu"),3);



        Taxiorder or = new Taxiorder(1,cli,1,"trylovskoho","Antonuca",
                new Payment(12,LocalDate.now()),td1);


        Taxiorder or1 = new Taxiorder(2,cli,2,"antonuca","trylovskoho",
                new Payment(24,LocalDate.now()),tdl2);


        Taxiorder or2 = new Taxiorder(3,cli,3,"gorodocjka","Promuslova",
                new Payment(36,LocalDate.now()),tdl3);

        ArrayList <Taxiorder> Tax = new ArrayList<>();

        Tax.add(or);
        Tax.add(or1);
        Tax.add(or2);


        Operator op = new Operator("Yura", "Bahlay", 12, 14, LocalDate.now(),
                "0634", Tax, 3, LocalDate.now(), 1);


        Operator op1 = new Operator("Tolik","Juranuc",24,134.3,LocalDate.now(),
                "063424242",Tax,3,LocalDate.now(),2);

        Operator op2 = new Operator("Gora","Polickuy",36,13.3,LocalDate.now(),
                "06341213",Tax,3,LocalDate.now(),3);


        //staff.add(tdl2);
        //staff.add(op);


        /*for (Employee empl : staff) {
            //empl.incrisesalary(20);
            System.out.println("");
            empl.showinfo();
        }*/


            ArrayList<Person> per = new ArrayList<>();
            Employee emp = new Employee("Oben","kavasaki",12,12.44
                    ,LocalDate.now(),"0872342");

        per.add(td1);
        per.add(tdl2);
        per.add(tdl3);
        per.add(cli);
        per.add(cli1);
        per.add(op);
        per.add(op1);
        per.add(emp);



        for (Person empl : per) {
            System.out.println("");
            empl.showinfo();
        }
    }
}
