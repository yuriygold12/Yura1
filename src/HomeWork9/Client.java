package HomeWork9;

import java.util.Objects;

public class Client extends Person{
    private int numberPhone;
    private String addres;


    public Client()
    {
        super();
        this.numberPhone = 0636345;
        this.addres = "trylovskoho";
    }

    public Client(String name, String surname, int numberPhone, String addres) {
        super(name, surname);
        this.numberPhone = numberPhone;
        this.addres = addres;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void showinfo()
    {
        super.showinfo();
        System.out.println("Номер телефону: "+numberPhone);
        System.out.println("Address: "+addres);
    }


    @Override
    public String toString() {
        return "Client: " + super.toString() + "  numberPhone=" + numberPhone + "  addres='" + addres+"\t";

    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return numberPhone == client.numberPhone &&
                Objects.equals(addres, client.addres);
    }
    */

    public boolean equals(Object o)
    {
       // if(this == o)return true;
        Client cli = (Client) o;
        if(!super.equals(cli)){return false;}
        if(this.numberPhone == cli.numberPhone && this.addres == cli.addres) { return true; }
        if(this.numberPhone != cli.numberPhone || this.addres != cli.addres) { return false; }
        else { return false; }
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPhone, addres);
    }
}
