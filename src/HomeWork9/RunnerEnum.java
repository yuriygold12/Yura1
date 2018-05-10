package HomeWork9;

import java.time.LocalDate;


public class RunnerEnum {


    public static void main(String[] args) {
        Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(), "1",

                new Car(1,"Opel","Vectra",Color.red), 1);

        Driver tdl2 = new Driver("Tolik","Baday",1200,14,LocalDate.now(),"2",
                new Car(2,"Mersedes","Bens",Color.green),2);


        Driver tdl3 = new Driver("Vitja","bayda",2400,14, LocalDate.now(),"3",
                new Car(3,"Audi","T4",Color.yellow),3);

        //ArrayList<Person> per = new ArrayList<>();
        //Employee emp = new Employee("Oben","kavasaki",12,12.44
               // ,LocalDate.now(),"0872342");


        //per.add(td1);
       // per.add(tdl2);
        //per.add(tdl3);

        //for (Person empl : per) {
           // System.out.println("");
          //  empl.showinfo();
          //  System.out.println("");
       //}

        tdl2.showinfo();
        td1.showinfo();
        tdl3.showinfo();
        Color color2;


        for(Color a: Color.values())
        {
            System.out.println(" Номер константи: "+a.ordinal()+"   Назва константи: "+a);
        }
        System.out.println(Color.valueOf("yellow"));
    }
}



