package HomeWork9;

import java.time.LocalDate;

public class Company {

    private String NameCompany;
    private LocalDate datadateoffoundation;

    public Company() {
        NameCompany = "Taxiservice";
        datadateoffoundation = LocalDate.now();
    }

    public Company(String nameCompany, LocalDate datadateoffoundation) {
        NameCompany = nameCompany;
        this.datadateoffoundation = datadateoffoundation;
    }


    public String getNameCompany() {
        return NameCompany;
    }

    public void setNameCompany(String nameCompany) {
        NameCompany = nameCompany;
    }

    public LocalDate getDatadateoffoundation() {
        return datadateoffoundation;
    }

    public void setDatadateoffoundation(LocalDate datadateoffoundation) {
        this.datadateoffoundation = datadateoffoundation;
    }


    public void ChangeNameCompany(String name)
    {
        this.NameCompany = name;
    }

    public void showinfo()
    {
        System.out.println("Імя компанії: "+NameCompany);
        System.out.println("Дата : "+datadateoffoundation);
    }

    @Override
    public String toString() {
        return "Company{" +
                "NameCompany='" + NameCompany + '\'' +
                ", datadateoffoundation=" + datadateoffoundation +
                '}';
    }
}
