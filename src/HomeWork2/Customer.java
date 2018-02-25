package HomeWork2;

public class Customer {
    String name;
    String surname;
    String email;
    String addresaProwuvnnja;
    long numbertelefon;
    public Customer(String name, String surname, String email, String addresaProwuvnnja, long numbertelefon) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.addresaProwuvnnja = addresaProwuvnnja;
        this.numbertelefon = numbertelefon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddresaProwuvnnja() {
        return addresaProwuvnnja;
    }

    public void setAddresaProwuvnnja(String addresaProwuvnnja) {
        this.addresaProwuvnnja = addresaProwuvnnja;
    }

    public long getNumbertelefon() {
        return numbertelefon;
    }

    public void setNumbertelefon(long numbertelefon) {
        if(numbertelefon < 0 || numbertelefon > 100000000 )
        {
            System.out.println("no mob telefon");
        }
        else
        {
            this.numbertelefon = numbertelefon;
        }
    }

    public void ShowInfo()
    {
        System.out.println("name == "+name+ "  surname == "+surname+ "  Age: == "+email+"  Local_day == "+
                " Adresa prowuvannja"+addresaProwuvnnja+"  numbertelefon"+numbertelefon);
    }
}
