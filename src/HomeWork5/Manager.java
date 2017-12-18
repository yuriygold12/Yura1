package HomeWork5;

public class Manager extends Person {
   private Paiment paiment;


    public Manager(String name, String surname, Paiment paiment) {
        super(name, surname);
        this.paiment = paiment;
    }
}
