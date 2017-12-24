package HomeWork5;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;


    public void setName() {
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Please willhold: ");
        this.name = ob1.next();
        this.name = name;
    }

    public void setSurname() {
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Please willhold: ");
        this.name = ob1.next();
        this.surname = ob1.next();
    }


}
