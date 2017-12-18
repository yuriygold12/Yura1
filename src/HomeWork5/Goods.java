package HomeWork5;

import java.util.Scanner;

public class Goods{
   private String name;
   private String willhold;

    public Goods(String name, String willhold) {
        this.name = name;
        this.willhold = willhold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Please name: ");
        this.name = ob.next();
    }

    public void setWillhold(String willhold) {
        this.willhold = willhold;
    }

    public void setWillhold() {
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Please willhold: ");
        this.name = ob1.next();
    }
}
