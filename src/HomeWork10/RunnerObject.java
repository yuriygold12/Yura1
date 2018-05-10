//package HomeWork10;
//import HomeWork9.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

/*public class RunnerObject {
    public static void main(String[]args) {
        //Client cli = new Client("Olesja","olesivna",12,"Antonucja") ;
       // Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(), "1",
                //new Car(1,"Opel","Vectra","Biluy"), 1);

       // Client cl = new Client();

        //System.out.println(cli.toString());

       // System.out.println(td1.toString());

       // System.out.println(cli.equals(cl));

        Object[] per = {cli,td1};
       // for (int i = 0; i < per.length ; i++) {
        //    System.out.println(per[i].toString());
        //}

        //per[i].equals(td1);
        //System.out.println(cli.toString());
        // System.out.println(td1.toString());

        ArrayList<Employee> staff = new ArrayList<>();


        Client cli = new Client("Olesja","olesivna",12,"Antonucja") ;

        Client cli1 = new Client("Stanja","colosok",14,"Antonucja") ;

        Client cli2 = new Client("Olesja","olesivna",12,"Antonucja") ;


        Driver td1 = new Driver("Orest", "Malonovic", 5000, 15, LocalDate.now(), "1",

                new Car(1,"Opel","Vectra","Biluy"), 1);

        Driver tdl2 = new Driver("Tolik","Baday",1200,14,LocalDate.now(),"2",
                new Car(2,"Opel","Vectra","Biluy"),2);


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
                "0634", Tax, 3, LocalDate.now(), 3);


        Operator op1 = new Operator("Tolik","Juranuc",12,14,LocalDate.now(),
                "0634",Tax,3,LocalDate.now(),1);

        Operator op2 = new Operator("Gora","Polickuy",12,14,LocalDate.now(),
                "0634",Tax,3,LocalDate.now(),3);


        ArrayList<Person> per = new ArrayList<>();
        Employee emp = new Employee("Oben","kavasaki",12,12.44
                ,LocalDate.now(),"0872342");
        Employee emp1 = new Employee("Obe4345","kavasaki",12,12.44
                ,LocalDate.now(),"0872342");
        per.add(td1);
        per.add(tdl2);
        per.add(tdl3);
        per.add(cli);
        per.add(cli1);
        per.add(op);
        per.add(op1);
        per.add(emp);



        System.out.println(op.equals(op2));

        System.out.println("hesh cod == "+op.hashCode());
        System.out.println("hesh cod == "+op.hashCode());
        System.out.println("hesh cod == "+op1.hashCode());


















/////////////////////////////////////////////////////////////////////////////////////////////////////
        /*Apple ap;
        ap = Apple.Cortland;
        System.out.println("Apple : "+ ap );
        System.out.println();

        if(ap == Apple.Goldendel)
        {
            System.out.println("Apple soderwitj ");
        }
        else
        {
            System.out.println("Ne rivne");
        }


        switch (ap)
        {
            case Cortland:
                System.out.println("Jabloko Cortoland Cervone");
                break;
            case Jonatan:
                System.out.println("Jabluco jonatan wovte");
                break;
            case Goldendel:
                System.out.println("Jabluko suney");
                break;

        }

        Apple ap1[] = Apple.values();
        for(Apple a: ap1)
        {
            System.out.println("Vuvid :" + a);
        }

        Apple ob;
        ob = Apple.valueOf("Goldendel");
        System.out.println("Povernennja: "+ob);
       */
        //Apple ap;
        // System.out.println("Winesar kowtye : "+Apple.Winesap.getPrice());
        //System.out.println("Vsi koloru jabluk ");

        //for(Apple i : Apple.values())
        // {
        //     System.out.println(i + "  kowtye: "+ i.getPrice()+ "  dolariv");
        // }


        //final int a = Apple.Winesap.ordinal();
        // System.out.println("Порядковий номер == "+ a );

        // final int a1 = Apple.Winesap.compareTo(Apple.Winesap);
        //  System.out.println("porivnjnnja "+ a1);

        /*Character ob = new Character('s');
        char e = ob.charValue();
        System.out.println("Вивід символа  " + e);

        Boolean bol = new Boolean(true);

        boolean z = bol.booleanValue();
        System.out.println("sNACENNJA BOOLEAN == " + z);

        Boolean ob1 = new Boolean("True");
        boolean z1 = ob1.booleanValue();
        System.out.println("Boolean == " + z1);

        Integer ob2 = new Integer(100);

        int i = ob2.intValue();
        System.out.println("Vuvid : " + i);


        Double Ob3 = new Double(12.33);

        double s = Ob3.doubleValue();

        System.out.println("Vuvid : " + s);

        Integer obo = 120;

        int i1 = obo;

        System.out.println("Cvcvc == "+ i1);
     */


        /*
        ArrayList<String> ob = new ArrayList<String>();

        System.out.println("Pocatkovauy erey list: "+ob.size());

        ob.add("a");
        ob.add("b");
        ob.add("c");
        ob.add("d");
        ob.add("e");
        ob.add("f");

        System.out.println("Piclja vstavku: " + ob.size());

        System.out.println("vUVID MASUV SPUSOK: "+ ob);

        ob.remove("a");

        ob.remove(2);
        System.out.println(": "+ ob.size());

        System.out.println("vUVID MASUV SPUSOK: "+ ob);
        */

        /*
        ArrayList <String> ob1;
        ob1 = new ArrayList<String>();

        ob1.ensureCapacity(12);

        System.out.println("Vuvid : "+ob1.size());

        ob1.trimToSize();

        ob1.add("1");

        ob1.add("2");

        ob1.add("3");

        ob1.add("4");

        ob1.add(1,"baba");

        ob1.ensureCapacity(ob1.size()-1);


    }
}


*/