package HomeWork5;

public class Courier extends Person{
   private Paiment paiment;


    public Courier(String name, String surname, Paiment paiment) {
        super(name, surname);
        this.paiment = paiment;
    }

    public void setPaiment(Paiment paiment) {
        this.paiment = paiment;
    }

    public void setPaiment() {
        this.paiment = paiment;
    }
}
