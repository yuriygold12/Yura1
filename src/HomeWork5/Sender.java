package HomeWork5;

import java.util.Scanner;

public class Sender extends Person {
    private int phomenumber;
    private Goods[] goods;

    public Sender(String name, String surname, int phomenumber, Goods[] goods) {
        super(name, surname);
        this.phomenumber = phomenumber;
        this.goods = goods;
    }

    public void setPhomenumber(int phomenumber) {
        this.phomenumber = phomenumber;
    }
}




