package HomeWork8;

public class Client extends Person {
    private int numberPhone;
    private String addres;


    public Client() {
        this.numberPhone = 0636345;
        this.addres = "trylovskoho";
    }

    public Client(int numberPhone, String addres) {
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
}
