package HomeWork5;

import java.time.LocalDate;
import java.util.Scanner;

public class Paiment {
    private static int nextid = 1;
    private int numbercart;
    private int id;
    private LocalDate datepaiment;

    public Paiment() {
        setId();
    }

    public Paiment(int numbercart,  LocalDate datepaiment) {
        setId();
        this.numbercart = numbercart;

        this.datepaiment = datepaiment;
    }

    private void setId() {
        this.id = nextid;
        nextid++;
    }

    public static int getId() {
        return nextid;
    }

    public void setNumbercart() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Please name: ");

    }
}
